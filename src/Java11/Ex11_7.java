package Java11;

import java.util.*;

public class Ex11_7 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); //String의 Comparable구현에 의한 정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
		//대문자가 먼저 오는 것을 확인할 수 있다.
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		// String.CASE_INSENSITIVE_ORDER은 정렬기준/ strArr은 정렬대상
		//CASE_INSENSITIVE_ORDER은 대소문자 구분안한다
		System.out.println("strArr = " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());//역순정렬
		System.out.println("strArr = " + Arrays.toString(strArr));
	}
}

class Descending implements Comparator { 
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 =(Comparable)o1;
			Comparable c2 =(Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		return -1;
	}
}