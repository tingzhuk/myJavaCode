import java.util.Scanner;

public class SwitchExercise01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("���������");

		int score = sc.nextInt();

		if (score >= 0 && score <= 100) {
				//....
				if (score >= 60) {
					System.out.println("�ϸ�");
				}else{
					System.out.println("���ϸ�");
				}
		} else {
			System.out.println("�ɼ����Ϸ�");
		}
	}
}