public class StringToBasic{
	//编写一个main方法
	public static void main(String[] args){
		//基本数据类型 -> String
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

		//String -> 基本数据类型
		String s5 ="123";
		//会在 oop 讲对象和方法的时候详细讲述
		//解读 使用 基本数据类型对应的包装类，的相应方法得到基本数据类型
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

		//怎么把字符串转字符 char -> 含义是把字符串的第一个字符得到
		//s5.charAt(0) 得到s5字符串的子一个字符
		System.out.println(s5.charAt(0));

	}
}