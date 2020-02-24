//10일차 17.02.21 (금)
public class CardCase {

	int numOfCards = Card.shapeArr.length * Card.numberArr.length;

	Card [] cardArr = new Card[numOfCards];

	//카드 덱 만들기
	public CardCase() {
		int totalCnt = 0;

		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
				cardArr[totalCnt++] = new Card(i,n);
			}
		}
	}
	// 카드를 하나 선택한다
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick() {
		int index = 0;
		index = (int)(Math.random() * numOfCards);
		return cardArr[index];
	}
	
	
	void shuffle() {
		int rand = 0;
		Card card = null;
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random() * numOfCards);
			card = cardArr[0];
			cardArr[0] = cardArr[rand];
			cardArr[rand] = card;
		}
	}

	//전체 카드 보기
	void cardInSide() {
		for (int i = 0; i < numOfCards ; i++) {
			if ( i% 12 == 0) {
				System.out.println();
			} 
			String myCard = "";
			myCard = cardArr[i].getCard();

			System.out.print(myCard + "  ");

		}

	}

}