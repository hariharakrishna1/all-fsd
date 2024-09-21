package hiberex4;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class hibermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hiber.cfg.xml").build();
		//Metadata in the config file should be executed
		Metadata md=new MetadataSources(ssr).getMetadataBuilder().build();
		//session factory
		SessionFactory sf=(SessionFactory) md.getSessionFactoryBuilder().build();
		//session is place where we write the CRUD operations
		Session s=sf.openSession();
		//used to save the crud operations on the db
		Transaction t=s.beginTransaction();
		Scanner sc=new Scanner(System.in);
		student tu= new student();
		System.out.println("enter the id value");
		tu.setSid(sc.nextInt());
		System.out.println("enter the name");
		tu.setSname(sc.next());
		System.out.println("enter the email");
		tu.setSemail(sc.next());
		//insert
		s.save(tu);
		t.commit();
		s.close();
		sf.close();
		}


}
