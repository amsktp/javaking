//이찬양
package str.exam;

public class StringLv4_2 {

	//생성자
	public StringLv4_2(StringLv4_2Vo sVo, String originStr
			,String originSen, String changeSen, int times) {

		sVo.setOriginStr(originStr);
		sVo.setChangeSen(changeSen);
		sVo.setOriginSen(originSen);
		sVo.setTimes(times);
	}

	//찾아바꾸기
	public void findReplace(StringLv4_2Vo sVo) {

		sVo.setChangeStr(sVo.getOriginStr());

		for (int i = 0; i < sVo.getTimes(); i++) {
			//실시간으로 바뀌는 "자바"의 인덱스 값
			sVo.setIndex(sVo.getChangeStr().indexOf(sVo.getOriginSen()));
			//횟수를 다 마치고 바꿀 문자열이 없다면 나가기
			if(sVo.getIndex() < 0 ) {
				break;
			}
			//바꿀 문장의 앞
			sVo.setBeforeStr(sVo.getChangeStr().substring(0, sVo.getIndex()));
			//바꿀 문장의 뒤
			sVo.setAfterStr(sVo.getChangeStr().substring(sVo.getIndex()+sVo.getOriginSen().length()));
			//"자바" -> "DB" 로 바꾸기
			sVo.setChangeStr(sVo.getBeforeStr() + sVo.getChangeSen() + sVo.getAfterStr());
		}

	}

	//출력문
	public void info(StringLv4_2Vo sVo) {
		System.out.println(sVo.getOriginStr());
		System.out.println(sVo.getChangeStr());
	}

}
