package com.itheima4.d5_proxy2;

public interface UserService {
    //login
    void login(String username, String password) throws Exception;
    //delete
    void deleteUsers() throws Exception;
    //search
    String[] selectUsers() throws Exception;
}
