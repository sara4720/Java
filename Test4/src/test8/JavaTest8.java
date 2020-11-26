package test8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 날짜 : 2020/11/26
 * 이름 : 김사라
 * 내용 : 로또 번호 생성기
 */
public class JavaTest8 {

	public static void main(String[] args) {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {  //무한반복
			int num = (int) Math.ceil(Math.random()*45);
			
			lottoSet.add(num);
			
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		Iterator<Integer> iter = treeSet.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}
}
