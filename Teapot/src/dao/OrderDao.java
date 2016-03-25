package dao;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.sql.SQLException;

import dao.common.DbHelper;
import model.bean.Order;
import model.bean.OrderItem;

public class OrderDao {
	private DbHelper ct;
	public OrderDao() throws SQLException{ 
		ct = new DbHelper();
	}
	
	public int newOrder(Integer userId,String deliveryWay,String paymentWay,Integer addressId,Float totalPrice,String memo)
	{//从这里拿到主键orderId
		//总价是在购物车里算好了的
		String orderCode=UUID.randomUUID().toString().trim().replaceAll("-", "");
		Date orderDate=new Date();
		Integer orderStatus=0;
		String sql="INSERT INTO theorder(userId,orderCode,orderDate,orderStatus,addressId,deliveryWay,"
				+ "paymentWay,totalPrice,memo) VALUES (?,?,?,?,?,?,?,?,?)";
		try {
			int key=ct.insertAndReturnKey(sql, userId,orderCode,orderDate,orderStatus,addressId,deliveryWay,
					paymentWay,totalPrice,memo);
			return key;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int newOrderItem(Integer orderId,Integer productId,String productName,String kind,Float unitPrice,Integer quantity)
	{//直接从确认了的购物车里搬，CartItem里面塞的product和count
		String sql="INSERT INTO Orderitem(orderId,productId,productName,kind,unitPrice,quantity) VALUES (?,?,?,?,?,?)";
		try {
			int key=ct.insertAndReturnKey(sql,orderId,productId,productName,kind,unitPrice,quantity);
			return key;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public List<OrderItem> getAllOrderItemByOrderId(Integer orderId)
	{//展示订单详情用
		String sql="SELECT * FROM Orderitem WHERE orderId=?";
		try {
			return ct.find(sql, OrderItem.class,DbHelper.parseSmap(OrderItem.class,"id","orderId","productId","productName","kind","unitPrice","quantity","grade","comment","anonymous","commentTime"), orderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public List<OrderItem> getAllOrderItemBySpecId(Integer specId)
	{//展示评价用
		String sql="SELECT * FROM Orderitem WHERE productId=?";
		try {
			return ct.find(sql, OrderItem.class,DbHelper.parseSmap(OrderItem.class,"id","orderId","productId","productName","kind","unitPrice","quantity","grade","comment","anonymous","commentTime"), specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public int updateStatusById(Integer id,Integer status)
	{//更新订单状态
		String sql="UPDATE theorder SET orderStatus=? WHERE orderId=?";
		try {
			return ct.updatePrepareSQL(sql, status,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateDeliveryCodeById(Integer id,String code)
	{//更新运单号
		String sql="UPDATE theorder SET deliveryCode=? WHERE orderId=?";
		try {
			return ct.updatePrepareSQL(sql, code,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateFinishDateById(Integer id)
	{//订单结束时更新时间
		Date date=new Date();
		String sql="UPDATE theorder SET finishDate=? WHERE orderId=?";
		try {
			return ct.updatePrepareSQL(sql, date,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateStarsById(Integer id,Integer honest,Integer service,Integer delivery)
	{//用户更新打分，按订单号查询
		String sql="UPDATE theorder SET honestyStar=?,serviceStar=?,deliveryStar=? WHERE orderId=?";
		try {
			return ct.updatePrepareSQL(sql, honest,service,delivery,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Order> getOrderByUser(Integer userId)
	{//给用户展示所有订单用
		String sql="SELECT * FROM theorder WHERE userId=? ORDER BY orderId DESC";
		try {
			return ct.find(sql, Order.class,DbHelper.parseSmap(Order.class,"userId","orderId","orderCode","orderDate","orderStatus","deliveryWay","paymentWay","deliveryCode","addressId","finishDate","memo",
					"honestyStar","serviceStar","deliveryStar","totalPrice"), userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Order getOrderById(Integer orderId)
	{//返回唯一订单
		String sql="SELECT * FROM theorder WHERE orderId=?";
		try {
			return ct.get(Order.class,sql,DbHelper.parseSmap(Order.class,"userId","orderId","orderCode","orderDate","orderStatus","deliveryWay","paymentWay","deliveryCode","addressId","finishDate","memo",
					"honestyStar","serviceStar","deliveryStar","totalPrice"), orderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Order> getOrderByStatus(Integer status)
	{//卖家管理未发货订单用
		String sql="SELECT * FROM theorder WHERE orderStatus=? ORDER BY orderId DESC";
		try {
			return ct.find(sql, Order.class,DbHelper.parseSmap(Order.class,"userId","orderId","orderCode","orderDate","orderStatus","deliveryWay","paymentWay","deliveryCode","addressId","finishDate","memo",
					"honestyStar","serviceStar","deliveryStar","totalPrice"), status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateCommentById(Integer id,Integer grade,String comment,Integer anonymous)
	{//买家评价
		Date commentTime=new Date();
		String sql="UPDATE Orderitem SET grade=?,comment=?,anonymous=?,commentTime=? WHERE id=?";
		try {
			return ct.updatePrepareSQL(sql, grade,comment,anonymous,commentTime,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		
	}
	
	public List<Order> getAllCommented()
	{//获得全部已评价的订单
		String sql="SELECT * from theorder where honestyStar is not NULL ORDER BY orderId desc";
		try {
			return ct.find(sql, Order.class,DbHelper.parseSmap(Order.class,"userId","orderId","orderCode","orderDate","orderStatus","deliveryWay","paymentWay","deliveryCode","addressId","finishDate","memo",
					"honestyStar","serviceStar","deliveryStar","totalPrice"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public List<OrderItem> getCommentBySpec(Integer specId)
	{//获取某种商品全部评价
		String sql="SELECT * from orderitem where `comment` is not NULL and productId=? ORDER BY id desc";
		try {
			return ct.find(sql, OrderItem.class,DbHelper.parseSmap(OrderItem.class,"id","orderId","productId","productName","kind","unitPrice","quantity","grade","comment","anonymous","commentTime"), specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
