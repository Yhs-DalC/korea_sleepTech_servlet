package com.study.korea_sleeptech_servlet.order_app.entity;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor // 초기화 되지 않은 final필드 , @nonNull필드를 매개변수로 생성자 생성
public class User {
    private int id;
    @NonNull
    private String name;
    @NonNull
    private String email;

//    public User(String name, String email){
//        this.name = name;
//        this.email = email;
//    }
}
