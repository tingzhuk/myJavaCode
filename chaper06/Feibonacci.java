import java.util.Scanner;

public class Feibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ҫ�õ���쳲��������еĵڼ���");
		int n = sc.nextInt();
		A  a = new A();
		int num = a.fbnc(n);
		System.out.println("쳲��������еĵ�" + n + "�� = " + num);

	}
}

class A{
	public int fbnc(int n){
		if(n>=1){
			if(n == 1 || n == 2) return 1;
			else return fbnc(n-1) + fbnc(n-2);
		}else{
			System.out.println("Ҫ���������>=1");
			return -1;
		}
	}
}