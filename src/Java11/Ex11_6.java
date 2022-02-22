package Java11;

import java.util.*;

public class Ex11_6 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12,13}, {21,22,23}};
		
		System.out.println("arr=" +Arrays.toString(arr)); //1�����迭
		System.out.println("arr2D=" + Arrays.deepToString(arr2D)); //�������迭
		System.out.println();
		int[] arr2 = Arrays.copyOf(arr, arr.length); //length�� 5, 5���� �״�� ����
		int[] arr3 = Arrays.copyOf(arr, 3);//3������
		int[] arr4 = Arrays.copyOf(arr, 7);//7���ε� 5�� ������ϰ� ������ ���� 0���� ä��
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);//2<= x < 4
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);//0~5������ ���� ������ ���� 0���� ä��
		//���� 5������ toString()�� �̿��ؼ� ����� ����� �ؿ� 5����
		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));
		System.out.println();
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); //arr7�� 9�� ä����
		System.out.println("arr7="+Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
		System.out.println("arr7="+Arrays.toString(arr7));
		
		for(int i : arr7) {//���� for��
			char[] graph = new char[i];
			Arrays.fill(graph,  '*');
			System.out.println(new String(graph)+i);
		}
		
		String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2)); //false
		System.out.println(Arrays.deepEquals(str2D, str2D2));//true
		
		char[] chArr = {'A', 'D', 'C', 'B', 'E'};
		
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		System.out.println("= Afer sorting =");
		Arrays.sort(chArr);//�迭�� ����. binarySearch�� �ϱ����� ������ sort()������ �����ؾ��Ѵ�.
		System.out.println("chArr=" + Arrays.toString(chArr));
		System.out.println("index of B = " + Arrays.binarySearch(chArr, 'B'));
		}
}