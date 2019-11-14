package com.lti.repository;

import java.util.List;

import com.lti.model.Player;

public interface PlayerRepository {

	List<Player> findAll();

	void addPlayer(Player p);

	Player findById(int id);

}