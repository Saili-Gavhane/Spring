package com.lti.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lti.model.Player;
@Repository("jdbcrepository")
public class JTPlayerRepository implements PlayerRepository
{
@Autowired
JdbcTemplate jdbctemplate;
	public JdbcTemplate getJdbctemplate() {
	return jdbctemplate;
}

public void setJdbctemplate(JdbcTemplate jdbctemplate) {
	this.jdbctemplate = jdbctemplate;
}

	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addPlayer(Player p) {
		System.out.println("adding through jdbc");
		String query = "Insert into player(id,name,country) values("+p.getId()+",'"+p.getName()+"','"+p.getCountry()+"')";
		System.out.println(jdbctemplate.update(query));
		
	}

	public Player findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
