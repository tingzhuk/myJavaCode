//Á·Ï°1
import java.util.Scanner;

public class Test1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("ÇëÊäÈëÔÂ·Ý");

		int month = sc.nextInt();

		if (month >= 1 && month <= 12) {
			System.out.println("ÇëÊäÈëÄêÁä");

			int age = sc.nextInt();

			if (month >= 4 && month <= 10) {
				if(age >= 18 && age <= 60) System.out.println("60");
				else if(age > 0 && age < 18) System.out.println("30");
				else if(age > 60) System.out.println("20");
				else System.out.println("ÄêÁä²»ºÏ·¨");
			}else{
				if(age >= 18 && age <= 60) System.out.println("40");
				else System.out.println("20");
			}
		}else {
			System.out.println("ÊäÈëµÄÔÂ·Ý²»ºÏ·¨");
		}
	}
}