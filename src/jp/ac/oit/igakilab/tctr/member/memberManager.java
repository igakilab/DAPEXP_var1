package jp.ac.oit.igakilab.tctr.member;

public class memberManager {
	private String member_id;
	private String name;
	private String org;
	private String position;
	private int age;


	public String getId() {
		return member_id;
	}
	public void setId(String id) {
		this.member_id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}



}
