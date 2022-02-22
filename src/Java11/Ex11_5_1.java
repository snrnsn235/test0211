package Java11;

import java.util.*;

public class Ex11_5_1 {

	public static void main(String[] args) {
		HashSet list = new HashSet(); 
		//set은 collection의 자손 그래서 iterator를 쓸 수 있다.
		//그러나 HashSet에는 get이라는 메서드가 없다
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); // iterator은 1회용
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj + ", ");
		}
		System.out.println();
		
//		for(int i=0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj + ", ");
//		}
	}

}
