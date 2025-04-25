package com.itheima4.d5_proxy2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        UserService userService = ProxyUtil.createUserService(new UserServicelmpl());


        userService.login("admin", "1234");

        userService.deleteUsers();

        String[] names = userService.selectUsers();
        System.out.println("users are " + Arrays.toString(names));
    }
}
