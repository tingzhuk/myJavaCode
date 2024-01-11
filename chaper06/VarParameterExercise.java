public class VarParameterExercise{
	public static void main(String[] aegs){
		HspMethod hm = new HspMethod();

		System.out.println(hm.showScore("王鑫磊", 66, 77));
	}
}

class HspMethod{
	public String showScore(String name, double... scores){
		double totalScore = 0;

		for(int i=0; i<scores.length; i++){
			totalScore += scores[i];
		}

		return name + scores.length +"门成绩总分为=" + totalScore;
	}
}