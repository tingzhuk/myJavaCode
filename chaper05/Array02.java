import java.util.Scanner;

public class Array02{
	public static void main(String[] args){
		//��ʾ �������� ������[] = new ��������[��С]
		//Ҫ������5���ɼ��� ���浽double���飬�����
		
		Scanner sc = new Scanner(System.in);

		double scores[] = new double[5];

		//���������ÿһ������ɼ�
		for(int i=0; i < scores.length; i++) scores[i] = sc.nextDouble();

		System.out.println("==========================");

		//����ɼ�
		for (int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}

	}
}