package p45;

public class ScopeEx {
	
		int no; //1. 클래스 블럭 내에서 사용 가능한 변수
		
		public static void main(String[] args) { //2. main 메서드 블럭
			String name; //2. main 메서드 블럭 내에서 사용 가능한 변수
			
			if(true) {
				//메서드 블럭 안에서 선언한 변수 사용 가능
				name = "홍길동";
				
				//if문 블럭안에서 변수 선언
				String email = "hong@test.com";
				
		}

	}

}
