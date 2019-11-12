package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.model.Player;
@Repository("repository")
public class PlayerRepositoryImpl implements PlayerRepository {
	
	public List<Player> findAll()
	{
		Player p = new Player();
		p.setId(1);
		p.setCountry("India");
		p.setSpeciality("Batsman");
		p.setName("Virat Kohli");
		p.setDob("22-Feb-1991");
		p.setRuns(15000);
		p.setWickets(3);
		p.setHighestScore(183);
		p.setHighestWickets(2);
		
		Player p1 = new Player();
		p1.setId(7);
		p1.setCountry("India");
		p1.setSpeciality("Batsman");
		p1.setName("M S Dhoni");
		p1.setDob("07-Jul-1985");
		p1.setRuns(12000);
		p1.setWickets(5);
		p1.setHighestScore(200);
		p1.setHighestWickets(1);
		
		List<Player> list = new ArrayList<Player>();
		list.add(p);
		list.add(p1);
		return list;
		
	}

}
