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
		
		Player p = new Player(5,"India","Batsman","MSD","24-APR-65",40000,300,200,5);
		service.addPlayer(p);
		
		
		//Player p2=service.findById(1);
		//System.out.println(p2);
		
		PlayerService service1 = ctx.getBean("jdbcService",PlayerService.class);
		Player p1 = new Player(6,"India","Batsman","MSD","24-APR-65",40000,300,200,5);
		service1.addPlayer(p1);
		System.out.println("inserted");
		
	}

}
