package com.costaff.employees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeesApp {
    public static void main(String[] args) {
        ApplicationContext apcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Department department=(Department) apcontext.getBean("department1");
        System.out.println(department);
//        --------------------------------------------------------------------------------------
        Object obj=apcontext.getBean("employee1",Employee.class);
        System.out.println(obj.getClass());
        String[] names=apcontext.getBeanNamesForType(Employee.class);
        for (String name:names
             ) {
            System.out.println(name);

        }
//        ----------------------------------------------------------------------------------------------

        System.out.println("---------------------------------------------------------------------------");
        department.setId(212);
        department.getEmployees().add((Employee) obj);
        department=apcontext.getBean("department1",Department.class);
        System.out.println(department);
    }
}
