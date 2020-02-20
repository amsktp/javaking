//9일차 17.02.20 (목)
public class CardPlay {

		public static void main(String[] args) {
			
			String str = "";
			Card card = new Card();
			
			card.init();
			
			card.init(3,5);
			
			str = card.getCard();
			System.out.println(str);
			
			
		}

}
 

