package Java11;

import java.util.*;

public class Ex11_3 {

	public static void main(String[] args) {
//		if(args.length!=1) {
//			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
//			System.out.println("Example : java ExpValidCheck \"((2+3)*1) + 3\"");
//			System.exit(0); // 0이면 프로그램 종료, 1이면 
//		}
		
		Stack st = new Stack();
		String expression = "((3+5)*8-2)))";
		
		System.out.println("expression: " + expression);
		
		try {
			for(int i = 0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch + "");
				}else if (ch == ')') {
					st.pop();
				}
			}
			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch(EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다. 예외");
		}
	}

}
