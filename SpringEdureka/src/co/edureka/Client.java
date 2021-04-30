package co.edureka;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEid(101);
		e.setEname("Samit Verma");
		e.setEsalary(50000);
		System.out.println(e);
		//Inversion of control(IOC)
		//1.Add jar files to Spring Core
		//2.Configure java Object in an XML File
		//3.Use spring IOC container,eg: BeanFactory and ApplicationContext to get the object constructed by them
		
	}
}
