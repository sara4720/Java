package sub2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * ��¥ : 2020/11/17
 * �̸� : ����
 * ���� : Collection TreeSet �ǽ��ϱ� ���� p361
 */
public class TreeSetTest {

	public static void main(String[] args) {
		
	 Set<Integer> tree = new TreeSet<>();
	 tree.add(23);
	 tree.add(10);
	 tree.add(48);
	 tree.add(15);
	 tree.add(7);
	 tree.add(22);
	 tree.add(56);
	 
	 Iterator<Integer> iter = tree.iterator();
	 
	 while(iter.hasNext()) {
		 System.out.println(iter.next());
	 }
		
		
		
		
		
		
		
		
		
	}
}
