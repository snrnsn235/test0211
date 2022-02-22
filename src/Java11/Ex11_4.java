package Java11;

import java.util.*;
//최근 5개의 명령어이력만 보여주도록 하는 프로젝트
public class Ex11_4 {
	static Queue q = new LinkedList(); //큐는 인터페이스이므로 직접 구현하였음.
	static final int MAX_SIZE = 5; //큐에 최대 5개까지만 저장되도록 하고 있음.
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			try {
				//화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();//여기서 trim()은 앞뒤공백을 삭제한다
				
				//만약 input이 공백이면 아래 if문을 건너띄고 다시 위로 while(true)로 올라간다
				if("".equals(input)) continue;
				//'q'를 입력하면 종료
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				} else if (input.equalsIgnoreCase("help")) { //equalsIgnoreCase는 대소문자구분없다는 뜻
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				} else if (input.equalsIgnoreCase("history")) {
					save(input);
					
					//LinkedList의 내용을 보여준다
					//Queue의 실제 객체는 LinkedList기 때문에 형변환이 가능하다
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++)
						System.out.println((i+1)+"."+list.get(i));
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력오류입니다.");
			}
	  }
}
	//save()는 큐에 저장한 명령어를 저장하는 메서드이다.
	public static void save(String input) {
		//언제저장하는가? 빈문자열이 아닐때 빈문자는 저장되지 않는다
		if(!"".equals(input)) //if(input != null && !input.equals("")와 같다
			q.offer(input); //큐에 명령어를 저장, 추가 /poll은 삭제
		if(q.size() > MAX_SIZE)
			q.poll();//삭제
	}
}