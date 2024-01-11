public class ArrayExercise01{
	public static void main(String[] args){
		/*
		创建一个数组存26个大写字母并打印
		 */
		
		char[] arr1 = new char[26];

		for(int i=0; i<26; i++){
			arr1[i] = (char)('A' + i);
		}

		//遍历数组输出
		for (int i=0; i<26; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}