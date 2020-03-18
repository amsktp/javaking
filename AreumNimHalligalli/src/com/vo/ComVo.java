package com.vo;

//안 씀
public class ComVo {

	private String id = "";		//컴퓨터플레이어 아이디 
	private int order = 0; 		//플레이어 순서 
	private int win = 0;		//이긴 횟수 
	
	public ComVo() {
		super();
	}

	public ComVo(String id, int order, int win) {
		super();
		this.id = id;
		this.order = order;
		this.win = win;
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
		return "ComVo [id=" + id + ", order=" + order + ", win=" + win + "]";
	}


	
}
