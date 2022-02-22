package Java11;

import java.util.*;

public class Ex11_10_1 {

	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		
		for(int i=0; set.size()<25; i++) {
			set.add((int)(Math.random()*50)+1+"");
		}
//		System.out.println(set); //1~50사이의 숫자중 25개 고름
		
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? "ㅌ" : "ㅇ")+board[i][j]);
			}
			System.out.println();
		}
	
	}

}
