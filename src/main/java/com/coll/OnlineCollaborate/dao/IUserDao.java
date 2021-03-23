package com.coll.OnlineCollaborate.dao;

import java.util.List;

import com.coll.OnlineCollaborate.model.User;

public interface IUserDao {
List<User> userListbyStatus(String status);
User getUserById(int userId);
User getUserByUsername(String username);
User validateUser(User user);
boolean addUser(User user);
boolean updateUser(int user);
boolean deleteUser(int userId);
boolean deactiveUser(int userId);
List<User> getAllUsers();
boolean updateUserProfile(String file,Integer userId);
List<User> getAllDeactiveUsers();
boolean activateUser(int userId);
}
