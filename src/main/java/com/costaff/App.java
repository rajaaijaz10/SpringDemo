package com.costaff;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        Setting setting= (Setting) applicationContext.getBean("setting");
        Questions questions=(Questions)applicationContext.getBean("question");
        System.out.println(questions);


        System.out.println( "Hello World! -----  " +setting);
    }
}
