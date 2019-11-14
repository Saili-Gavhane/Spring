package com.lti.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.model.Player;
@Repository("repository")
public class PlayerRepositoryImpl implements PlayerRepository {
	
	DataSource datasource;

	
	
	public DataSource getDatasource() {
		return datasource;
	}

	@Autowired
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}


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
	
	public void addPlayer(Player p)
	{
		try
		{
			Connection con = getDatasource().getConnection();
			String query = "Insert into player values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1,p.getId());
			pstmt.setString(2, p.getCountry());
			pstmt.setString(3, p.getSpeciality());
			pstmt.setString(4, p.getName());
			pstmt.setString(5, p.getDob());
			
			
			pstmt.setInt(6, p.getRuns());
			pstmt.setInt(7, p.getWickets());
			pstmt.setInt(8, p.getHighestScore());
			pstmt.setInt(9, p.getHighestWickets());
			
			int i = pstmt.executeUpdate();
			
			if(i==1)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("failed");
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public Player findById(int id)
	{
		Player p = null;
		try
		{
			Connection con = getDatasource().getConnection();
			String query = "select * from player wher id=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1,id);
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				p = new Player();
				p.setId(rs.getInt(1));
				p.setCountry(rs.getString(2));
				p.setSpeciality(rs.getString(3));
				p.setName(rs.getString(4));
				p.setDob(rs.getString(5));
				p.setRuns(rs.getInt(6));
				p.setWickets(rs.getInt(7));
				p.setHighestScore(rs.getInt(8));
				p.setHighestWickets(rs.getInt(9));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return p;
	}

}
