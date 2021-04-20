package come.navin.Telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
    			 context = new ClassPathXmlApplicationContext("config.xml");
    			  Student student1=(Student) context.getBean("student1");
    			  System.out.println(student1);			 
    }
}
