package job;

public class Test {

	public static void main(String[] args) {
		String str = "azbaccdeff";
		for (int i = 0; i < str.length(); i++) {
			//ÿ��ѭ����ȡ�±�Ϊi���ַ�
			/*
			 * �����û������Ա�
			 * input.next().charAt(0);
			 * input.next()
			 * */
			char target = str.charAt(i);  //��ȡ�ַ�������Ϊi���ַ�
			boolean flag = true; //���赱ǰ����ַ��ǵ�һ�γ��ֹ�һ�ε��ַ�
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == target) {
					flag = false;//����ַ��ظ�����
					break;
				}
			}
			if (flag) {
				System.out.println("str�е�һ�����ֹ�һ�ε��ַ���" + target);
				break;
			}
		}
	}

}
