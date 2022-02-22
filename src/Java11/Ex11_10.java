package Java11;

import java.util.*;

public class Ex11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		//set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1; //1~45까지
			set.add(new Integer(num));
		}
//		System.out.println(set);
		//출력시 순서정렬없이 난수가 출력된다.
		//그래서 정렬을 하기위해 collection의 sort를 써야하는 데 쓸수없다.
		//정렬은 순서유지하는 것 그래서 list만 가능하기 때문에 (set은 순서상관없이)
		//그래서 set을 list로 옮기고 list를 정렬해야한다.

		//1. set의 모든 요소를 list에 저장
		List list = new LinkedList(set); 
		//2. list를 정렬
		Collections.sort(list);
		//3. list를 출력
		System.out.println(list);
	}

}