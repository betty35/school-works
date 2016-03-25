package bll;

import java.sql.SQLException;
import java.util.List;

import dao.AddressDao;
import model.bean.Address;

public class AddressService {

	
	
	public int newAddress(Integer userId,String man,String phone,String code,String sheng,String shi,String address)
	{//用户添加新地址
		try {
			return new AddressDao().newAddress(userId, man, phone, code, sheng, shi, address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public List<Address> getAddressByUser(Integer userId)
	{//用户显示自己全部的收货地址(show=1是没被删除过的)
		try {
			return new AddressDao().getAddressByUser(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public int updateAddressById(Integer id,String man,String phone,String code,String sheng,String shi,String address)
	{//更新地址
		try {
			return new AddressDao().updateAddressById(id, man, phone, code, sheng, shi, address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public Address getAddressById(Integer id)
	{//按主键返回一个地址，处理订单用
		try {
			return new AddressDao().getAddressById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int deleteAddressById(Integer id)
	{//按id删除收货地址，假的，其实是把show设成false了
		try {
			return new AddressDao().deleteAddressById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
}
