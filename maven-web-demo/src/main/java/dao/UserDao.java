package dao;

import model.User;

public interface UserDao {
	//获取用户个人信息
	public User getUser(int userId);

}
