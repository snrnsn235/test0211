package Java11;

import java.util.*;

public class Ex11_11 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); //�ߺ��̶� ����ȵ�
		set.add(new Person("David", 10));
		set.add(new Person("David", 10)); //�Ѵ� �����
		
		System.out.println(set);
	}
}

//equals()�� hashCode()�� �������̵��ؾ� HashSet�� �ùٸ��� ����
class Person {
	String name;
	int age;
	
	@Override
	public int hashCode() {
		//int hash(Object... values) //��������
		return Objects.hash(name, age);
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		//���ڽ�(this)�� �̸��� ���̸� p�� ��
		return this.name.equals(p.name) && this.age==p.age;
	}
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + ":" + age;
	}
}