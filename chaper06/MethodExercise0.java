public class MethodExercise0{
	public static void main(String[] args){

		AA a = new AA();

		boolean flag = a.ifoob(4);

		if(flag){
			System.out.println("ÆæÊý");
		}else{
			System.out.println("Å¼Êý");
		}

	}
}

class AA{
	public boolean ifoob(int n){
		/*if (n % 2 == 0) {
			return false;
		}
		return true;*/

		return n % 2 == 0? false : true;
	}
}