import java.util.Scanner;

public class if03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入信用分");

		double creditScore = sc.nextDouble();

		if (creditScore >= 1 && creditScore <= 100) {
			if(creditScore == 100) System.out.println("信用极好");
			else if(creditScore > 80 && creditScore <= 99) System.out.println("信用优秀");
			else if(creditScore >=60 && creditScore <= 80) System.out.println("信用一般");
			else System.out.println("信用不及格");
		}else {
			System.out.println("信用分需要在1-100之间，请重新输入");
		}
	}
}