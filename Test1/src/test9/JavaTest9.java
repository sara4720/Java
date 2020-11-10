package test9;

/*
 * 날짜 : 2020/11/05
 * 이름 : 김사라
 * 내용 : 자바 다이아몬드 연습문제
 */
public class JavaTest9 {
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 1; i <=9; i++){
		
			if(i<=5)
				++count;                             // count 에 ++하면서 1로 만들어줌
			else 
				--count;                             // 6번째가 도ㅣ었을때 -- 를 하면서 하나씩 줄여줌
			
			for(int j =1; j<=5-count; j++) {
				System.out.print(" .");
	}
			
			for(int k=1; k<=2*count-1;k++) {
				System.out.print("*");
			}

			System.out.print("\n");
	}
	
	
	

	}
}
