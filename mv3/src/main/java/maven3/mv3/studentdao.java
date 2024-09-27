package maven3.mv3;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class studentdao {
	private JdbcTemplate t;
	
	public void setT(JdbcTemplate t) {
		this.t = t;
	}

	public int insert(student s)
	{
		String sql="insert into student values("+s.getSid()+",'"+s.getSname() +"','"+s.getSemail()+"')";
		return t.update(sql);
	}
	
	public List<student> get()
	{
		String sql="select * from student";
		return t.query(sql,new ResultSetExtractor<List<student>>()
		{//anonymous inner object
			public List<student> extractData(ResultSet rs) throws SQLException{
			ArrayList<student> al=new ArrayList<student>();
			while(rs.next()) 
			{
				student s=new student();
				s.setSid(rs.getInt(1));
				s.setSname(rs.getString(2));
				s.setSemail(rs.getString(3));
				al.add(s);//student object created and set
			}
			return al;
		}

		});
		
	
}
}

