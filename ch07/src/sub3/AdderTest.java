package sub3;
/*
 * 날짜: 2020/11/09
 * 이름 : 김사라
 * 내용 : 객체의 메모리 생상과 실행순서 
 */
public class AdderTest {

	public static void main(String[] args) {
		
		int [] arr = {10,20,30};                                        //  heap에 adder  new 객체 생성
		 
		Adder a = new Adder(100);                                       // x 하나 있는데 100으로 초기화 됨 (생성자 호출)  --> stack 에 a 있음 
		
		
		 
		a.add(100);                                                      
		System.out.println("객체 a의 멤버변수 x : " +a.getX());              
		
		a.add(a);                                                        
		System.out.println("객체 a의 멤버변수 x: " + a.getX());              
		
		a.add(arr);                                                     
		System.out.println("배열 arr의 1번째 원소 : " + arr[0]);            
		
		a = a.addNew(a);                                                
		System.out.println("객체 a의 멤버변수 x : "+a.getX());    
		
		 
		
	}
}
