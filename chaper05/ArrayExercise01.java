public class ArrayExercise01{
	public static void main(String[] args){
		/*
		����һ�������26����д��ĸ����ӡ
		 */
		
		char[] arr1 = new char[26];

		for(int i=0; i<26; i++){
			arr1[i] = (char)('A' + i);
		}

		//�����������
		for (int i=0; i<26; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
}