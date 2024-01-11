public class ArrayExercise02{
	public static void main(String[] args){
		/*
		求出数组的最大值并得到对应的下标
		{4，-1,9，10,23}
		 */
		
		//1.定义一个int数组
		//2.如何得到最大值？  假定arr[0]是最大值， maxindex=0
		//3.从下标1开始遍历数组，如果max小于当前元素，说明max不是在真正的最大值
		//我们就max = 当前元素值  maxindex = 当前元素的下标
		
		int[] arr = {4, -1, 9, 10, 23};

		//假定arr[0]是数组的最大值
		int max = arr[0];
		int maxindex = 0;

		//遍历数组
		for(int i=1; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
				maxindex = i;
			}
		}

		//遍历结束时得到数组的最大值和最大值下标
		System.out.println("数组的最大值是" + max + "最大值下标是" + maxindex);
		

	}
}