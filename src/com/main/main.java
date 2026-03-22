package com.main;

import com.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        String path="/com/resources/applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(path);
        Student std = (Student) context.getBean( "S20");
        std.display();
    }
}
