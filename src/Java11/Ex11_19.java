package Java11;

import java.util.*;
import static java.util.Collections.*;

public class Ex11_19 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2); //�ݽð�������� ��ĭ�� �̵�
		System.out.println(list);
		
		swap(list, 0, 2);//�ε����� 0�ΰͰ� 2�ΰ��� �ٲ�
		System.out.println(list);
		
		shuffle(list); //����� ����� ��ġ�� ���Ƿ� ����
		System.out.println(list);
		
		sort(list, reverseOrder()); //���� ����(reverse(list)�� ���� ���
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		int idx = binarySearch(list, 3);//list���� 3�� ��� ����Ǿ� �ִ��� Ȯ��
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max="+max(list)); //list �ִ밪
		System.out.println("min="+min(list)); //list �ּҰ�
		System.out.println("min="+max(list, reverseOrder()));
		
		fill(list, 9); //9�� ä��
		System.out.println("list=" + list);
		
		//list�� ���� ũ���� ���ο� list�� ���� �� 2�� ä���
		List newList = nCopies(list.size(), 2);
		System.out.println("newList=" + newList);
		
		//list�� newlist���̿� �����Ұ� ������ true
		System.out.println(disjoint(list, newList)); 
		
		//copy�� newlist�� �ִ� ��Ҹ� list�� �����ϴ� ��
		copy(list, newList);
		System.out.println("newList=" + newList);
		System.out.println("list="+list);
		
		//2�� 1�� �ٲٴ� ��
		replaceAll(list, 2, 1);
		System.out.println("list=" + list);

		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2=" + list2);
	}

}