package com.largetraffic.boardserver.service.impl;

import com.largetraffic.boardserver.dto.UserDTO;
import com.largetraffic.boardserver.exception.DuplicationException;
import com.largetraffic.boardserver.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Automired
    private UserProfileMapper userProfileMapper; //DB와 직접적인 통신을 위함


    @Override
    public void register(UserDTO userProfile) {
        //회원가입
        //1. 아이디 중복 여부 확인
        boolean duplIdResult = isDuplicatedId(userProfile.getUserId());
        if(duplIdResult) {
            throw new DuplicationException("이미 존재하는 아이디입니다.");
        }

        //2. 아이디 중복이 일어나지 않은 경우 -> 가입 시간을 설정
        userProfile.setCreateTime(new Date());

        //3. 유저 암호화
        userProfile.setPassword(encryptSHA256(userProfile.getPassword()));//암호화를 위한 SHA256 util파일 이용

    }

    @Override
    public UserDTO login(String id, String password) {
        return null;
    }

    @Override
    public boolean isDuplicatedId(String id) {
        //1. 이 아이디값이 정상적으로 존재하는지 확인

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
