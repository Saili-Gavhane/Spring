package com.lti.runner;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Player;
import com.lti.service.PlayerService;

public class PlayerRunner {
	
	public static void main(String args[])
	{
		PlayerService service;
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		service = ctx.getBean("PlayerService",PlayerService.class);
		List<Player> list = service.findAll();
		
		for(Player p:list)
		{
			System.out.println(p);
		}
		
	}

}
