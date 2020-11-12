package Test1;
/*
 * 날짜 : 2020/11/12
 * 이름 : 김사라
 * 내용 : 배열 문자 출력하기
 */
public class Test1 {
	
	public static void main(String[] args) {
		char str[]={'I',' ','L','O','V','E',' ','Y','O','U'};
		int row, col;
		
		for(row = 1; row<10; row++) {
			for(col = 0; col<=row; col++) {
				System.out.print(str[col]);
			}
			System.out.print("\n");
		}
	}

}
