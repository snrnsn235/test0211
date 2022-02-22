package Java11;

import java.util.*;

public class Ex11_17_1 {
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addphoneNo("친구" , "이자바", "010-111-1111");
		addphoneNo("친구" , "김자바", "010-222-2222");
		addphoneNo("친구" , "김자바", "010-333-1111");
		addphoneNo("회사" , "김대리", "010-444-4444");
		addphoneNo("회사" , "김대리", "010-555-5555");
		addphoneNo("회사" , "박대리", "010-666-6666");
		addphoneNo("회사" , "이과장", "010-777-7777");
		addphoneNo("세탁" , "010-888-8888");
		
		printList();
	}
	//그룹에 전화번호를 추가하는 메서드
	static void addphoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	//그룹에 추가하는 메서드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	static void addphoneNo(String name, String tel) {
		addphoneNo("기타", name, tel);
	}
	
	//전화번호부 전체를 출력하는 메서드
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e =  (Map.Entry)it.next();
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * " + e.getKey() + "[" + subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name + " " + telNo);
			}
			System.out.println();
		}
	}
	
}
