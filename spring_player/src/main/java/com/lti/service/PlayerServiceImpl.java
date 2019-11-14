package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Player;
import com.lti.repository.PlayerRepository;

@Service("PlayerService")
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	PlayerRepository repository;

	public PlayerServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlayerServiceImpl(PlayerRepository repository) {
		super();
		this.repository = repository;
	}

	public List<Player> findAll(){
		return repository.findAll();
	}
	
	public void addPlayer(Player p)
	{
		repository.addPlayer(p);
	}
	
	public Player findById(int id)
	{
		return repository.findById(id);
	}

}
