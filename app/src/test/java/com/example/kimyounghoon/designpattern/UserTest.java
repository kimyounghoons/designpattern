package com.example.kimyounghoon.designpattern;

import org.junit.Test;

public class UserTest {

    @Test
    public void test() {
        User user = User.Builder.getBuilder().setAge(28)
                .setId("1llasdl3k4")
                .setEmail("kimyh0837@naver.com")
                .setName("younghoon")
                .build();

        System.out.println("user info");
        System.out.println("user email : " + user.getEmail());
        System.out.println("user id : " + user.getId());
        System.out.println("user name : " + user.getEmail());
        System.out.println("user age : " + user.getAge());
    }
}
