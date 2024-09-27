package maven3.mv3;

import java.util.List;
import java.util.Scanner;

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
        System.out.println( "Hello World!" );
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml"); 
        student s=ac.getBean(student.class);
        Scanner sc=new Scanner(System.in);
        s.setSid(sc.nextInt());
        s.setSname(sc.next());
        s.setSemail(sc.next());

        studentdao st=ac.getBean(studentdao.class);
        int x=st.insert(s);
        if(x>0)
        {
        	System.out.print("hello");
        }
        
        System.out.println("retrive from the table is ");
        List<student> ss=st.get();
        for(student student:ss) {
        	System.out.println(student.getSid()+"  "+student.getSname()+"  "+student.getSemail());
        }

    }
}
