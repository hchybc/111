package job;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ����");
		int num = input.nextInt();
		
		/*String str_num = num + "";
		int len = str_num.length();*/
		
		int temp = num;
		int len = 0;
		while(temp > 0) {
			temp /= 10;
			len++;
		}
		
		int[] arr = new int[len];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num % 10;
			num /= 10;
		}
		
		//System.out.println(Arrays.toString(arr));
		
		//ͨ��ѭ����֤������������Ƿ������
		/*boolean flag = true;//����num�ǻ�����
		for (int i = 0; i < arr.length / 2; i++) {
			int left = arr[i];
			int right = arr[arr.length - 1 - i];
			if (left != right) {
				flag = false;
				break;
			}
		}
		
		if (flag) {
			System.out.println("������");
		} else {
			System.out.println("���ǻ�����");
		}*/
		
		int i = 0;
		for (; i < arr.length / 2; i++) {
			int left = arr[i];
			int right = arr[arr.length - 1 - i];
			if (left != right) {
				break;
			}
		}
		
		if (i == arr.length / 2) {
			System.out.println("�ǻ�����");
		} else {
			System.out.println("���ǻ�����");
		}
	}

}
