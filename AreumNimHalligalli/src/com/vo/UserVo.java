package com.vo;

public class UserVo {

	private String name = "";	//사용자 이름
	private String id = "";		//사용자 아이디
	private int order; 		//플레이어 순서 
	private int win;		//이긴 횟수 
	
	public UserVo() {
		super();
	}

	public UserVo(String name, String id, int order, int win) {
		super();
		this.name = name;
		this.id = id;
		this.order = order;
		this.win = win;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	@Override
	public String toString() {
		return "UserVo [name=" + name + ", id=" + id + ", order=" + order + ", win=" + win + "]";
	}



	
}
