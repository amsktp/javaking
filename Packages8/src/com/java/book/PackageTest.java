//11일차 20 02 24

//패키지(package)란??
//	클래스의 묶음마다 패키지에는 클래스 또는 인터페이스를 포함시킬 수 있으며,
//	서로 관련한 클래스들끼리 그룹 단위로 묶어 놓음으로써 클래스를 효율적으로 관리할 수 있다.
//	같은 이름의 클래스 일지라도 서로 다른 패키지에 존재하는 것이 가능하므로,
//	자신만의 패키지 체계를 유지함으로써 다른 개발자가 개발한 클래스 라이브러리의 클래스와
//	이름이 충돌하는 것을 피할 수 있다.
//	지금까지는 단순히 클래스 이름으로만 클래스를 구분했지만 클래스의 실제 이름(full name)은
//	패키지명을 포함한 것이다.
//	클래스가 물리적으로 하나의 클래스파일(.class)인 것과 같이 패키지는 물리적으로 하나의 디렉토리이다.

//디렉토리가 하위 디렉토리를 가질 수 있는 것처럼, 패키지도 다른 패키지를 포함할 수 있으며
//점 "." 으로 구분한다.
//	- 하나의 소스파일에는 첫 번째 문장으로 단 한번의 패키지 선언만을 허용한다.
//	- 모든 클래스는 반드시 하나의 패키지에 속해야 한다.
//	- 패키지는 점"."을 구분자로 하며 계층구조로 구성할 수 있다.
//	- 패키지는 물리적으로 클래스 파일(.class)을 포함하는 하나의 디렉토리이다.
//
//	표현식
//		package 패키지명


//패키지 명명 규칙
//	대소문자를 모두 허용하지만, 클래스명과 쉽게 구분하기 위해서 소문자로 하는 것을 원칙으로 한다.



package com.java.book;

public class PackageTest {

	public static void main(String args[]) {
		
		
	}
}
