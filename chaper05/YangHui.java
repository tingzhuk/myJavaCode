public class YangHui{
	public static void main(String[] args){
		int n = 10;

		int arr[][] = new int[n][];

		for(int i=0;i<arr.length;i++){
			//��ÿһ��������п��ٿռ�
			arr[i] = new int[i+1];

			//��ÿһ�����鸳ֵ
			for(int j=0; j<arr[i].length; j++){
				if(j == 0 || j == arr[i].length-1){
					//ÿ�����鿪ͷ�ͽ�β��ֵΪ1
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