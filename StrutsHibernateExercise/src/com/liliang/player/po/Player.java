package com.liliang.player.po;

public class Player {
	private String id;
	private String name;
	private int level;
	private String race;
	private String profession;
	
	/*public Player(){
	}
	
	public Player(String name,int level,String race,String profession){
		this.name=name;
		this.level=level;
		this.race=race;
		this.profession=profession;
	}*/
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
