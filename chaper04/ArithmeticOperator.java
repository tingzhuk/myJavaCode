/**
 * 演示算术运算符的使用
 *
 */

public class ArithmeticOperator{
	public static void main(String[] srgs){
		System.out.println(10 / 4);//从数学来看是2.5 但在java中结果是2
		System.out.println(10.0 / 4);//结果是2.5
		double d = 10 / 4;//java中10 / 4 是2 => 2.0
		System.out.println(d);//是2.0

		// % 取模，取余
		System.out.println(10 % 3);//1
	}
}