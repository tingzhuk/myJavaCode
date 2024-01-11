import java.util.Scanner;

public class Feibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想要得到的斐波那契数列的第几项");
		int n = sc.nextInt();
		A  a = new A();
		int num = a.fbnc(n);
		System.out.println("斐波那契数列的第" + n + "项 = " + num);

	}
}

class A{
	public int fbnc(int n){
		if(n>=1){
			if(n == 1 || n == 2) return 1;
			else return fbnc(n-1) + fbnc(n-2);
		}else{
			System.out.println("要求输入的数>=1");
			return -1;
		}
	}
}