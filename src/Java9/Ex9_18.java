package Java9;

public class Ex9_18 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? " + (sb == sb2));
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
//		����� false�� ���´�. StringBuffer������ equals�� �������̵� ���� �ʾұ� ������
//		�ּҺ񱳸� �Ѵ�(String������ �������̵� �Ǿ ����񱳸��Ѵ�)
		
		String s = sb.toString();
		String s2 = sb2.toString();
		System.out.println("s.equals(s2)" + s.equals(s2));
//		StringBuffer�ν��Ͻ��� toString()�� ȣ���ؼ� String�ν��Ͻ��� ��������
//	    equals�޼��带 �̿��ؼ� ���ؾ� �Ѵ�.
	}

}
