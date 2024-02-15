package com.largetraffic.boardserver.service;

import com.largetraffic.boardserver.dto.UserDTO;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{


    @Override
    public void register(UserDTO userProfile) {
        //회원가입

    }

    @Override
    public UserDTO login(String id, String password) {
        return null;
    }

    @Override
    public boolean isDuplicatedId(String id) {
        return false;
    }

    @Override
    public UserDTO geUserInfo(String userId) {
        return null;
    }

    @Override
    public void updatePassword(String id, String beforePassword, String afterPassword) {

    }

    @Override
    public void deleteId(String id, String password) {

    }
}
