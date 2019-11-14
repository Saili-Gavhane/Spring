package com.lti.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller  //it maps where the incoming request will go
public class HelloWorld {

@RequestMapping(value="/hello",method=RequestMethod.GET)	
public ModelAndView sayHello()
{
	ModelAndView model = new ModelAndView("helloWorld");
	model.addObject("message","hello panda...you are lazy but equally cute and loveable");
	
	return model;
}
@RequestMapping(value="/hellopanda",method=RequestMethod.GET)
public ModelAndView HelloToName(@RequestParam String name)
{
	ModelAndView model = new ModelAndView("hellopanda");
	model.addObject("name",name);
	model.addObject("todaysDate",new Date());
	return model;
}

@RequestMapping(value="/hellonumber",method=RequestMethod.GET)
public ModelAndView numberCheck (@RequestParam int number)
{
	ModelAndView model = new ModelAndView("hellonumber");
	int count=0;
	  for(int i=1;i<=number;i++)
	  {
	  if(number%i==0)
	  count++;
	  }
	  if(count==2)
	  {
	  model.addObject("message","number is prime");
	  model.addObject("number",number);
	  }
	  else
	  {
		  model.addObject("message","number is not prime");
	  }
	  return model;
}
}
