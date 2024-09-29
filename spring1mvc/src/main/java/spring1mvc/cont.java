package spring1mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class cont {
	
	@ResponseBody
	@RequestMapping("/add")
	public ModelAndView disp(HttpServletRequest req,HttpServletResponse res) {
		
		ModelAndView mv=new ModelAndView();
		//input from jsp must be entered so httpreq and res were used
		int result=Integer.parseInt(req.getParameter("no1"))+Integer.parseInt(req.getParameter("no2"));
		//return "sum of the numbers are "+ result;
		mv.setViewName("disp.jsp");
		mv.addObject("sum",result);//sends result output to disp.jsp
		return mv;
	}
	@ResponseBody//output displayed on page
	@RequestMapping("/sub")
public String sub(HttpServletRequest req,HttpServletResponse res) {
		
		//input from jsp must be entered so httpreq and res were used
		int result=Integer.parseInt(req.getParameter("no1"))-Integer.parseInt(req.getParameter("no2"));
		return "sum of the numbers are "+ result;
	}
}
