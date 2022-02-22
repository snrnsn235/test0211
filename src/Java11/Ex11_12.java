package Java11;

import java.util.*;

public class Ex11_12 {

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
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); //setB에서 하나 꺼낸다 4부터
			if(setA.contains(tmp)) //setA에 4가 있는지 확인/contaians가 확인하는 메서드
				setKyo.add(tmp); //4가 있는 것을 확인, tmp에 저장
		}
		//차집합
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) //setB에 없는 것만 차집합에 저장
				setCha.add(tmp);
		}
		
		//합집합
		//setA, setB에 있는 요소들을 모두 합집합에 저장한다
		//그럼 중복된 것은 없어질것임 / set은 중복을 허용하지 않기때문
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("A ∩ B =" + setKyo);
		System.out.println("A ∪ B =" + setHab);
		System.out.println("A - B =" + setCha);
	}

}