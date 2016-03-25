package bll;
import java.sql.SQLException;

import dao.*;
import model.bean.*;

public class UserService {
	public User login(String email, String pwd)
	{
		try {
			return new UserDao().query(email, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public int register(String email,String password,String nickName,String mobile,String fullName,String gender,String role)
	{
		try {
			return new UserDao().insert(email,password,nickName,mobile,fullName,gender,role);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updateBasicById(Integer userId,String nickName,String mobile,String fullName)
	{//按照userId更新基本信息,昵称、电话、姓名
		try {
			return new UserDao().updateBasicById(userId, nickName, mobile, fullName);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updatePasswordById(Integer userId,String password)
	{//按照userId更新密码
		try {
			return new UserDao().updatePasswordById(userId, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public String getNickNameById(Integer userId)
	{//根据userId返回用户昵称
		try {
			return new UserDao().getNickNameById(userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
