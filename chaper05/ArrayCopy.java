public class ArrayCopy{
	public static void main(String[] args){
		int[] arr1 = {10, 20, 30};

		//����һ���µ�����arr2�������µ����ݿռ�
		//��С arr1.length
		int[] arr2 = new int[arr1.length];

		for(int i=0; i<arr1.length; i++){
			arr2[i] = arr1[i];	
		}

		//�޸�arr2
		arr2[0] = 100;
		System.out.println(arr1[0]);
	}
}