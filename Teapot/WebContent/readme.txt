����ʹ��˵��������ʹ��˵��������ʹ��˵��������˵���ĵ���

������:ZBQ ѧ�ţ�2013312270��

�Է��Լ�û������Ĳ��ֱ��ű������ˡ��������Ǹ���class���涼��ʲô���ĺ���
//Dao��bllȫ�����
//servlet����ʾ���





Dao�㣺

userDao:
{
insert��//����ע�ᣬ�Դ���ѯ���������email�ظ�������ע��
query��//�������������룬����Ψһ�û�
updateBasicById��//����userId���»�����Ϣ,�ǳơ��绰������
updatePasswordById://����userId��������
getNickNameById//����userId�����û��ǳ�
}
���ԣ����û������ʵ�ֵĹ��ܣ�1.ע�᣻2.��½��3.�����û�������Ϣ��4.�޸�����





ProductDao:���ڶ���Ʒ�����Ĺ������ѯ
{���ַ�����
new1stCategory://�����µĵ�һ������
new2ndCategory://�����µĵڶ�������
insertProduct��//��productlist����һ����Ʒ
insertProductSpec://������Ʒ��ɫ�����������ľ�������Ʒ��
checkStock��//��specID����
stockDecrease��//�����
stockIncrease��//�ӿ��
queryProductByCategory://��ȡһ���ڶ����ȫ����Ʒ���б�(�б�����product��)~��ʾĳһ��ȫ����Ʒ�ã�ÿ����Ʒ��n����ͬ��ɫ��n����Ʒ��ֻ����һ����
queryProductById��//ͨ��productId��ȡһ����Ʒ���л�ɫ�����������ķ����Ʒ�б�����һ����Ʒ����ʾҳ��
updateProductSpec//��������
updateProduct//������Ʒ
ProductSearch//ģ����ѯ��������ר��
getSpecProductBySpecId//�������ȡ��Ʒ
showFirstCategory//�������е�һ����
showSecondCategory//����һ���෵�����еڶ�����
showProductListByCategory//���ڶ����෵����Ʒ
}
���ԶԲ�Ʒʵ�ֵĹ��ܣ�1.�����µĵ�һ�����ࣨû�õ���2.�����µĵڶ������ࣨͬû�õ���
3.�½���Ʒ 4.�½���Ʒ���� 5.�鿴��� 6.���� 7.�������������˶�������ã����ٿ�棩
8.��ȡĳһ��������չʾ����Ʒ��һ��Ʒ����n��Ʒ����n����Ʒ����ֻ��ʾ1�֣�����չʾ������ȫ����Ʒ��
9.�������ࣨ����һ����Ʒ�µĲ�ͬ��ɫ��10.������Ʒ��Ʒ���������ȣ�11.��ѯ��-->������Ʒ����Ʒ��������������ɫ�ȣ�ƥ�䣩
12.չʾͬһ��Ʒ�������ࣨ������ͬ��ɫ�� 13.�ڹ���Ա������ࡢ��Ʒ���������鿴���޸���Ʒ




OrderDao�����ڶԶ��������۵Ĺ������ѯ
{newOrder//�½��������Զ���д���ڡ������ŵȣ��������õ�����orderId//�ܼ����ڹ��ﳵ������˵�
newOrderItem//�½������ֱ�Ӵ�ȷ���˵Ĺ��ﳵ��ᣬCartItem��������product��count
getAllOrderItemByOrderId//��ȡĳ����ȫ�������չʾ����������
getAllOrderItemBySpecId//չʾĳһ��Ʒ��
updateStatusById//����ĳ�����Ķ���״̬
updateDeliveryCodeById//����������˵���
updateFinishDateById//��������ʱ����ʱ�䣬�Զ���дʱ��
updateStarsById//�û����´�֣��������Ų�ѯ��ȫ����Ŷ��
getOrderByUser//���û�չʾ�Լ����ж�����
getOrderById//����Ψһ����
getOrderByStatus//������״̬�������ж��������ҹ���δ����������ʹ��
updateCommentById//������ۣ���ÿ�����������ۣ�idΪ�������id��
getAllCommented//���ȫ�������۵Ķ���
getCommentBySpec//��ȡĳ����Ʒȫ������
}
ʵ�ֵĹ��ܣ�1.����������������  2.չʾ�����붩���� 3.����Ա����ĳ����״̬���˵��ŵ���Ϣ 
4.�û��Զ������ 5.�û�����Ʒ�������ۣ�����������



AddressDao�����ڶ��û��ջ���ַ�Ĺ������ѯ
{
newAddress//�û�����µ�ַ
getAddressByUser//�û���ʾ�Լ�ȫ�����ջ���ַ
updateAddressById//���µ�ַ
getAddressById//����������һ����ַ����������
deleteAddressById////��idɾ���ջ���ַ���ٵģ���ʵ�ǰ�show���false��
}
ʵ�ֵĹ��ܣ����û��ջ���ַ����ɾ�Ĳ�
========================================================================

���Ʋ�Servlet�ǣ�

cart���
cartServlet
{
���ܣ����ƹ��ﳵ����ɾ�Ĳ��
��ֵ��ȥ��
	{
	way:������{add:���,changeAmount������ĳ�������,deleteɾ��ĳ��,clear���,plus:��һ,minus����һ}
	specId:��Ʒ����ţ�product��������������clear����Ҫ����
	amount:��������add�ǼӶ��٣���changeAmount�Ǹı�Ϊ����
	}
}
-----------------------------------------------------------------------
product���
NewCategory
{
���ܣ�������Ʒ����
��ֵ��ȥ��
	{
	type:�ڼ�����{first:��һ����second���ڶ���}
	categoryName����������
	firstCategoryId�����������ڶ�������
	}
}

ProductChange
{
���ܣ���������²�Ʒ����Ʒ���ࣨ��ɫ������ϸ�֣�
��ֵ��ȥ��
	{
	method:Ҫ����ʲô����{NP���²�Ʒ��NS���·��ࣻUP�����²�Ʒ��US�����·���}
	��NP:productName,secondCategoryId,detail
	��NS:specName,productId,inventory,stock,price
	��UP:NP��Щ�ټ���productId
	��US:NS��Щ�ڼ���specId
	}
}

QueryProduct
{
���ܣ����ַ�ʽ�Ĳ�Ʒ��ѯ
��ֵ��ȥ��
	{
	way:��ô��{byCategory�����ࣨ���ڹ���ҳ�棬ajax����
				search:��ѯ�򣬰��ؼ���ģ����ѯ��
				byId:���ݲ�ƷID��ѯ����ϸ�֣���ɫ����������
			getProduct,ͬbyId�����ر������ajax��ʾ���飨����ʹ�ã�;
			byCate:���ڶ����࣬���ڸ��û���ʾ��Ʒ�б�
			price:��specId���ؼ۸�,ajax���
			stock:��specId���ؿ��,ajax���
			}
	��byCategory:how{ajaxP(���һ����Ʒ���),ajaxO��������ڷŲ�Ʒ������}
	��search��searchLine����ѯ���ݣ�
	��byId:productId
	��getProduct:productId
	��byCate:secId
	��price\stock:specId
	}
}

Show1stCategory,Show2ndCategory:��ʾ����ʹ�ã�ajax,����������

StockChange
{
���ܣ�������Ŀǰ�����ڽ�������Ϊ���ɶ�����ʱ��ѿ����ٸ�������
���Σ�way:in��amount;specId
}

---------------------------------------------------------------------------------

user���

UserLogin
{
���ܣ��û���¼
���Σ�email,password
ͨ�������Ϣ����User�࣬����session,���򷵻ص�¼ҳ�沢������ʾ
}

�ǳ�ֱ��д��jsp...������servlet��xml̫�鷳��_��

UserRegister
{
���ܣ��û�ע��,�Զ����email�Ƿ��ѱ�ע�ᣬ���û�У�����ע�Ტ�ص�loginҳ�棻����У�����ע��ҳ�沢��ʾ
nickName��password,password2(�ظ�����),fullName,gender,email,mobile,role
}

AddressServlet
{
���ܣ��û���ַ����ɾ��
���Σ�way{new:�½���update:���£�delete:ɾ������see�ĳ�0��}
}

UserSettings
{
���ܣ��û�������Ϣ�޸ġ������޸�
���Σ�change{basic��������Ϣ�޸�;password�������޸ģ�����֤������}
}

---------------------------------------------------------------------------------

order���

NewOrder
{
���ܣ���session�е�ȡ�����õ�Cart,����������һ��������
�ȴ�������������Cart�Զ���дʱ�䡢�ܼۣ�Ȼ�����Cart����������Զ����ٿ��
}

ShowOrder
{
���ܣ�չʾ����
}

NewComment
{
���ܣ��������۶��������ǣ�ÿ����Ʒ�����ۣ��Ƿ�������
�÷���ÿ����Ʒ����ajax�ύ����󶩵��Ǽ��ύ����ת���û�����ҳ��
}

UpdateOrderStatus
{
���ܣ������������¶���״̬���˵��š�������״̬����Ϊ�Ѹ�����Զ����¶�������ʱ��
}

=====================================================================================================
JSP:myShop.jsp����ҳ
productManageMent.jsp;productManageMent2.jsp;orderManageMent.jsp�ǹ���Ա������Աר�ã���ͨ�û��޷�����

������Ա�˺ţ�betty352008@yeah.net, ���룺123456��
