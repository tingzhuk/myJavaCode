public class BubbleSort{
	public static void main(String[] args){
		int [] arr = {33, 66, 78, 22, 79};

		for(int i=0; i<arr.length-1; i++){
			for(int j=0,k=j+1; j<arr.length-i-1;j++,k++){
				if (arr[j]>arr[k]) {
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}

		System.out.println("=====排序后的数组arr====");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}