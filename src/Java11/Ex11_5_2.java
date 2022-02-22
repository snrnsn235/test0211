package Java11;

import java.util.*;

public class Ex11_5_2 {

	public static void main(String[] args) {
		Collection c = new HashSet();
		//set 인터페이스는 Collection의 자손이므로 다형성에 근거하여 사용할 수 있따.
		//이렇게 했을 때의 장점은 HashSet이 아니라 TreeSet으로 바꾸면
		//클래스가 바뀌었으니 밑에 코드들을 다시 살펴야 하지만
		//참조변수가 바뀌지 않았다 이 두클래스(HashSet, TreeSet)의 공통되는 리모콘인
		//collection을 참조변수로 했기때문이다.
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator(); // iterator은 1회용
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj + ", ");
		}
		System.out.println();
		
//		for(int i=0; i<c.size(); i++) {
//			Object obj = c.get(i);
//			System.out.println(obj + ", ");
//		}
	}

}
