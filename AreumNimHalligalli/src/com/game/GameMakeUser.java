package com.game;

import java.util.ArrayList;
import java.util.HashMap;

public class GameMakeUser {
	//플레이어리스트
	private HashMap<Integer, String> playerMap = new HashMap<Integer, String>(); 
	//플레이어의 개인 카드리스트
	private HashMap<Integer, ArrayList<String>> playerCardMap = new HashMap<Integer, ArrayList<String>>();
	private int playernum = 4;	//게임 참여인원
	
	public GameMakeUser(){
		
	}
	public GameMakeUser(int playernum){
		this.playernum = playernum;
	}
	
	
	public HashMap<Integer, String> getPlayerMap() {
		return playerMap;
	}
	public void setPlayerMap(HashMap<Integer, String> playerMap) {
		this.playerMap = playerMap;
	}
	public HashMap<Integer, ArrayList<String>> getPlayerCardMap() {
		return playerCardMap;
	}
	public void setPlayerCardMap(HashMap<Integer, ArrayList<String>> playerCardMap) {
		this.playerCardMap = playerCardMap;
	}
	public int getPlayernum() {
		return playernum;
	}
	public void setPlayernum(int playernum) {
		this.playernum = playernum;
	}
	
	//원하는 참여인원만큼 플레이어 생성
	void creat() {
		for(int i =0; i<playernum; i++) {
			playerMap.put(i, "player"+(i+1));
		}
	}
	
	//플레이어의 카드리스트 생성
	void cardMap() {
		for(int i =0; i<playernum; i++) {
			playerCardMap.put(i, new ArrayList<String>());
		}
	}
	
}
