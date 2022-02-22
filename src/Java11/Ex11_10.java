package Java11;

import java.util.*;

public class Ex11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		//set�� ũ�Ⱑ 6���� ���� ���� 1~45������ ������ ����
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) + 1; //1~45����
			set.add(new Integer(num));
		}
//		System.out.println(set);
		//��½� �������ľ��� ������ ��µȴ�.
		//�׷��� ������ �ϱ����� collection�� sort�� ����ϴ� �� ��������.
		//������ ���������ϴ� �� �׷��� list�� �����ϱ� ������ (set�� �����������)
		//�׷��� set�� list�� �ű�� list�� �����ؾ��Ѵ�.

		//1. set�� ��� ��Ҹ� list�� ����
		List list = new LinkedList(set); 
		//2. list�� ����
		Collections.sort(list);
		//3. list�� ���
		System.out.println(list);
	}

}