package Java11;

import java.util.*;

public class Ex11_9 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		//���ڿ��� Integer(1)
		Set set = new HashSet();
		
		for(int i=0; i < objArr.length; i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		
		System.out.println("set = " + set);
		//set�� �ߺ������ �ȵǹǷ�  ��½� 1, 1, 2, 3, 4�� ���� 1�� ���ڿ� "1", Integer 1
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}