package job;

public class Test3 {

	public static void main(String[] args) {
		//��ָ���쳣
		String str = "hello";
		//System.out.println(str.length());
		
		str = null; //��ʱstrû���ڴ��ַ������һ��null�������������͵ı������������Ժͷ�����ʱ�򣬻���ֿ�ָ���쳣
					// java.lang.NullPointerException
		System.out.println(str.length());
	}

}
