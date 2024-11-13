package com.user.service;

import java.util.List;


import com.user.exception.UserException;
import com.user.model.User;

public interface UserService {

    public User findUserProfileByJwt(String jwt) throws UserException;

    public User findUserByEmail(String email) throws UserException;

    public User findUserById(Long userId) throws UserException;

    public List<User> findAllUsers();

//	public List<User> getPenddingRestaurantOwner();

//	void updatePassword(User user, String newPassword);

//	void sendPasswordResetEmail(User user);
}
