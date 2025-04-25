package com.itheima4.d4_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //返回实现类接口 new Start() {...}
    public static Star createProxy(BigStar bigStar){
        /*
            newProxyInstance(ClassLoader loader,
                Class<?>[] interfaces,
                InvocationHandler h)
            参数1: 用于指定一个类加载器
            参数2: 指定生成的代理长什么样子(这个代理 代理哪些方法)
            参数3: 用来指定生成的代理对象要干什么事情
         */
        // Star starProxy = ProxyUtil.createProxy(s);
        // starProxy.sing(“好日子”)
        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override //回调方法
                    //当前调用的代理对象 starProxy
                    //当前调用的方法 sing
                    //当前调用的方法的参数 [“好日子”]
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理对象要做的事情
                        if(method.getName().equals("sing")){
                            System.out.println("准备话筒, 收钱");
                        } else if(method.getName().equals("dance")) {
                            System.out.println("准备场地, 收钱");
                        }
                        //调用BigStar实例对象的方法
                        return method.invoke(bigStar,args); //这个invoke是反射中method的方法, 不是上面的invoke
                    }
                }
        );
        return starProxy;
    }
}
