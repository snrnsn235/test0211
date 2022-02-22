package Java11;

import java.util.*;

public class Ex11_17_1 {
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addphoneNo("ģ��" , "���ڹ�", "010-111-1111");
		addphoneNo("ģ��" , "���ڹ�", "010-222-2222");
		addphoneNo("ģ��" , "���ڹ�", "010-333-1111");
		addphoneNo("ȸ��" , "��븮", "010-444-4444");
		addphoneNo("ȸ��" , "��븮", "010-555-5555");
		addphoneNo("ȸ��" , "�ڴ븮", "010-666-6666");
		addphoneNo("ȸ��" , "�̰���", "010-777-7777");
		addphoneNo("��Ź" , "010-888-8888");
		
		printList();
	}
	//�׷쿡 ��ȭ��ȣ�� �߰��ϴ� �޼���
	static void addphoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	//�׷쿡 �߰��ϴ� �޼���
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	static void addphoneNo(String name, String tel) {
		addphoneNo("��Ÿ", name, tel);
	}
	
	//��ȭ��ȣ�� ��ü�� ����ϴ� �޼���
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
