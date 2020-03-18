package exam;

import java.util.ArrayList;

public class Card {

	ArrayList halligaliCard = new ArrayList(56);

	public void cardDeck() {
		String temp = "";
		for (int i = 0; i < 4; i++) {
			// 별모양 카드 셋팅
			if (i == 0) {
				temp = "●";
				for (int n = 0; n < 5; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ●";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ●";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ●";
				for (int n = 0; n < 2; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ●";
				for (int n = 0; n < 1; n++) {
					halligaliCard.add(temp);
				}

				// 하트모양 카드 셋팅
			} else if (i == 1) {
				temp = "♥";
				for (int n = 0; n < 5; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♥";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♥";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♥";
				for (int n = 0; n < 2; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♥";
				for (int n = 0; n < 1; n++) {
					halligaliCard.add(temp);
				}
				// 클로버 카드모양 셋팅
			} else if (i == 2) {
				temp = "♣";
				for (int n = 0; n < 5; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♣";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♣";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♣";
				for (int n = 0; n < 2; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♣";
				for (int n = 0; n < 1; n++) {
					halligaliCard.add(temp);
				}
				// 스페이드 카드모양 셋팅
			} else if (i == 3) {
				temp = "♠";
				for (int n = 0; n < 5; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♠";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♠";
				for (int n = 0; n < 3; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♠";
				for (int n = 0; n < 2; n++) {
					halligaliCard.add(temp);
				}
				temp = temp + " ♠";
				for (int n = 0; n < 1; n++) {
					halligaliCard.add(temp);
				}
			}
		}
	}
}
