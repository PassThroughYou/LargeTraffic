package com.largetraffic.boardserver.utils;


import lombok.extern.log4j.Log4j2;

public class SHA256Util {

    //생성과 동시에  수정이 불가능한 변수로 설정된 키 생성
    public static final String ENCRYPTION_KEY="SHA-256";


    @Log4j2 //로깅을 위한 Annoatation
    public static String encryptSHA256(String str) { //암호화를 하는 메서드
        String SHA=null;

        //메세지 핸들링을 위한 변수
        MessageDigest sh;
        try{
            sh = MessageDigest.getInstance(ENCRYPTION_KEY); //키값으로 객체를 생성
            sh.update(str.getBytes()); //바이트 정보 업데이트
            byte byteData[] = sh.digest(); //특정 배열의 문자열 값을 읽어서 저장
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1)); //암호화를 진행하는 부분
            }
            SHA = sb.toString();
        }catch ( Exception e){
            log.server("encriptSHA256 error : " + e.getMessage());
            SHA=null;
        }
        return SHA;
    }
}
