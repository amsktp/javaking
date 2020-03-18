//이찬양 할리갈리..

//질문 있습니다 ㅠㅠ
//nextLine()이 실행되기전에 그냥 콘솔창에 글자를 입력하면 nextLine()이 시작될때 바로 아까 입력한
//문자가 입력돼서 문제가 생겨요 ㅠㅠ
//nextLine()이 시작되기전에 입력하면 문제가 생기게 하거나 못하게 막고싶은데 방법이 있을까요??

package exam;

import java.util.ArrayList;

public class HalligaliMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User[] user = new User[4];
		user[0] = new User("이찬양");
		user[1] = new User("컴퓨터1");
		user[2] = new User("컴퓨터2");
		user[3] = new User("컴퓨터3");

		CardGame c = new CardGame();
		c.beforeGame();
		c.startGame(user);

	}

}
