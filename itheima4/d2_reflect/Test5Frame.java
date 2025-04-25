package com.itheima4.d2_reflect;

import org.junit.Test;

public class Test5Frame {
   @Test
   public void save() throws Exception {
       Student student = new Student("lily", 21, 'f', 160, "singing");
       Teacher teacher = new Teacher("Sam", 1300);

       ObjectFrame.saveObject(student);
       ObjectFrame.saveObject(teacher);
   }
}
