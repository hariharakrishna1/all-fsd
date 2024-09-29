package spring2hibernate;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class sdao {

	private HibernateTemplate t;

	public void setT(HibernateTemplate t) {
		this.t = t;
	}
	
	public int insert(student s)
	{
		
		return (Integer)t.save(s);
	}
	
	public List<student> get(){
		String sql="from student";
		return (List<student>) t.find(sql);
	}
	
}
