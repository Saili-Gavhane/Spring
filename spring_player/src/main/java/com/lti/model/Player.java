package com.lti.model;

public class Player {
	
	int id;
	String country;
	String speciality;
	String name;
	String dob;
	int runs;
	int wickets;
	int highestScore;
	int highestWickets;
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Player(int id, String country, String speciality, String name, String dob, int runs, int wickets,
			int highestScore, int highestWickets) {
		super();
		this.id = id;
		this.country = country;
		this.speciality = speciality;
		this.name = name;
		this.dob = dob;
		this.runs = runs;
		this.wickets = wickets;
		this.highestScore = highestScore;
		this.highestWickets = highestWickets;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}
	public int getHighestWickets() {
		return highestWickets;
	}
	public void setHighestWickets(int highestWickets) {
		this.highestWickets = highestWickets;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", country=" + country + ", speciality=" + speciality + ", name=" + name + ", dob="
				+ dob + ", runs=" + runs + ", wickets=" + wickets + ", highestScore=" + highestScore
				+ ", highestWickets=" + highestWickets + "]";
	}

}
