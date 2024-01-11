public class CharDetail{
	public static void main(String[] args){
		System.out.println("hello");
		//你好
		
		//在java中char的本质是一个字整数，在输出时，是对应的unicode码对应的字符
		char c1 = 97;
		System.out.println(c1);

		char c2 = '王';
		System.out.println((int)c2);

	}
}