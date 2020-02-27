//이찬양
package str.exam;

public class StringLv4_2Vo {

	//기존문장
	private String originStr = ""; 
	//바꾼문장
	private String changeStr = "";
	
	//이전 바꿀 문자열
	private String originSen = "";
	//이후 바뀐 문자열
	private String changeSen = "";
	//바꿀 문자열 이전까지의 문자열
	private String beforeStr = "";
	//바꿀 문자열이후의 문자열
	private String afterStr = "";
	//몇번 실행할지
	private int times = 0;
	//"자바"의 인덱스값
	private int index = 0;
	
	public StringLv4_2Vo() {
	
	}
	
	public String getOriginStr() {
		return originStr;
	}

	public void setOriginStr(String originStr) {
		this.originStr = originStr;
	}

	public String getChangeStr() {
		return changeStr;
	}

	public void setChangeStr(String changeStr) {
		this.changeStr = changeStr;
	}

	public String getOriginSen() {
		return originSen;
	}

	public void setOriginSen(String originSen) {
		this.originSen = originSen;
	}

	public String getChangeSen() {
		return changeSen;
	}

	public void setChangeSen(String changeSen) {
		this.changeSen = changeSen;
	}

	public String getBeforeStr() {
		return beforeStr;
	}

	public void setBeforeStr(String beforeStr) {
		this.beforeStr = beforeStr;
	}

	public String getAfterStr() {
		return afterStr;
	}

	public void setAfterStr(String afterStr) {
		this.afterStr = afterStr;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	

}
