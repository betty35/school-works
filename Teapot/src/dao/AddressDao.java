package dao;
import model.bean.Address;
import java.sql.SQLException;
import java.util.List;

import dao.common.DbHelper;

public class AddressDao {
	private DbHelper ct;
	public AddressDao() throws SQLException{ ct = new DbHelper();}
	
	public int newAddress(Integer userId,String man,String phone,String code,String sheng,String shi,String address)
	{//�û�����µ�ַ
		String sql="INSERT INTO Deliveryaddress(userId,linkman,linkphone,zipcode,sheng,shi,address,see) VALUES (?,?,?,?,?,?,?,1)";
		try {
			return ct.insertAndReturnKey(sql, userId,man,phone,code,sheng,shi,address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public List<Address> getAddressByUser(Integer userId)
	{//�û���ʾ�Լ�ȫ�����ջ���ַ(show=1��û��ɾ������)
		Integer see=1;
		String sql="SELECT * FROM Deliveryaddress WHERE userId=? AND see=?";
	try {
		return ct.find(sql, Address.class,DbHelper.parseSmap(Address.class,"id","linkman","linkphone","zipcode","sheng","shi","address","see"), userId,see);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}	
	}
	
	public int updateAddressById(Integer id,String man,String phone,String code,String sheng,String shi,String address)
	{//���µ�ַ
		String sql="UPDATE Deliveryaddress SET linkman=?,linkphone=?,zipcode=?,sheng=?,shi=?,address=? WHERE id=?";
		try {
			return ct.updatePrepareSQL(sql, man,phone,code,sheng,shi,address,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public Address getAddressById(Integer id)
	{//����������һ����ַ����������
		String sql="SELECT * FROM Deliveryaddress WHERE id=?";
		try {
			return ct.get(Address.class, sql,DbHelper.parseSmap(Address.class,"id","linkman","linkphone","zipcode","sheng","shi","address","see"), id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int deleteAddressById(Integer id)
	{//��idɾ���ջ���ַ���ٵģ���ʵ�ǰ�show���0��
		String sql="UPDATE Deliveryaddress SET see=? WHERE id=?";
		Integer hide=0;
		try {
			return ct.updatePrepareSQL(sql, hide,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
}
