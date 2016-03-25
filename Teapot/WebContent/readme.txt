这是使用说明，这是使用说明，这是使用说明。算是说明文档吧

（姓名:ZBQ 学号：2013312270）

以防自己没测试完的部分编着编着忘了……以下是各个class里面都有什么样的函数
//Dao与bll全部完成
//servlet、显示完成





Dao层：

userDao:
{
insert：//用于注册，自带查询重名，如果email重复不允许注册
query：//输入邮箱与密码，返回唯一用户
updateBasicById：//按照userId更新基本信息,昵称、电话、姓名
updatePasswordById://按照userId更新密码
getNickNameById//根据userId返回用户昵称
}
所以，对用户表操作实现的功能：1.注册；2.登陆；3.更新用户基本信息；4.修改密码





ProductDao:用于对商品与分类的管理与查询
{各种方法：
new1stCategory://设置新的第一级分类
new2ndCategory://设置新的第二级分类
insertProduct：//往productlist插入一个商品
insertProductSpec://插入商品花色、容量……的具体分类产品用
checkStock：//按specID查库存
stockDecrease：//减库存
stockIncrease：//加库存
queryProductByCategory://获取一个第二类别全部商品的列表(列表里塞product类)~显示某一类全部商品用（每种商品（n个不同花色算n种商品）只留第一个）
queryProductById：//通过productId获取一个商品所有花色、容量……的分类产品列表，用于一个商品的显示页面
updateProductSpec//更新种类
updateProduct//更新商品
ProductSearch//模糊查询，搜索框专用
getSpecProductBySpecId//按种类获取商品
showFirstCategory//返回所有第一分类
showSecondCategory//按第一分类返回所有第二分类
showProductListByCategory//按第二分类返回商品
}
所以对产品实现的功能：1.设置新的第一级分类（没用到）2.设置新的第二级分类（同没用到）
3.新建产品 4.新建产品分类 5.查看库存 6.进货 7.出货（有人下了订单会调用，减少库存）
8.获取某一二级分类展示用商品（一种品名，n个品种是n种商品，但只显示1种，用于展示分类下全部商品）
9.更新种类（例：一个商品下的不同花色）10.更新商品（品名，描述等）11.查询框-->查找商品（按品名、种类名（花色等）匹配）
12.展示同一产品所有种类（例：不同花色） 13.在管理员界面分类、商品级联，来查看、修改商品




OrderDao：用于对订单与评价的管理与查询
{newOrder//新建订单，自动填写日期、订单号等，从这里拿到主键orderId//总价是在购物车里算好了的
newOrderItem//新建订单项，直接从确认了的购物车里搬，CartItem里面塞的product和count
getAllOrderItemByOrderId//获取某订单全部订单项，展示订单详情用
getAllOrderItemBySpecId//展示某一商品用
updateStatusById//更新某订单的订单状态
updateDeliveryCodeById//发货后更新运单号
updateFinishDateById//订单结束时更新时间，自动填写时间
updateStarsById//用户更新打分，按订单号查询，全五星哦亲
getOrderByUser//给用户展示自己所有订单用
getOrderById//返回唯一订单
getOrderByStatus//按订单状态返回所有订单，卖家管理未发货订单等使用
updateCommentById//买家评价（对每个订单项评价，id为订单项的id）
getAllCommented//获得全部已评价的订单
getCommentBySpec//获取某种商品全部评价
}
实现的功能：1.创建订单，订单项  2.展示订单与订单项 3.管理员更新某订单状态，运单号等信息 
4.用户对订单打分 5.用户对商品做出评价，可匿名评价



AddressDao：用于对用户收货地址的管理与查询
{
newAddress//用户添加新地址
getAddressByUser//用户显示自己全部的收货地址
updateAddressById//更新地址
getAddressById//按主键返回一个地址，处理订单用
deleteAddressById////按id删除收货地址，假的，其实是把show设成false了
}
实现的功能：对用户收货地址的增删改查
========================================================================

控制层Servlet们：

cart类别
cartServlet
{
功能：控制购物车的增删改查等
传值过去：
	{
	way:操作，{add:添加,changeAmount：更改某项购买数量,delete删除某项,clear清空,plus:加一,minus：减一}
	specId:商品种类号（product表主键），除了clear都需要传入
	amount:数量，对add是加多少，对changeAmount是改变为多少
	}
}
-----------------------------------------------------------------------
product类别
NewCategory
{
功能：新增产品分类
传值过去：
	{
	type:第几分类{first:第一级；second：第二级}
	categoryName：分类名称
	firstCategoryId：用于新增第二级分类
	}
}

ProductChange
{
功能：新增与更新产品、产品种类（花色、容量细分）
传值过去：
	{
	method:要进行什么操作{NP：新产品；NS：新分类；UP：更新产品；US：更新分类}
	对NP:productName,secondCategoryId,detail
	对NS:specName,productId,inventory,stock,price
	对UP:NP那些再加上productId
	对US:NS那些在加上specId
	}
}

QueryProduct
{
功能：各种方式的产品查询
传值过去：
	{
	way:怎么查{byCategory：按类（用于管理页面，ajax）；
				search:查询框，按关键词模糊查询；
				byId:根据产品ID查询所有细分（花色、容量）；
			getProduct,同byId但返回表格，用于ajax显示详情（管理使用）;
			byCate:按第二分类，用于给用户显示商品列表
			price:按specId返回价格,ajax配件
			stock:按specId返回库存,ajax配件
			}
	对byCategory:how{ajaxP(输出一个产品表格),ajaxO（输出用于放产品下拉框）}
	对search：searchLine（查询内容）
	对byId:productId
	对getProduct:productId
	对byCate:secId
	对price\stock:specId
	}
}

Show1stCategory,Show2ndCategory:显示分类使用（ajax,联动下拉框）

StockChange
{
功能：库存管理，目前仅用于进货，因为生成订单的时候把库存减少给集成了
传参：way:in；amount;specId
}

---------------------------------------------------------------------------------

user类别

UserLogin
{
功能：用户登录
传参：email,password
通过则把信息封入User类，塞进session,否则返回登录页面并进行提示
}

登出直接写的jsp...觉得配servlet的xml太麻烦→_→

UserRegister
{
功能：用户注册,自动检测email是否已被注册，如果没有，进行注册并回到login页面；如果有，返回注册页面并提示
nickName，password,password2(重复密码),fullName,gender,email,mobile,role
}

AddressServlet
{
功能：用户地址的增删改
传参：way{new:新建；update:更新；delete:删除（把see改成0）}
}

UserSettings
{
功能：用户基本信息修改、密码修改
传参：change{basic：基础信息修改;password：密码修改，需验证旧密码}
}

---------------------------------------------------------------------------------

order类别

NewOrder
{
功能：从session中调取调整好的Cart,更具它创建一个订单；
先创建订单，根据Cart自动填写时间、总价，然后根据Cart创建订单项，自动减少库存
}

ShowOrder
{
功能：展示订单
}

NewComment
{
功能：用于评价订单，几星？每样商品的评论，是否匿名等
用法：每样商品评论ajax提交，最后订单星级提交后跳转至用户订单页面
}

UpdateOrderStatus
{
功能：管理订单，更新订单状态、运单号……订单状态更新为已付款后自动更新订单结束时间
}

=====================================================================================================
JSP:myShop.jsp是主页
productManageMent.jsp;productManageMent2.jsp;orderManageMent.jsp是管理员、销售员专用，普通用户无法进入

（管理员账号：betty352008@yeah.net, 密码：123456）
