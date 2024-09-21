package ex5hibservlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class studentdao {
	public int insert(student student)
	{
		hiberutil h=new hiberutil();
		SessionFactory r=h.reqsession();
		Session s=r.openSession();
		Transaction t=s.beginTransaction();
		int row=(int) s.save(student);
		return row;
	}
	

}
