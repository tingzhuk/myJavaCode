public class homework03{
	public static void main(String[] args){
		double money = 100000;

		int num = 0;
		while(true){
			if (money > 50000) {
				num ++ ;
				money -= money*0.05;
			}else{
				if (money > 1000) {
					num ++ ;
					money -= 1000;
				}else{
					break;
				}
			}
		}

		System.out.println("可以经过" + num + "次路口");
	}
}