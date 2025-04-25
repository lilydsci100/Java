package com.itheima4.d5_proxy2;

public class UserServicelmpl implements UserService{
    @Override
    public void login(String username, String password) throws Exception {
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
        Thread.sleep(1500);
    }

    @Override
    public void deleteUsers() throws Exception {
        System.out.println("Delete users");
        Thread.sleep(1500);
    }

    @Override
    public String[] selectUsers() throws Exception {
        System.out.println("Select users");
        String[] names = {"lily", "tim", "Jerry"};
        Thread.sleep(500);
        return names;
    }
}
