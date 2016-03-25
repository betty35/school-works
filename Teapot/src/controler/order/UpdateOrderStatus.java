package controler.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bll.OrderService;

public class UpdateOrderStatus extends HttpServlet {
//����Ա����ר�ã����¶������
	/**
	 * 
	 */
	private static final long serialVersionUID = -3809484592365591612L;
	OrderService os=new OrderService();
	
	public UpdateOrderStatus(){}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort() + path + "/";
		//what�жϲ���
		String what=request.getParameter("what");
		if(what.equals("status"))
		{//���¶���״̬
			Integer id=Integer.parseInt(request.getParameter("orderId"));
			Integer status=Integer.parseInt(request.getParameter("status"));
			os.updateStatusById(id, status);
			//status: 0:δ���1������δ������2���ѷ�����3����ǩ�գ�ȷ�ϸ��4:ɾ����ֻ���û��˲���ʾ���ѣ�
			if(status==3) os.updateFinishDateById(id);//���ǩ�գ��Զ����¶�����������
			if(request.getParameter("back")!=null)
			{
				if(request.getParameter("back").equals("order"))
					response.sendRedirect(basePath+"JSP/showMyOrders.jsp");
			}
		}
		else if(what.equals("deliveryCode"))
		{//����������˵���
			String del=request.getParameter("deliveryCode");
			Integer id=Integer.parseInt(request.getParameter("orderId"));
			Integer status=2;
			os.updateDeliveryCodeById(id, del);
			os.updateStatusById(id, status);
		}
		response.sendRedirect("JSP/orderManagement.jsp");
	}
}
