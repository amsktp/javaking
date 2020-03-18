package com.card;

import java.util.ArrayList;
import java.util.Collections;
 

/**
 * 
 * @author dkfma
 * @param cardList 카드 56장 
 * 
 * 카드 56장은
 * "♥", "◆", "♠", "♣" 모양당 14장씩이며
 * 하나의 모양에는 
 * 1개가 5장
 * 2개가 3장
 * 3개가 3장
 * 4개가 2장
 * 5개가 1장
 * 이 있다. ((5+3+3+2+1)*4 = 56)
 */
public class CardDeck extends Card{
	
	public ArrayList<String> cardList = new ArrayList<String>();
	
	
	public CardDeck() {		 
		
	}
	
	//56장을 만든다.
	public void create() {
		for(int i=0;i<Card.shapeArr.length;i++) {
			for(int j=0;j<Card.numberArr.length;j++) {
				switch(j) {
					case 0: 
						for(int n=0; n<5; n++) {
							Card card = new Card(i,j);
							cardList.add(card.card);
						}
						break;
					case 1: 
						for(int n=0; n<3; n++) {
							Card card = new Card(i,j);
							cardList.add(card.card);
						}
						break;
					case 2: 
						for(int n=0; n<3; n++) {
							Card card = new Card(i,j);
							cardList.add(card.card);
						}
						break;
					case 3: 
						for(int n=0; n<2; n++) {
							Card card = new Card(i,j);
							cardList.add(card.card);
						}
						break;
					case 4: 
						Card card = new Card(i,j);
						cardList.add(card.card);
						break;
				}
			}
		}
	}
	
	void pick(int index) {
		String card = cardList.get(index);
		System.out.println(card +" ");
	}
	

	
	//카드를 랜덤으로 하나 선택한다.
	String pick() {
		int index = 0;
		index = (int)(Math.random() * cardList.size());
		return cardList.get(index);
	}
		
				
	//카드 섞기
	public void shuffle() {
		Collections.shuffle(cardList);
	}
	
	//전체 카드 보기 
	void cardCaseInSide() {
		for (int i = 0; i < cardList.size(); i++) {
			String myCard = "";
			myCard = cardList.get(i);
			
			System.out.print(myCard + " ");
			if((i+1) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
