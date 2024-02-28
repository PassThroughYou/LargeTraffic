package com.largetraffic.boardserver.exception;

public class DuplicationException extends RuntimeException { //런타임 시에 예외를 던질 수 있도록 runtimeException을 상속

    //아이디 중복 예외 처리
    public DuplicationException(String msg) {
        super(msg); //생성자에 super라는 키워드를 통해서 상위객체에다가 msg를 넘기겠다.
    }
}
