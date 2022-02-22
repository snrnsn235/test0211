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
			System.out.println("id와 password를 입력하세요.");
			System.out.println("id : ");
			String id = s.nextLine();
			
			System.out.println("password : ");
			String password = s.nextLine().trim(); //trim()앞뒤공백제거
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("다시입력해!!");
				continue;
			}
			if(!(map.get(id)).equals(password)) { 
				//map.get(id) => 지정된 키의 값(value)을 반환 / asdf의 키의 값"1234"를 반환
				System.out.println("password 다시입력해!!");
			} else {
				System.out.println("잘했다");
			}
		}
	}

}
