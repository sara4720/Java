package test5;
/*
 * 날짜 : 2020/11/26
 * 이름 : 김사라
 * 내용 : String, Wrapper 클래스 연습문제
 */
public class JavaTest5 {

	public static void main(String[] args) {
		

		String   strCsv = "60,72,82,86,92";
		String[] scores = strCsv.split(",");
		
		int total = 0;
		
		for(int i=0 ; i<scores.length ; i++) {
		
			total += Integer.parseInt(scores[i]);
			
		}
		
		System.out.println("총점 : "+total);	
	}	
}