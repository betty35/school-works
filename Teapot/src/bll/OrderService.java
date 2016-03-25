package bll;

import java.sql.SQLException;
import java.util.List;

import dao.OrderDao;
import model.bean.Order;
import model.bean.OrderItem;

public class OrderService {
	
	public int newOrder(Integer userId,String deliveryWay,String paymentWay,Integer addressId,Float totalPrice,String memo)
	{
		//�������õ�����orderId
				//�ܼ����ڹ��ﳵ������˵�
		try {
			return new OrderDao().newOrder(userId, deliveryWay, paymentWay, addressId, totalPrice, memo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	public int newOrderItem(Integer orderId,Integer productId,String productName,String kind,Float unitPrice,Integer quantity)
	{//ֱ�Ӵ�ȷ���˵Ĺ��ﳵ��ᣬCartItem��������product��count
		try {
			return new OrderDao().newOrderItem(orderId, productId, productName, kind, unitPrice, quantity);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<OrderItem> getAllOrderItemByOrderId(Integer orderId)
	{//չʾ����������
		try {
			return new OrderDao().getAllOrderItemByOrderId(orderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateStatusById(Integer id,Integer status)
	{//���¶���״̬
		try {
			return new OrderDao().updateStatusById(id, status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateDeliveryCodeById(Integer id,String code)
	{//�����˵���
		try {
			return new OrderDao().updateDeliveryCodeById(id, code);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateFinishDateById(Integer id)
	{//��������ʱ����ʱ��
		try {
			return new OrderDao().updateFinishDateById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateStarsById(Integer id,Integer honest,Integer service,Integer delivery)
	{//�û����´�֣��������Ų�ѯ
		try {
			return new OrderDao().updateStarsById(id, honest, service, delivery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Order> getOrderByUser(Integer userId)
	{//���û�չʾ���ж�����
		try {
			return new OrderDao().getOrderByUser(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public Order getOrderById(Integer orderId)
	{//����Ψһ����
		try {
			return new OrderDao().getOrderById(orderId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public List<Order> getOrderByStatus(Integer status)
	{//���Ҳ鿴δ����������
		try {
			return new OrderDao().getOrderByStatus(status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int updateCommentById(Integer id,Integer grade,String comment,Integer anonymous)
	{//�������
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
	{//��ȡĳ����Ʒȫ������
		try {
			return new OrderDao().getCommentBySpec(specId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
