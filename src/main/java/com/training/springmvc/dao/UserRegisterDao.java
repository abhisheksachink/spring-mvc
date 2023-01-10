package com.training.springmvc.dao;

import java.util.List;

import com.training.springmvc.model.User;
public interface UserRegisterDao {

	List<User> setUsers(String userN, String pasw);
}
