package bll;

import java.sql.SQLException;
import java.util.List;

import dao.OrderDao;
import model.bean.Order;
import model.bean.OrderItem;

public class OrderService {
	
	public int newOrder(Integer userId,String deliveryWay,String paymentWay,Integer addressId,Float totalPrice,String memo)
	{
		//从这里拿到主键orderId
				//总价是在购物车里算好了的
		try {
			return new OrderDao().newOrder(userId, deliveryWay, paymentWay, addressId, totalPrice, memo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public int newOrderItem(Integer orderId,Integer productId,String productName,String kind,Float unitPrice,Integer quantity)
	{//直接从确认了的购物车里搬，CartItem里面塞的product和count
		try {
			return new OrderDao().newOrderItem(orderId, productId, productName, kind, unitPrice, quantity);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<OrderItem> getAllOrderItemByOrderId(Integer orderId)
	{//展示订单详情用
		try {
			return new OrderDao().getAllOrderItemByOrderId(orderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateStatusById(Integer id,Integer status)
	{//更新订单状态
		try {
			return new OrderDao().updateStatusById(id, status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateDeliveryCodeById(Integer id,String code)
	{//更新运单号
		try {
			return new OrderDao().updateDeliveryCodeById(id, code);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateFinishDateById(Integer id)
	{//订单结束时更新时间
		try {
			return new OrderDao().updateFinishDateById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateStarsById(Integer id,Integer honest,Integer service,Integer delivery)
	{//用户更新打分，按订单号查询
		try {
			return new OrderDao().updateStarsById(id, honest, service, delivery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Order> getOrderByUser(Integer userId)
	{//给用户展示所有订单用
		try {
			return new OrderDao().getOrderByUser(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Order getOrderById(Integer orderId)
	{//返回唯一订单
		try {
			return new OrderDao().getOrderById(orderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Order> getOrderByStatus(Integer status)
	{//卖家查看未发货订单用
		try {
			return new OrderDao().getOrderByStatus(status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateCommentById(Integer id,Integer grade,String comment,Integer anonymous)
	{//买家评价
		try {
			return new OrderDao().updateCommentById(id, grade, comment,anonymous);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<OrderItem> getAllOrderItemBySpecId(Integer specId)
	{
		try {
			return new OrderDao().getAllOrderItemBySpecId(specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Order> getAllCommented()
	{
		try {
			return new OrderDao().getAllCommented();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
	}
	
	public List<OrderItem> getCommentBySpec(Integer specId)
	{//获取某种商品全部评价
		try {
			return new OrderDao().getCommentBySpec(specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
