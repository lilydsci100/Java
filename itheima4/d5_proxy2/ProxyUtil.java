package com.itheima4.d5_proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createUserService(UserServicelmpl userServicelmpl) { //若使用 UserService userService 作为参数传给 createUserService, 则运用了多态
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{UserService.class}, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("login") || method.getName().equals("deleteUsers") || method.getName().equals("selectUsers")) {
                            long startTime = System.currentTimeMillis();
                            Object result = method.invoke(userServicelmpl, args);
                            long endTime = System.currentTimeMillis();
                            System.out.println(method.getName() + " run this method using: " + (endTime - startTime)/1000.0 + "s");
                            return result;
                        } else {
                            return method.invoke(userServicelmpl, args);
                        }
                    }
                });
        return userServiceProxy;
    }
}
