package Value_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Tester
{
public static void main(String[] args) {
//	ApplicationContext a=new ClassPathXmlApplicationContext("Value_Injection/config.xml");
//	Car car1=(Car)a.getBean("car");
//	System.out.println(car1);
	ApplicationContext b=new ClassPathXmlApplicationContext("Value_injection/config.xml");
	Bike bike=(Bike)b.getBean("bike");
	System.out.println(bike);
}
}
