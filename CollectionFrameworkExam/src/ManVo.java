public class ManVo {

		//Man 클래스 (사람이름, 키)
		
		//모든사람의 키 값을 출력하시오 (2사람)
		private String name = "";
		private int height = 0;
		
		public ManVo() {
			super();
		}
		
		public ManVo(String name, int height) {
			super();
			this.name = name;
			this.height = height;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		@Override
		public String toString() {
			return "Man [name=" + name + ", height=" + height + "]";
		}

}