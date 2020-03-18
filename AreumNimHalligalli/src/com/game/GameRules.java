package com.game;

import java.util.ArrayList;

import com.card.Card;
import com.card.CardDeck;
import com.util.PrintCard;


/**
 * 
 * @author dkfma
 * 1. 잘 섞은 카드를 플레이어수(4명) 만큼 모두 똑같이 나눠 갖는다.
 * 2. 카드더미를 플레이어는 볼 수 없다. 
 * 3. 플레이어 순서에 따라 카드 1장씩 오픈한다. 
 * 4. 오픈한 카드의 같은모양의 총 개수가 딱! 5개일때 땡(hitPoint)을을 친다. 
 * 5. 5개가 나오지 않으면 나올때까지 계속 누적해서 오픈한다. 
 * 6. 5개를 맞춘 플레이어가 누적된 카드를 모두 가져간다.
 * 7. 틀리게 땡을 친 플레이어는 다른 플레이어들에게 1장씩 나눠준다.(누적카드는 계속 이어서 진행한다.)
 * 8. 이를 계속 반복하다가 자신의 카드가 다 사라지면 게임에서 탈락한다.
 * 9. 최종적으로 가장 카드를 많이 가진 플레이어가 승리한다. (1명 탈락이 나오면 집계)
 */
public class GameRules extends GameSetting{
	
	CardDeck deck = new CardDeck();
	PrintCard pc = new PrintCard();
	
	public int personNum = 4;	//참여인원		//->변수정리하기
	public GameMakeUser makePlayers = new GameMakeUser(personNum); 
	
	ArrayList<String> inBoard = new ArrayList<String>();	//게임판 위 오픈되는 카드들
	
	boolean hitPoint = false; // 5개가 되는 순간
	
	//카드 참여인원 만큼 나누기 
	public void divideCards() {
		int num = makePlayers.getPlayernum();	//참여인원
		makePlayers.creat();	//플레이어 생성
		makePlayers.cardMap();	//플레이어 카드리스트 생성
		
		deck.create();	//카드 56장 생성
		deck.shuffle();	//카드 섞음
		
		
		//인원당 카드 나누는 범위
		ArrayList<Integer> startNum = new ArrayList<Integer>();	//범위시작숫자
		for(int i = 0; i< num ; i++) {
			startNum.add(deck.cardList.size()/num * i);
			//System.out.println(startNum.get(i));
		}
		
		ArrayList<Integer> limitNum = new ArrayList<Integer>();	//범위제한숫자
		for(int i =0; i< num ; i++) {
			limitNum.add(deck.cardList.size()/num * (i+1) );
			//System.out.println(limitNum.get(i));
		}
		
		//플레이어 카드맵에 해당 범위로 나눈 덱카드들을 저장함.
		for(int n = 0; n< num; n++) {
			for(int i=startNum.get(n); i<limitNum.get(n); i++) {
				makePlayers.getPlayerCardMap().get(n).add(deck.cardList.get(i));
			}
		}
		
		/*
		//TEST : 플레이어들에게 나눈 카드 출력 
		for(int i= 0; i< 4; i++) {
			System.out.println(makePlayers.getPlayerCardMap().get(i));
		}
		System.out.println();
		*/
	}
	
	
	//플레이어들의 카드덱 출력
	public void drawPlayDeck() {
		String name = "";
		System.out.println("------------ 카드소유 현황 ------------");
		for(int i= 0; i< 4; i++) {
			if(i == user.getOrder()) {
				name = user.getId();
			}else{
				name = makePlayers.getPlayerMap().get(i);
			}
			int size = makePlayers.getPlayerCardMap().get(i).size();
		
			pc.drawDeckList(name, size);
		}
		System.out.println("----------------------------------");
	}
	
	
	//오픈된 카드들만 출력
	public void drawInBoardCards() {
//		한장씩 출력
//		for(int i =0; i<inBoard.size();i++) {
//			String card = inBoard.get(i);
//			pc.oneCard(card);
//		}
		//inBoard의 마지막 4장만 일렬로 출력
		ArrayList<String> fourinBoard = new ArrayList<String>();	//게임판 위 오픈되는 카드들
		
		if(inBoard.size() == 1) {
			pc.cardInBoard(inBoard);
		}else if(inBoard.size() == 2) {
			pc.cardInBoard(inBoard);
		}else if(inBoard.size() == 3) {
			pc.cardInBoard(inBoard);
		}else {
			for(int i=inBoard.size()-4; i< inBoard.size();i++) {				
				fourinBoard.add(inBoard.get(i));;
			}
			pc.cardInBoard(fourinBoard);
		}
	}
	
	
	//오픈하지 않고 건너뜀, 카드덱만 보여줌 
	public void noOpen() {
		drawPlayDeck();
		drawInBoardCards();
	}
	
	
	//플레이어 순서에 따라 한장씩 오픈 
	public void open(int order) {
		
		String temp = "";
		//매개변수값이랑 플레이어순서랑 일치하면 그 플레이어덱에서 첫장을 inBoard로 옮김
		for(int i = 0; i<makePlayers.getPlayernum();i++) {
			if(order == i) {
				//각 플레이어들 카드덱
				ArrayList<String> playerDeck = makePlayers.getPlayerCardMap().get(i);
				temp = playerDeck.get(0);

				inBoard.add(temp);
				playerDeck.remove(0);
				break;
			}
		}
		
		drawPlayDeck();
		drawInBoardCards();
	}
	
	
	//5개를 맞췄을 경우 inBoard에 있는 카드를 모두 가져옴
	public void success(int order) {
		
		for(int i = 0; i<makePlayers.getPlayernum();i++) {
			if(order == i) {
				//각 플레이어들 카드덱
				ArrayList<String> playerDeck = makePlayers.getPlayerCardMap().get(i);
				playerDeck.addAll(inBoard); //order차례의 플레이어 카드덱에 inBoard카드들을 추가
				break;
			}
		}
		inBoard.clear();
	}
	
	
	//틀렸을 경우 다른 플레이어에게 한장씩 나눠줌
	public void fail(int order) {
		int num = makePlayers.getPlayernum();	// 참여인원수
		ArrayList<String> temp = new ArrayList<String>(num-1);
		
		//내가 만약 틀렸는데 남은카드가 3장 이하라서 다 나눠줄 카드가 없는 경우(나눠주고 없는 경우)
		if(makePlayers.getPlayerCardMap().get(order).size() < num) {
			makePlayers.getPlayerCardMap().get(order).clear();
			return;
		}
		
		//temp[]에 틀린 플레이어의 0번째 1번째 2번째 인덱스값(num개)을 저장한다.
		for(int i = 0; i<num; i++) {
			if(order == i) {
				//각 플레이어들 카드덱
				ArrayList<String> playerDeck = makePlayers.getPlayerCardMap().get(i);
				
				for(int n = 0; n< num-1 ; n++) {
					temp.add(playerDeck.get(n));
					//System.out.println("playerDeck.get(i) : " + playerDeck.get(n));
				}
			}
		}
		
		//다른 플레이어들의 카드덱에 temp를 추가시킨다.
		for(int i = 0; i<num; i++) {
			if(order != i) {
				//각 플레이어들 카드덱
				ArrayList<String> playerDeck = makePlayers.getPlayerCardMap().get(i);
				
				playerDeck.add(temp.get(0));
				temp.remove(0);
			}
		}
		
		//틀린 플레이어의 0번째 인덱스값을 삭제한다.
		for(int i = 0; i< num ;i++) {
			if(order == i) {
				//각 플레이어들 카드덱
				ArrayList<String> playerDeck = makePlayers.getPlayerCardMap().get(i);
				
				for(int n = num-2; n >= 0 ; n--) {
					playerDeck.remove(n);
				}
			}
		}
		/*
		//TEST : 플레이어들에게 나눈 카드 출력 
		for(int i= 0; i< 4; i++) {
			System.out.println(makePlayers.getPlayerCardMap().get(i));
		}*/
		
	}
	
	
	//inBoard의 카드에서 마지막 4개의 인덱스 값만 확인
	//그 값의 모양들이 같을 때 개수가 딱 5개이면 hitPoint를 true로 변경 (종소리 땡!)
	public boolean checkFive() {
//		//TEST : inBoard 출력
//		for(int i =0; i<inBoard.size();i++) {
//			System.out.print(inBoard.get(i));
//		} System.out.println();
		
		Card card = new Card();	//원본카드
		int sumFive = 0;	//숫자합계
		
		//마지막 인덱스 4개 번호 
		int[] idxArr = new int[4];
		for(int i = 0 ; i<idxArr.length; i++) {
			idxArr[i] = inBoard.size()-1 -i;	
			//System.out.println("idx[i] : "+ idxArr[i]);
		}
		//inBoard의 idx번째 값의 모양값
		String[] shapeArr = new String[4];
		for(int i = 0 ; i<shapeArr.length; i++) {
			if(idxArr[i] < 0) {	//inBoard의 카드 총개수가 4개가 안 될 경우 음수가 나옴
				shapeArr[i] = "○";	//카드비교를 위한 완전 다른 문자
			}else {
				shapeArr[i] = inBoard.get(idxArr[i]).charAt(0) + "";
			}
			//System.out.println("shape[i] : "+ shapeArr[i]);
		}
		//inBoard의 idx번째 값의 숫자값
		int[] numberArr = new int[4];
		for(int i = 0 ; i<shapeArr.length; i++) {
			if(idxArr[i] < 0) {	//inBoard의 카드 총개수가 4개가 안 될 경우 음수가 나옴
				numberArr[i] = 0;	//영향이 없도록 0
			}else {
				numberArr[i] = Character.getNumericValue(inBoard.get(idxArr[i]).charAt(1));
			}
			//System.out.println("numberArr[i] : "+ numberArr[i]);
		}
		
		
		//shape[]의 모양이 같은지 비교해서 같으면 sumFive에 합을 구함
		for(int i=0; i<card.shapeArr.length; i++) {
			for(int n =0; n<idxArr.length; n++) {
				if(shapeArr[n].equals(card.shapeArr[i])) {
					sumFive = sumFive + numberArr[n];
				}
			}
			//sumFive가 5이면 hitPoint true
			if(sumFive == 5) {
				//System.out.println(sumFive);
				hitPoint = true;
				return hitPoint;	
			}else {
				//System.out.println(sumFive);
				hitPoint = false;
				sumFive = 0;	//리셋
			}
		}
		
		return hitPoint;
	}
	
	
	//결과 체크 - 누가 가장 많은가 
	public boolean result() {
		int maxNum = 0;
		int winnerIdx = 0;
		
        for(int i=0; i<makePlayers.getPlayerCardMap().size(); i++){
            if(makePlayers.getPlayerCardMap().get(i).size() > maxNum){
                maxNum = makePlayers.getPlayerCardMap().get(i).size();
                winnerIdx = i;
            }
        }
		//System.out.println("winner: "+winnerIdx);
		
		if(user.getOrder() == winnerIdx) {	//가장많이 가진사람 인덱스와 일치시 
			return true;
		}
		
		return false;
	}
	
}
