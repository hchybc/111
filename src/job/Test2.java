package job;

public class Test2 {

	public static void main(String[] args) {
		String str[] = {"AAA","AAB","AAA","AAC","AAC","AAC","BBC","BBD","AAC","DBB","AAE","AAD"};
		for (int i = 0; i < str.length; i++) {
			
			String target = str[i]; //ÿ��ѭ���Ĳ�����
			
			if (target == null) {  //��һ������ʡ��
				continue;
			}
			
			for (int j = i + 1; j < str.length; j++) {
				/*
				 * �Ƚ������ַ����Ƿ���ͬ����ʹ��==
				 * ��ΪString�������������ͣ�==�Ƚ�������������ʱ�Ƚϵ����ڴ��ַ
				 * ������������ʹ��==�Ƚ�ֵ
				 * 
				 * Stringͨ������equals���Ƚ��ַ���������
				 * */
				if (target.equals(str[j])) {
					str[j] = null;
				}
			}
		}
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == null) {
				continue;
			}
			System.out.println(str[i]);
		}
		
	}

}
