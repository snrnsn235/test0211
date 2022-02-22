package Java10;

import java.util.Calendar;

public class Ex10_5 {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("Usage : java Ex10_5 2019 9");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();//시작일
		Calendar eDay = Calendar.getInstance();//마지막일
		
//		월의 경우 0부터 11까지의 값을 가지므로 1을 빼줘야한다.
//		예를 들어, 2019년 11월 1일은 sDay.set(2019, 10, 1); 과 같이 해줘야 한다.
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		
		eDay.add(Calendar.DATE, -1);
		
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("       " + args[0] + "년 " + args[1] + "월");
		System.out.println(" SU MO TU WE TH FR SA");

		for(int i=1; i <START_DAY_OF_WEEK; i++)
			System.out.print("   ");
		for(int i=1, n = START_DAY_OF_WEEK; i<= END_DAY; i++, n++) {
			System.out.print((i < 10)? "  "+i : " "+i);
			if(n%7==0) System.out.println();
		}
	}
}