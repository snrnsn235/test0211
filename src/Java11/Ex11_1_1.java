package Java11;

import java.util.*;

public class Ex11_1_1 {

	public static void main(String[] args) {
		final int LIMIT = 10; //�ڸ����� �ϴ� ���� ������ �����Ѵ�.
		String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length(); //43
		
		List list = new ArrayList(length/LIMIT +10); //ũ�⸦ �����Ӱ� ��´�.
		
		for(int i=0; i<length; i+= LIMIT) {
			if(i+LIMIT < length)
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		for(int i =0; i<list.size(); i++)
			System.out.println(list.get(i));
		
	}

}
