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
	{//�������õ�����orderId
		//�ܼ����ڹ��ﳵ������˵�
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
	{//ֱ�Ӵ�ȷ���˵Ĺ��ﳵ��ᣬCartItem��������product��count
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
	{//չʾ����������
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
	{//չʾ������
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
	{//���¶���״̬
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
	{//�����˵���
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
	{//��������ʱ����ʱ��
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
	{//�û����´�֣��������Ų�ѯ
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
	{//���û�չʾ���ж�����
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
	{//����Ψһ����
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
	{//���ҹ���δ����������
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
	{//�������
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
	{//���ȫ�������۵Ķ���
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
	{//��ȡĳ����Ʒȫ������
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
