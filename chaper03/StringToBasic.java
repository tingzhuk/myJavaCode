public class StringToBasic{
	//��дһ��main����
	public static void main(String[] args){
		//������������ -> String
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;

		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println("------------");

		//String -> ������������
		String s5 ="123";
		//���� oop ������ͷ�����ʱ����ϸ����
		//��� ʹ�� �����������Ͷ�Ӧ�İ�װ�࣬����Ӧ�����õ�������������
		int num1 = Integer.parseInt(s5);
		Double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		boolean num5 = Boolean.parseBoolean("true");
		short num6 = Short.parseShort(s5);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);

		//��ô���ַ���ת�ַ� char -> �����ǰ��ַ����ĵ�һ���ַ��õ�
		//s5.charAt(0) �õ�s5�ַ�������һ���ַ�
		System.out.println(s5.charAt(0));

	}
}