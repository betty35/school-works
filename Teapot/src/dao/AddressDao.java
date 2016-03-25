package dao;
import model.bean.Address;
import java.sql.SQLException;
import java.util.List;

import dao.common.DbHelper;

public class AddressDao {
	private DbHelper ct;
	public AddressDao() throws SQLException{ ct = new DbHelper();}
	
	public int newAddress(Integer userId,String man,String phone,String code,String sheng,String shi,String address)
	{//用户添加新地址
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
	{//用户显示自己全部的收货地址(show=1是没被删除过的)
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
	{//更新地址
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
	{//按主键返回一个地址，处理订单用
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
	{//按id删除收货地址，假的，其实是把show设成0了
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
