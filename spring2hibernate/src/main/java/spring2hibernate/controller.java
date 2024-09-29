package spring2hibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controller {
	
	@RequestMapping("/add")	
	public ModelAndView add(HttpServletRequest req,HttpServletResponse res)
	{
		ModelAndView mv=new ModelAndView();
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		student s=ac.getBean(student.class);
		sdao sd=ac.getBean(sdao.class);
		s.setSid(Integer.parseInt(req.getParameter("id")));
		s.setSemail(req.getParameter("email"));
		s.setSname(req.getParameter("name"));
		int x=sd.insert(s);
		if(x>0)
		{
			mv.setViewName("dis.jsp");
		}
		return mv;
	}

}
