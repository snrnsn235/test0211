package Java11;

import java.util.*;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1111");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է��ϼ���.");
			System.out.println("id : ");
			String id = s.nextLine();
			
			System.out.println("password : ");
			String password = s.nextLine().trim(); //trim()�յڰ�������
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�ٽ��Է���!!");
				continue;
			}
			if(!(map.get(id)).equals(password)) { 
				//map.get(id) => ������ Ű�� ��(value)�� ��ȯ / asdf�� Ű�� ��"1234"�� ��ȯ
				System.out.println("password �ٽ��Է���!!");
			} else {
				System.out.println("���ߴ�");
			}
		}
	}

}
