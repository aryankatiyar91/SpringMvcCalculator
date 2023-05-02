package com.techpalle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalciController 
{
	@RequestMapping(value = "calc",params = "btnAdd")
	public ModelAndView getAdd(String tbFn,String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		// Convert the String to integer
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		
		// Add the above two number and store it in a variable
		int res=fn+sn;
		
		// Put the result in ModelAndView
		mv.addObject("result",res);
		
		// redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	
	
	@RequestMapping(value = "calc",params = "btnSub")
	public ModelAndView getSub(String tbFn,String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		// Convert the String to integer
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		
		// Add the above two number and store it in a variable
		int res=fn-sn;
		
		// Put the result in ModelAndView
		mv.addObject("result",res);
		
		// redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	
	
	@RequestMapping(value = "calc",params = "btnMult")
	public ModelAndView getMult(String tbFn,String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		// Convert the String to integer
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		
		// Add the above two number and store it in a variable
		int res=fn*sn;
		
		// Put the result in ModelAndView
		mv.addObject("result",res);
		
		// redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
	
	
	
	@RequestMapping(value = "calc",params = "btnDiv")
	public ModelAndView getDiv(String tbFn,String tbSn)
	{
		ModelAndView mv=new ModelAndView();
		// Convert the String to integer
		int fn=Integer.parseInt(tbFn);
		int sn=Integer.parseInt(tbSn);
		
		// Add the above two number and store it in a variable
		int res=fn/sn;
		
		// Put the result in ModelAndView
		mv.addObject("result",res);
		
		// redirect user to display.jsp
		mv.setViewName("display.jsp");
		
		return mv;
	}
}
