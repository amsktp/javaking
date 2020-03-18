package com.card;
 

/**
 * 
 * @author dkfma
 * 카드 클래스 
 * @param shapeArr 카드모양 종류
 * @param numberArr 카드숫자 종류
 * @param card 카드 모양과 숫자 조합 
 * 
 */
//HashMap drawCard(String card)-> print card로 옮기기 
public class Card {

	public static String[] shapeArr = { "♥", "◆", "♠", "♣"};
	public static String[] numberArr = { "1", "2", "3", "4", "5" };
	
	String card = "";

	public Card() {

	}

	public Card(int shapeIndex, int numberIndex) {
		init(shapeIndex, numberIndex);
	}
	
	//직접 뽑기
	void init(int shapeIndex, int numberIndex) {	
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	// 랜덤 한장
	void init() {
		// 모양 랜덤
		int shapeIndex = (int) (Math.random() * shapeArr.length);
		// 숫자 랜덤
		int numberIndex = (int) (Math.random() * numberArr.length);
		// ◆A
		card = shapeArr[shapeIndex] + numberArr[numberIndex];
	}
	
	String getCard() {
		return card;
	}
	
	
	
}
