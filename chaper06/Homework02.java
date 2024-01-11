public class Homework02{
	public static void main(String[] args){
		A02 a02 = new A02();

		String str = "wang";
		char c = 'w';

		System.out.println(a02.find(str, c));
	}
}

class A02{
	public int find(String str, char c){

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == c) return i;
		}

		return -1;
	}
}