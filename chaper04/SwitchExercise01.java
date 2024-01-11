import java.util.Scanner;

public class SwitchExercise01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入分数");

		int score = sc.nextInt();

		if (score >= 0 && score <= 100) {
				//....
				if (score >= 60) {
					System.out.println("合格");
				}else{
					System.out.println("不合格");
				}
		} else {
			System.out.println("成绩不合法");
		}
	}
}