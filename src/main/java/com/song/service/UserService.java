package com.song.service;

import com.song.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by Song on 2017/2/15.
 * User业务逻辑
 */
@Service
public class UserService {


    public User findUserByName(String name){
        User user = null;
        try{
            user = new User();
        }catch (Exception e){}
        return user;
    }
}
