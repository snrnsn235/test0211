package Java11;

import java.util.*;

public class Ex11_5_2 {

	public static void main(String[] args) {
		Collection c = new HashSet();
		//set �������̽��� Collection�� �ڼ��̹Ƿ� �������� �ٰ��Ͽ� ����� �� �ֵ�.
		//�̷��� ���� ���� ������ HashSet�� �ƴ϶� TreeSet���� �ٲٸ�
		//Ŭ������ �ٲ������ �ؿ� �ڵ���� �ٽ� ����� ������
		//���������� �ٲ��� �ʾҴ� �� ��Ŭ����(HashSet, TreeSet)�� ����Ǵ� ��������
		//collection�� ���������� �߱⶧���̴�.
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator(); // iterator�� 1ȸ��
		
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
