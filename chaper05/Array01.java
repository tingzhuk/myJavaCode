public class Array01{
	public static void main(String[] args){
		/*
		���ǵ����طֱ���3kg��5kg��1kg��3.4kg��2kg��50kg��
		������ֻ�����������Ƕ��٣�ƽ�������Ƕ��٣�

		˼·����
		1.������������ double�� ��͵õ�������
		2.ƽ�����ص���������/6
		 */
		
		//ʹ��������
		System.out.println("=================");

		//����һ������
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		System.out.println("����ĳ���Ϊ" + hens.length);

		//��������õ���������ҵ�Ԫ�غ�
		//������±��0��ʼ��ţ�ͨ��������±������������Ԫ��
		double totalWeight = 0;
		for(int i=0; i<hens.length; i++){
			//ystem.out.println("��"+ i +"��Ԫ�ص�ֵ��" + hens[i]);
			totalWeight += hens[i];
		}

		//������Ϊ
		System.out.println("������Ϊ��" + totalWeight);
		//ƽ������Ϊ
		System.out.println("ƽ������Ϊ��" + totalWeight/6);
	}
}