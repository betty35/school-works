package model.bean;

public class User implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4859661002937612924L;
	private Integer userId;
	private String nickName;
	private String password;
	private String fullName;
	private String gender;
	private String email;
	private String mobile;
	private String role;
	
	public User(){}
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String loginName) {
		this.nickName = loginName;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
