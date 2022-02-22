package Java11;

import java.util.ArrayList;
import java.util.*;

public class Ex11_1 {

	public static void main(String[] args) {
		//�⺻ ����(�뷮, capacity)�� 10(�ε����� 0~9)�� Arraylist�� ������
		ArrayList list1 = new ArrayList(10);
		//ArrayList���� ��ü�� ���尡��
		//autoboxing�� ���ؼ� �⺻���� ���������� �ڵ���ȯ�ȴ�.
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));//test
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		//ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		//ArrayList�� �Ϻθ� �̾Ƽ� ���ο� ����Ʈ�� ����� ��, 1<=x<4
		//sublist���� ������� ����Ʈ�� �б� �����̴�. �׷��� ���ο� ArrayList�� �������� �о��ټ� �ִ�.
		print(list1, list2);
		
		//Collection�� �������̽�, Collections�� ��ƿ Ŭ����
		Collections.sort(list1); //list1, 2�� �����Ѵ�. ������������
		Collections.sort(list2);//Collections.sort(List l)
		print(list1, list2);
		
		//�̹����� list1�� list2�� ���� ��� ���� �����ϰ� �ִ��� Ȯ���ϴ� �� 
		//0, 2 ,4 �����ϰ� �ֱ� ������ true
		System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //�߰��� ��ġ �ε����� 3�� ���� "A" �߰�, ������ �ִ� ���� ��ĭ�� �̵�
		print(list1, list2);
		
		list2.set(3, "AA"); //����
		print(list1, list2);
		
		list1.add(0, "1"); //StringŸ�� "1"�� ��
		//indexOf()�� ������ ��ü�� ��ġ(�ε���)�� �˷��ش�
		System.out.println("index=" + list1.indexOf(new Integer(1)));
//		list1.remove(5); //�ε����� 5�� ��ü�� ����
		list1.remove(new Integer(4)); //5�� ����
		print(list1, list2);
		
		
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		//list1.retainAll(list2)�� list1���� list2�� ��ġ�� �κи� ����� �������� �����Ѵ�
		print(list1, list2);
		
		//list2���� list1�� ���Ե� ��ü���� �����Ѵ�
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