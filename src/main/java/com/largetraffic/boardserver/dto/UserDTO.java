package com.largetraffic.boardserver.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

//롬복을 활용한 getter, setter, toString
@Getter
@Setter
@ToString
public class UserDTO {

    public enum Status{
        DEFAULT, ADMIN, DELETED
    }


    private int id;
    private String userId;
    private String password;
    private String nickname;
    private String isAdmin;
    private Date createTime;
    private boolean isWithDraw;
    private Status status;
    private String address;
    private Date updateTime;

}
