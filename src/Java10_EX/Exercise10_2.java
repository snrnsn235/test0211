package Java10_EX;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise10_2 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		String pattern2 = "�Է��Ͻ� ��¥�� E�����Դϴ�.";
		
		DateFormat df = new SimpleDateFormat(pattern);
		DateFormat df2 = new SimpleDateFormat(pattern2);
		
		Scanner s = new Scanner(System.in);
		Date inDate = null;
		
		do {
			System.out.println("��¥�� " + pattern + "�� ���·� �Է����ּ���(�Է¿�:2007/05/11)");
			try {
				System.out.println(">>");
				inDate = df.parse(s.nextLine()); //���� �Է��ϴ� ��
				break;
			} catch(Exception e) {}
		}while(true);
		System.out.println(df2.format(inDate));
	}

}
