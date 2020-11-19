package sub2;
/*
 * 날짜 : 2020/11/19
 * 이름 : 김사라
 * 내용 : 스레드 활용 실습하기 교재 p462
 */
public class CountThreadTest {

	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		
		
		// 메인스레드에서 파생된 서브스레드의 작업이 완료된 후 다시 메인스레드로 합류되도록 join() 실행 --> 
		// --> 메인스레드가 자식스레드의 작업을 기다린다.
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("결과 : "+count.getNum());
		
	}
}
