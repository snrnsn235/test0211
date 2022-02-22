package Java11;

import java.util.*;
//�ֱ� 5���� ��ɾ��̷¸� �����ֵ��� �ϴ� ������Ʈ
public class Ex11_4 {
	static Queue q = new LinkedList(); //ť�� �������̽��̹Ƿ� ���� �����Ͽ���.
	static final int MAX_SIZE = 5; //ť�� �ִ� 5�������� ����ǵ��� �ϰ� ����.
	
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.println(">>");
			try {
				//ȭ�����κ��� ���δ����� �Է¹޴´�.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();//���⼭ trim()�� �յڰ����� �����Ѵ�
				
				//���� input�� �����̸� �Ʒ� if���� �ǳʶ�� �ٽ� ���� while(true)�� �ö󰣴�
				if("".equals(input)) continue;
				//'q'�� �Է��ϸ� ����
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) { //equalsIgnoreCase�� ��ҹ��ڱ��о��ٴ� ��
					System.out.println(" help - ������ �����ݴϴ�.");
					System.out.println(" q �Ǵ� Q - ���α׷��� �����մϴ�.");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ " + MAX_SIZE + "�� �����ݴϴ�.");
				} else if (input.equalsIgnoreCase("history")) {
					save(input);
					
					//LinkedList�� ������ �����ش�
					//Queue�� ���� ��ü�� LinkedList�� ������ ����ȯ�� �����ϴ�
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++)
						System.out.println((i+1)+"."+list.get(i));
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
	  }
}
	//save()�� ť�� ������ ��ɾ �����ϴ� �޼����̴�.
	public static void save(String input) {
		//���������ϴ°�? ���ڿ��� �ƴҶ� ���ڴ� ������� �ʴ´�
		if(!"".equals(input)) //if(input != null && !input.equals("")�� ����
			q.offer(input); //ť�� ��ɾ ����, �߰� /poll�� ����
		if(q.size() > MAX_SIZE)
			q.poll();//����
	}
}