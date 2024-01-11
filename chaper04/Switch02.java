import java.util.Scanner;

public class Switch02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("ÇëÊäÈëÒ»¸ö×ÖÄ¸");

		char c1 = sc.next().charAt(0);

		switch(c1){
			case 'a':
				System.out.println("A");
				break;
			case 'b':
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
			default:
				System.out.println("other");
		}
	}
}