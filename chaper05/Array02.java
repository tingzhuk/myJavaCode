import java.util.Scanner;

public class Array02{
	public static void main(String[] args){
		//演示 数组类型 数组名[] = new 数组类型[大小]
		//要求输入5个成绩， 保存到double数组，并输出
		
		Scanner sc = new Scanner(System.in);

		double scores[] = new double[5];

		//遍历数组的每一项输入成绩
		for(int i=0; i < scores.length; i++) scores[i] = sc.nextDouble();

		System.out.println("==========================");

		//输出成绩
		for (int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}

	}
}