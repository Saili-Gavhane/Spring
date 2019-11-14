package com.lti.service;

import java.util.List;

import com.lti.model.Player;

public interface PlayerService {

   public List<Player> findAll();
   
   public void addPlayer(Player p);
   
   public Player findById(int id);

}