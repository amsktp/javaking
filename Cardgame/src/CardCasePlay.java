////10일차 17.02.21 (금)
public class CardCasePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		CardCase cardCase = new CardCase();


		Card card = null;

		card= cardCase.pick();
		cardCase.shuffle();
		cardCase.cardInSide();
		
		System.out.println(card.getCard());
//		cardCase.cardInSide();

//		cardCase.shuffle();
//		cardCase.cardInSide();
//		
	}

}
