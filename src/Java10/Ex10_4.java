package Java10;

import java.util.Calendar;

public class Ex10_4 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2019, 7, 31);
		
		System.out.println(toString(date));
		System.out.println();
		System.out.println("= 1�� �� =");
		date.add(Calendar.DATE, 1); //�Ϸ縦 ����
		System.out.println(toString(date));
		System.out.println();
		System.out.println("= 6�� �� =");
		date.add(Calendar.MONTH, -6); //�Ϸ縦 ����
		System.out.println(toString(date));
		System.out.println();
		System.out.println("= 31�� ��(roll) =");
		date.roll(Calendar.DATE, 31); //�Ϸ縦 ����
		System.out.println(toString(date));
		System.out.println();
		System.out.println("= 31�� ��(add) =");
		date.add(Calendar.DATE, 31); //�Ϸ縦 ����
		System.out.println(toString(date));
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "�� " + (date.get(Calendar.MONTH)+1) + "�� " + date.get(Calendar.DATE)+ "��";
	}

}
