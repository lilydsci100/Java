package com.itheima4.d1_junit;

import org.junit.*;

public class StringUtilTest {
    @Before
    public void test1(){
        System.out.println("---> test1 Before执行");
    }
    @BeforeClass
    public static void test11(){
        System.out.println("---> test11 BeforeClass");
    }
    @After
    public void test2(){
        System.out.println("---> test2 After");
    }
    @AfterClass
    public static void test22(){
        System.out.println("---> test22 AfterClass");
    }

    @Test
    public void testPrintNumber() {
        StringUtil.printNumber("123");
        StringUtil.printNumber(null);
    }

    @Test
    public void testgetMaxIndex() {
        int index1 = StringUtil.getMaxIndex(null);
        System.out.println(index1);

        int index2 = StringUtil.getMaxIndex("admin");
        System.out.println(index2);
        //断言机制
        Assert.assertEquals("方法内部有bug",4,index2);
    }

}
