package com.samitedureka.advancespring;

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
    	//Traditional ways
//    	Employee e=new Employee();
//    	e.setEid(123);
//    	e.setEname("Samit Verma");
//    	e.setEsalary(50000);
//    	System.out.println(e);
    	//Inversion of Control(IOC)
    	//1.Add jar files for spring core
    	//2.Configure Java object in an XML file
    	//3.Use Spring IOC container,eg: BeanFactory and ApplicationContext to get the objects constructed by them
    	ApplicationContext context=new ClassPathXmlApplicationContext("springedureka.xml");
    	Employee obj1=(Employee)context.getBean("emp1");
    	Employee obj2=(Employee)context.getBean("emp2");
    	Employee obj3=(Employee)context.getBean("emp3");
    	System.out.println(obj1);
    	System.out.println(obj2);
    	System.out.println(obj3);
    }
}
