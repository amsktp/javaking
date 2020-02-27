//14일차 20 02 27

//class는 extends	=> 상속한다.	=> 일반화
//interface는 implements => 구현한다.	=> 실체화

package com.tg.inter;

import java.util.Iterator;

public class FireTruck implements Car, Iterable {

	@Override
	public void sound() {
		// TODO Auto-generated method stub

		System.out.println("왜왜왜왱" + NUMBER);

	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("물대포!!");

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
