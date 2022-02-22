package Java9;

public class Ex9_18 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
//		결과는 false가 나온다. StringBuffer에서는 equals를 오버라이딩 하지 않았기 때문에
//		주소비교를 한다(String에서는 오버라이딩 되어서 내용비교를한다)
		
		String s = sb.toString();
		String s2 = sb2.toString();
		System.out.println("s.equals(s2)" + s.equals(s2));
//		StringBuffer인스턴스에 toString()을 호출해서 String인스턴스를 얻은다음
//	    equals메서드를 이용해서 비교해야 한다.
	}

}
