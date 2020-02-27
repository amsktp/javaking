//13일차 20 02 26 수
package com.tg.tryy;

import net.mega.MyInputUtil;

public class ExceptionEx6 {
//사용자가 잘못입력하면 0으로 무조건 출력하게끔 해라
	public static void main(String[] args) {

		MyInputUtil miu = new MyInputUtil();
		int n = miu.getUserInputNumber();
		System.out.println(n);

	}

}
