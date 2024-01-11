public class YangHui{
	public static void main(String[] args){
		int n = 10;

		int arr[][] = new int[n][];

		for(int i=0;i<arr.length;i++){
			//给每一个数组的行开辟空间
			arr[i] = new int[i+1];

			//给每一个数组赋值
			for(int j=0; j<arr[i].length; j++){
				if(j == 0 || j == arr[i].length-1){
					//每个数组开头和结尾赋值为1
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}

				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		
	}
}