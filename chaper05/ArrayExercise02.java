public class ArrayExercise02{
	public static void main(String[] args){
		/*
		�����������ֵ���õ���Ӧ���±�
		{4��-1,9��10,23}
		 */
		
		//1.����һ��int����
		//2.��εõ����ֵ��  �ٶ�arr[0]�����ֵ�� maxindex=0
		//3.���±�1��ʼ�������飬���maxС�ڵ�ǰԪ�أ�˵��max���������������ֵ
		//���Ǿ�max = ��ǰԪ��ֵ  maxindex = ��ǰԪ�ص��±�
		
		int[] arr = {4, -1, 9, 10, 23};

		//�ٶ�arr[0]����������ֵ
		int max = arr[0];
		int maxindex = 0;

		//��������
		for(int i=1; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
				maxindex = i;
			}
		}

		//��������ʱ�õ���������ֵ�����ֵ�±�
		System.out.println("��������ֵ��" + max + "���ֵ�±���" + maxindex);
		

	}
}