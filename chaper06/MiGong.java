public class MiGong{
	public static void main(String[] args){

		//˼·
		//1. �ȴ����Թ����ö�ά�����ʾ int[][] map = new int[8][7];
		//2. �ȹ涨 map �����Ԫ��ֵ�� 0 ��ʾ�����ߣ� 1 ��ʾ�ϰ���
		
		int[][] map = new int [8][7];
		//��������һ�к�������һ��ȫ������Ϊ1�� ��һ�к����һ��Ҳ����Ϊ1
		
		for(int i=0;i<map.length; i++){
			for(int j=0; j<map[i].length; j++){
				if(i == 0 || i == map.length-1 || j ==0 || j ==map[i].length-1){
					map[i][j] = 1;
				}
			}
		}

		map[3][1] = 1;
		map[3][2] = 1;


		System.out.println("=======��ǰ��ͼ���========");
		for(int i=0; i<map.length; i++){
			for(int j=0; j<map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		T t1 = new T();
		t1.findWay(map, 1, 1);

		System.out.println("=======���к��ͼ���========");
		for(int i=0; i<map.length; i++){
			for(int j=0; j<map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}


class T {
	//ʹ�õݹ���ݵ�˼�������������Թ�
	
	//1.findway����������ר���ҳ��Թ�·����
	//2.����ҵ��ͷ���true������ͷ���false
	//3.map���Ƕ�ά���飬����ʾ�Թ�
	//4.i��j���������λ�ã���ʼλ����(1,1);
	//5.��Ϊ�����ǵݹ���·�����Թ涨map�������ֵ�ú���
	//  0��ʾ������ 1��ʾ�ϰ��� 2 ��ʾ������ 3 ��ʾ�߹��������߲�ͨ����·
	//6.��map[6][5] = 2�Ǿ�˵���ҵ�ͨ��������ͼ�����
	//7.ȷ��������·�Ĳ��� ��->��->��->��
	
	public boolean findWay(int[][] map, int i, int j){
		if(map[6][5] == 2){//˵�������Ѿ��ҵ��˷���true
			return true;
		}else{
			if(map[i][j] == 0){//��ǰ���λ��0��������

				//�ٶ���ǰ���λ�ÿ�����ͨ
				map[i][j] = 2;

				//ʹ�����ǵ���·���ԣ���ȷ�����λ���Ƿ���Ŀ�����ͨ
				//��->��->��->��
				if(findWay(map, i+1, j)){
					return true;
				}else if(findWay(map, i, j+1)){
					return true;
				}else if(findWay(map, i-1, j)){
					return true;
				}else if(findWay(map, i, j-1)){
					return true;
				}else{
					//���߲�ͨ���ٶ�����
					map[i][j] = 3;
					return false;
				}
			}else{
				return false;
			}
		}
	}
}