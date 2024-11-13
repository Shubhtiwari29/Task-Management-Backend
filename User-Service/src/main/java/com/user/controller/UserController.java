package com.user.controller;

import com.user.exception.UserException;
import com.user.model.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/users")
// Unchecked cast to List<User> is necessary for ResponseEntity to accept it.
// This is because ResponseEntity requires a body type that extends ResponseEntityBodyType. In this case, it extends List<User>.
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public ResponseEntity<User> getUserProfileHandler(
            @RequestHeader("Authorization") String jwt) throws UserException {

        User user = userService.findUserProfileByJwt(jwt);
        user.setPassword(null);

        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> findUserById(
            @PathVariable Long userId,
            @RequestHeader("Authorization") String jwt) throws UserException {

        User user = userService.findUserById(userId);
        user.setPassword(null);

        return new ResponseEntity<>(user, HttpStatus.ACCEPTED);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> findAllUsers(

            @RequestHeader("Authorization") String jwt)  {

        List<User> users = userService.findAllUsers();


        return new ResponseEntity<>(users, HttpStatus.ACCEPTED);
    }



}

