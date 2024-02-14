package com.largetraffic.boardserver.service;

import com.largetraffic.boardserver.dto.UserDTO;

public interface UserService {
    void register(UserDTO userProfile);

    UserDTO login(String id, String password);

    boolean isDuplicatedId(String id);

    UserDTO geUserInfo(String userId);

    void updatePassword(String id, String beforePassword, String afterPassword);

    void deleteId(String id, String password);

}
