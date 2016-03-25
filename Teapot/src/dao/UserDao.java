package dao;
import java.sql.SQLException;
import dao.common.*;
import model.bean.User;

public class UserDao {
	private DbHelper ct;
	public UserDao() throws SQLException{ 
		ct = new DbHelper();
	}
	
	public int insert(String email,String password,String nickName,String mobile,String fullName,String gender,String role) throws SQLException{
		if(ct.findReturn("SELECT * FROM User WHERE Email = ?", email)!=null)
		{return 0;}
		else
		{
		String sql="INSERT INTO User(email,password,nickName,mobile,fullName,gender,role) VALUES (?,?,?,?,?,?,?)";
		try {
			return ct.insertAndReturnKey(sql,email,password,nickName,mobile,fullName,gender,role);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		}
	}
	public int updateBasicById(Integer userId,String nickName,String mobile,String fullName)
	{//����userId���»�����Ϣ,�ǳơ��绰������
		String sql="UPDATE User Set nickName=?,mobile=?,fullName=? WHERE userId=?";
		try {
			return ct.updatePrepareSQL(sql, nickName,mobile,fullName,userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public int updatePasswordById(Integer userId,String password)
	{//����userId��������
		String sql="UPDATE User Set password=? WHERE userId=?";
		try {
			return ct.updatePrepareSQL(sql, password,userId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public void delete(User item){
		
	}
	
	public User query(String email, String password) throws SQLException
	{//��½��ֱ�ӷ���һ���������˵�User������UserLogin��򵥴ֱ�����session....
		String sql = "SELECT * FROM User WHERE Email = ? AND Password = ?";
		return ct.get(User.class, sql, DbHelper.parseSmap(User.class, "userId", "nickName", "password", "fullName", "gender", "email", "mobile","role"), email, password);
	}
	
	public String getNickNameById(Integer userId)
	{//����userId�����û��ǳ�
		String sql = "SELECT * FROM User WHERE userId=?";
		User user;
		try {
			user = ct.get(User.class, sql, DbHelper.parseSmap(User.class, "userId", "nickName", "password", "fullName", "gender", "email", "mobile","role"), userId);
			return user.getNickName();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
