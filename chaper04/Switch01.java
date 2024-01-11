import java.util.Scanner;

public class Switch01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个字符a~g");

		char c1 = sc.next().charAt(0);

		switch(c1){
			case 'a':
				System.out.println("星期一");
				break;
			case 'b':
				System.out.println("星期二");
				break;
			case 'c':
				System.out.println("星期三");
				break;
			case 'd':
				System.out.println("星期四");
				break;
			case 'e':
				System.out.println("星期五");
				break;
			case 'f':
				System.out.println("星期六");
				break;
			case 'g':
				System.out.println("星期日");
				break;
			default:
				System.out.println("你输入的字符不正确，没有匹配的");
		}

		System.out.println("退出了switch,继续执行程序");
	}
}