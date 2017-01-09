package com.tenX.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tenX.dao.IUserDao;
import com.tenX.entity.User;
import com.tenX.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService {  
	@Autowired
    private IUserDao userDao;  
      
    public User getUserById(int userId) {  
        return userDao.queryByPrimaryKey(userId);  
    }  
  
    public void insertUser(User user) {  
        userDao.insertUser(user);  
    }  
  
    public void addUser(User user) {  
        userDao.insertUser(user);  
    }  
    public List<User> getAllUser() {  
        return userDao.getAllUser();  
    }  
  
}  