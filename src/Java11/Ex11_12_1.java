package Java11;

import java.util.*;

public class Ex11_12_1 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = "+setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = "+setB);
		System.out.println();
		
		//교집합
//		setA.retainAll(setB); //공통된 요소만 남기고 삭제
		//합집합
//		setA.addAll(setB);
		//차집합
		setA.removeAll(setB);// setB와 공통 요소 제거
		System.out.println(setA);
		
		
		
		
		System.out.println("A ∩ B =" + setKyo);
		System.out.println("A ∪ B =" + setHab);
		System.out.println("A - B =" + setCha);
	}

}