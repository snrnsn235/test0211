package Java11;

import java.util.*;
import static java.util.Collections.*;

public class Ex11_19 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2); //반시계방향으로 두칸씩 이동
		System.out.println(list);
		
		swap(list, 0, 2);//인덱스가 0인것과 2인것을 바꿈
		System.out.println(list);
		
		shuffle(list); //저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list, reverseOrder()); //역순 정렬(reverse(list)와 같은 결과
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int idx = binarySearch(list, 3);//list에서 3이 어디 저장되어 있는지 확인
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max="+max(list)); //list 최대값
		System.out.println("min="+min(list)); //list 최소값
		System.out.println("min="+max(list, reverseOrder()));
		
		fill(list, 9); //9로 채움
		System.out.println("list=" + list);
		
		//list와 같은 크기의 새로운 list를 생성 후 2로 채운다
		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);
		
		//list와 newlist사이에 공통요소가 없으면 true
		System.out.println(disjoint(list, newList)); 
		
		//copy는 newlist에 있는 요소를 list에 복사하는 것
		copy(list, newList);
		System.out.println("newList=" + newList);
		System.out.println("list="+list);
		
		//2를 1로 바꾸는 것
		replaceAll(list, 2, 1);
		System.out.println("list=" + list);

		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2=" + list2);
	}

}