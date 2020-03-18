package exam;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CardGame extends Card {

	Scanner scan = new Scanner(System.in);

	// 누가 이겼는지 알려주는 변수 true일때 지금 게임하는 사용자가 승리
	boolean whoWin = true;
	// 게임이 끝나서 다음라운드로 넘어가는지 확인하는 변수 true일때 다음라운드 넘어감
	boolean nextGame = false;
	// 각 유저별 낸 카드
	String cardStr[] = new String[4];
	// 나온 결과값들 뭉쳐서 5개인지 확인하려고 만든 변수
	String cardResult = "";
	// 5개가 나오면 아무글자나 입력하기
	String str = "";
	// 지금 가운데에 쌓인 카드뭉치의 갯수
	int cardBundle = 0;
	// 몇판째인지 카운트
	int round = 0;
	// 우승자
	String winner = "";
	// 우승자 점수
	int winnerScore = 0;

	// 카드 섞기
	public void shuffleCard() {
		String tempCard = "";
		int randomCardIndex = 0;
		for (int i = 0; i < 200; i++) {
			randomCardIndex = (int) (Math.random() * 56);
			tempCard = (String) halligaliCard.get(0);
			halligaliCard.set(0, halligaliCard.get(randomCardIndex));
			halligaliCard.set(randomCardIndex, tempCard);
		}
	}

	// 시작전 도움말
	public void beforeGame() {
		String result = "";

		System.out.println("■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ 할리갈리  □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■");
		System.out.println("□\t\t\t\t\t\t\t   □");
		System.out.println("■\t\t\t 게임 방법!\t\t\t   ■");
		System.out.println("□\t\t☞같은 도형의 수가 정확히 다섯개가 됐을때\t\t   □");
		System.out.println("■\t\t  어떤키든 누르고 엔터 치시면 승리합니다.\t\t   ■");
		System.out.println("□\t\t☞한 플레이어라도 소유한 카드가 0이되면\t\t   □");
		System.out.println("■\t      그시점에 가장 많은 카드를 소유한 플레이어가 승리합니다\t   ■");
		System.out.println("□ \t============================================\t   □");
		System.out.println("■\t\t\t\t\t\t\t   ■");
		System.out.println("□\t       게임을 시작하시려면 Y 입력후 엔터를 눌러주세요!!\t\t   □");
		System.out.println("■  □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □ ■ □");

		result = scan.next();
		if (result.equals("y") || result.equals("Y")) {
			return;
		} else {
			System.out.println("게임이 종료되었습니다");
			System.exit(0);
		}

	}

	// 본격적인 게임
	public void startGame(User[] user) {

		// 카드 생성
		cardDeck();
		// 카드 셔플
		shuffleCard();

		for (round = 1; round < 20; round++) {
			// 카드 셔플
			shuffleCard();

			// 카드뭉치 초기화
			cardBundle = 0;

			// cardStr 초기화
			for (int n = 0; n < cardStr.length; n++) {
				cardStr[n] = "";
			}

			for (int i = 0; i < 14; i++) {
				whoWin = true;
				nextGame = false;
				cardResult = "";

				for (int j = 0; j < 4; j++) {
					clearScreen();
					// 몇판째인지 알려주기
					System.out.println("======================== " + round + "번쨰 판 입니다 ========================");

//					user[1].cardNum = 0;

					// 한 플레이어가 소지한 카드가 0개가 되어 게임이 끝날경우
					finishGame(user, j);

					System.out.println();
					System.out.println("\t\t\t쌓인 카드 : " + cardBundle);

					// 각 유저의 카드 수, 카드뭉치 수 카운트
					user[j].cardNum--;
					cardBundle++;

					// 위에 플레이어 목록 표시
					playerList(user);

					System.out.println();

					// 각 플레이어별 카드 분배
					cardDispense(user, i, j);

					// 각 플레이어별 카드 내기
					System.out.println(cardStr[0] + cardStr[1] + cardStr[2] + cardStr[3]);

					// 도형갯수가 5개가 되어 누가 이길지
					whoIsWinner(user, j);

					System.out.println();
					System.out.println();
					System.out.println("=============================================================");
					secondWait();
					if (nextGame == true) {
						secondWait();
						break;
					}
				}
				if (nextGame == true) {
					secondWait();
					break;
				}
			}
		}
	}

	// 도형의 갯수가 몇개인지 확인하는 메서드
	public static int count(String src, String target) {
		int count = 0; // 찾은 횟수
		int pos = 0; // 찾기 시작할 위치
		while (true) {
			pos = src.indexOf(target, pos);
			if (pos != -1) {
				count++;
				pos += target.length();
			} else {
				break;
			}
		}
		return count;
	}

	// 각 플레이어별 카드 분배
	public void cardDispense(User[] user, int i, int j) {
		if (j == 0) {
			cardStr[0] = String.format("%-15s\t", halligaliCard.get(user[j].cardNum - i - 1));
		} else {
			int tempIndexNum = 0;
			for (int n = 0; n < j + 1; n++) {
				tempIndexNum = tempIndexNum + user[n].cardNum;
			}
			cardStr[j] = String.format("%-15s\t", halligaliCard.get(tempIndexNum - i - 1));
		}
	}

	// 위에 플레이어 목록 표시
	public void playerList(User[] user) {
		System.out.println("  [you]");
		for (int n = 0; n < user.length; n++) {
			System.out.format("%s ( %d ) \t", user[n].name, user[n].cardNum);
		}
	}

	// 게임이 끝날경우
	public void finishGame(User[] user, int j) {

		// 한명이라도 카드 다 소진했다면 게임 종료
		if (user[j].cardNum == 0) {
			winnerScore = user[0].cardNum;
			winner = user[0].name;
			for (int n = 0; n < user.length - 1; n++) {
				if (winnerScore < user[n].cardNum) {
					winner = user[n].name;
					winnerScore = user[n].cardNum;
				}
			}
			System.out.println("☆\t\t\t\t\t\t\t         ☆");
			System.out.println("★\t\t\t  승부가 났습니다!\t\t\t         ★");
			System.out.println("☆\t\t승자는 " + winner + " 입니다! 축하합니다!    점수 : " + winnerScore + "\t         ☆");
			System.out.println("★\t\t\t\t\t\t\t         ★");
			System.out.println("☆\t\t\t게임을 종료합니다\t\t\t         ☆");
			System.out.println("★\t\t\t\t\t\t\t         ★");
			System.out.println("☆\t\t\t\t\t\t\t         ☆");
			System.out.println(
					"★      ★    ☆    ★    ☆    ★    ☆    ★    ☆    ★    ☆    ★    ☆    ★    ☆    ★    ☆    ★    ☆    ★    ☆     ★");
			System.exit(0);
		}

	}

	// 도형 갯수로 승자 가리는 메서드
	public void whoIsWinner(User[] user, int j) {

		// 각 도형의 수가 5개인지 카운트
		int winNum1 = 0;
		int winNum2 = 0;
		int winNum3 = 0;
		int winNum4 = 0;

		// 5개의 도형이 있는지 확인하는 부분
		cardResult = cardStr[0] + cardStr[1] + cardStr[2] + cardStr[3];
		winNum1 = count(cardResult, "●");
		winNum2 = count(cardResult, "♠");
		winNum3 = count(cardResult, "♣");
		winNum4 = count(cardResult, "♥");
		whoWin = true;
		if (winNum1 == 5 || winNum2 == 5 || winNum3 == 5 || winNum4 == 5) {
			str = "";
			System.out.println();
			System.out.println();
			System.out.println("=============================================================");

			// user가 늦게 벨을 울렸을 시 상대 승리, 일찍 울리면 user 승리
			bell(user, j);

		}
	}

	// 벨을 누가먼저 울릴지
	public void bell(User[] user, int j) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			public void run() {
				System.out.println();
				System.out.println("\t띵~~ 상대가 먼저 종을 쳤습니다! 아무키나 입력후 엔터눌러주세요");
				whoWin = false;
			}
		};
		// 도형이 5개가 된 이후 1초이상 넘어가면 상대 승리
		timer.schedule(task, 1000);
		str = scan.next();
		timer.cancel();
		if (whoWin == false) {
			if (j != 0) {
				user[j].cardNum = user[j].cardNum + cardBundle;
				System.out.println("\t\t\t너무 늦게 입력하셨습니다.");
				System.out.println("\t\t\t" + user[j].name + "님의 승리입니다.");

			} else {
				user[j + 1].cardNum = user[j + 1].cardNum + cardBundle;
				System.out.println("\t\t\t너무 늦게 입력하셨습니다.");
				System.out.println("\t\t\t" + user[j + 1].name + "님의 승리입니다.");
			}
			nextGame = true;
		} else {
			user[0].cardNum = user[0].cardNum + cardBundle;
			System.out.println("\t\t\t     띵~~");
			System.out.println("\t\t\t      축하합니다\t\t");
			System.out.println();
			System.out.println("\t\t\t" + user[0].name + "님의 승리입니다.");
			System.out.println();
			nextGame = true;
		}
	}

	// 콘솔창 화면 클리어
	public static void clearScreen() {
		for (int i = 0; i < 10; i++)
			System.out.println("");
	}

	// 약 1.5 초 기다리는 메소드 카드 내는 속도
	public void secondWait() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
