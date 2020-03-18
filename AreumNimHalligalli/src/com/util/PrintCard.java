package com.util;

import java.util.ArrayList;
import java.util.HashMap;

import com.card.Card;

public class PrintCard {
	
	Card card = new Card();
	
	HashMap<Integer, String[]> oneCard = new HashMap<Integer, String[]>();
	
	public void drawDeckList(String name, int cardNum) {
		System.out.print("[ "+ name +" ] : \t");
		for(int i=0; i<cardNum; i++) {
			System.out.print("▧");
		}
		System.out.println();
	}
	
	//카드 한장 그리기
	public void oneCard(String card) {
		drawOne(card);
		for(int n =0; n<3; n++) {	//oneCard.getKey
			for(int i=0; i<3; i++) {	//first,middle,last Arr
				System.out.print(oneCard.get(n)[i]);
			}System.out.println();
		}
	}

	
	//오픈된 카드들 그리기 
	public void cardInBoard(ArrayList<String> openCards) {
		String card = "";
		HashMap<Integer, String[]> fourCard = new HashMap<Integer, String[]>();
		
		int cnt = 0;
		
		//재배치 
		for(int i = 0; i< openCards.size();i++) {	//카드 가져옴 
			card = openCards.get(i);
			System.out.print(card);
			System.out.println();
			
			drawOne(card);
			for(int n = 0; n< 3; n++) {		//카드
				if(n % 3 == 0) {
					fourCard.put(cnt, oneCard.get(0));
					cnt++;
				}
				if(n % 3 == 1) {
					fourCard.put(cnt, oneCard.get(1)); 
					cnt++;
				}
				if(n % 3 == 2) {	
					fourCard.put(cnt, oneCard.get(2)); 
					cnt++;
				}
				
			}
		}
		
		
		//4장의 Card 출력
		for(int i = 0; i< fourCard.size(); i++) {	 
			if(i % 3 == 0) {	
				for(int m=0; m<3; m++) {	//first,middle,last Arr
					System.out.print(fourCard.get(i)[m]);
				}
				System.out.print("\t");
			}
		}
		System.out.println();
		for(int i = 0; i< fourCard.size(); i++) {	 
			if(i % 3 == 1) {	
				for(int m=0; m<3; m++) {	//first,middle,last Arr
					System.out.print(fourCard.get(i)[m]);
				}
				System.out.print("\t");
			}
		}
		System.out.println();
		for(int i = 0; i< fourCard.size(); i++) {	 
			if(i % 3 == 2) {	
				for(int m=0; m<3; m++) {	//first,middle,last Arr
					System.out.print(fourCard.get(i)[m]);
				}
				System.out.print("\t");
			}
		}
	}
	
	
	//카드 한장 3줄로 쪼개서 그리기 
	public HashMap<Integer, String[]> drawOne(String card) {
		String shape = card.charAt(0)+"";
		String number = card.charAt(1)+"";
		
		String[] firstArr = {"O","O","O"};
		String[] middleArr = {"O","O","O"};
		String[] lastArr = {"O","O","O"};
		
		switch(Integer.parseInt(number)) {
			case 1 : 
				middleArr[1] = shape;
				break;
			case 2 : 
				firstArr[0] = shape;
				lastArr[2] = shape;
				break;
			case 3 : 
				firstArr[0] = shape;
				middleArr[1] = shape;
				lastArr[2] = shape;
				break;
			case 4 : 
				firstArr[0] = shape;
				firstArr[2] = shape;
				lastArr[0] = shape;
				lastArr[2] = shape;
				break;
			case 5 : 
				firstArr[0] = shape;
				firstArr[2] = shape;
				middleArr[1] = shape;
				lastArr[0] = shape;
				lastArr[2] = shape;
				break;	
		}
		
		oneCard.put(0,firstArr);
		oneCard.put(1,middleArr);
		oneCard.put(2,lastArr);

		return oneCard;
	}
}
