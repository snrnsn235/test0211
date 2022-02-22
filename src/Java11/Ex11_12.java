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
		
		//������
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); //setB���� �ϳ� ������ 4����
			if(setA.contains(tmp)) //setA�� 4�� �ִ��� Ȯ��/contaians�� Ȯ���ϴ� �޼���
				setKyo.add(tmp); //4�� �ִ� ���� Ȯ��, tmp�� ����
		}
		//������
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) //setB�� ���� �͸� �����տ� ����
				setCha.add(tmp);
		}
		
		//������
		//setA, setB�� �ִ� ��ҵ��� ��� �����տ� �����Ѵ�
		//�׷� �ߺ��� ���� ���������� / set�� �ߺ��� ������� �ʱ⶧��
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("A �� B =" + setKyo);
		System.out.println("A �� B =" + setHab);
		System.out.println("A - B =" + setCha);
	}

}