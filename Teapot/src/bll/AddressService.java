package bll;

import java.sql.SQLException;
import java.util.List;

import dao.AddressDao;
import model.bean.Address;

public class AddressService {

	
	
	public int newAddress(Integer userId,String man,String phone,String code,String sheng,String shi,String address)
	{//�û�����µ�ַ
		try {
			return new AddressDao().newAddress(userId, man, phone, code, sheng, shi, address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public List<Address> getAddressByUser(Integer userId)
	{//�û���ʾ�Լ�ȫ�����ջ���ַ(show=1��û��ɾ������)
		try {
			return new AddressDao().getAddressByUser(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	public int updateAddressById(Integer id,String man,String phone,String code,String sheng,String shi,String address)
	{//���µ�ַ
		try {
			return new AddressDao().updateAddressById(id, man, phone, code, sheng, shi, address);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public Address getAddressById(Integer id)
	{//����������һ����ַ����������
		try {
			return new AddressDao().getAddressById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public int deleteAddressById(Integer id)
	{//��idɾ���ջ���ַ���ٵģ���ʵ�ǰ�show���false��
		try {
			return new AddressDao().deleteAddressById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	
}
