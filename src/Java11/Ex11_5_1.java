package Java11;

import java.util.*;

public class Ex11_5_1 {

	public static void main(String[] args) {
		HashSet list = new HashSet(); 
		//set�� collection�� �ڼ� �׷��� iterator�� �� �� �ִ�.
		//�׷��� HashSet���� get�̶�� �޼��尡 ����
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator(); // iterator�� 1ȸ��
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj + ", ");
		}
		System.out.println();
		
//		for(int i=0; i<list.size(); i++) {
//			Object obj = list.get(i);
//			System.out.println(obj + ", ");
//		}
	}

}
