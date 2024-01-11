public class Homework04{
	public static void main(String[] args){
		A04 a04 = new A04();

		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println("=====老数组======");
		for(int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");

		System.out.println();

		int[] newArr = a04.copyArr(arr);
		System.out.println("=====新数组======");
		for(int i=0;i<newArr.length;i++) System.out.print(newArr[i] + " ");

		System.out.println(arr == newArr);
	}
}

class A04{
	public int[] copyArr(int[] arr){
		int[] newArr = new int[arr.length];

		for(int i=0; i<arr.length; i++) newArr[i] = arr[i];

		return newArr;
	}
}