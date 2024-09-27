package mvn2.mv2;

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
		/*
		 * vhk1 vhk=new vhk1(); vhk2 v2=new vhk2();
		 * 
		 * vhk.get();
		 */
    	
    	ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
    	vhk1 vhk=ac.getBean(vhk1.class);
    	System.out.println(vhk.getX());
    	
    	vhk2 v2=ac.getBean(vhk2.class);
    	v2.display();
    	
    }
} 
