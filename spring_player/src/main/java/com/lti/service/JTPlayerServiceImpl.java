package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lti.model.Player;
import com.lti.repository.PlayerRepository;
@Service("jdbcService")
public class JTPlayerServiceImpl implements PlayerService {

	@Autowired
	@Qualifier("jdbcrepository")
	PlayerRepository repository;
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addPlayer(Player p) {
		repository.addPlayer(p);
		
	}

	public Player findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
