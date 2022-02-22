package Java11;

import java.util.ArrayList;
import java.util.*;

public class Ex11_1 {

	public static void main(String[] args) {
		//기본 길이(용량, capacity)가 10(인덱스가 0~9)인 Arraylist를 생성험
		ArrayList list1 = new ArrayList(10);
		//ArrayList에는 객체만 저장가능
		//autoboxing에 의해서 기본형이 참조형으로 자동변환된다.
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));//test
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		//ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		//ArrayList의 일부를 뽑아서 새로운 리스트를 만드는 것, 1<=x<4
		//sublist에서 만들어진 리스트는 읽기 전용이다. 그래서 새로운 ArrayList로 만들어줘야 읽어줄수 있다.
		print(list1, list2);
		
		//Collection은 인터페이스, Collections는 유틸 클래스
		Collections.sort(list1); //list1, 2를 정렬한다. 오름차순으로
		Collections.sort(list2);//Collections.sort(List l)
		print(list1, list2);
		
		//이문장은 list1가 list2가 가진 모든 것을 포함하고 있는지 확인하는 것 
		//0, 2 ,4 포함하고 있기 때문에 true
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //추가할 위치 인덱스가 3인 곳에 "A" 추가, 기존에 있는 것은 한칸식 이동
		print(list1, list2);
		
		list2.set(3, "AA"); //변경
		print(list1, list2);
		
		list1.add(0, "1"); //String타입 "1"이 들어감
		//indexOf()는 지정된 객체의 위치(인덱스)를 알려준다
		System.out.println("index=" + list1.indexOf(new Integer(1)));
//		list1.remove(5); //인덱스가 5인 객체를 삭제
		list1.remove(new Integer(4)); //5를 삭제
		print(list1, list2);
		
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		//list1.retainAll(list2)은 list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다
		for(int i=list2.size()-1;i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}

}