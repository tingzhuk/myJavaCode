public class MiGong{
	public static void main(String[] args){

		//思路
		//1. 先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
		//2. 先规定 map 数组的元素值： 0 表示可以走， 1 表示障碍物
		
		int[][] map = new int [8][7];
		//将最上面一行和最下面一行全部设置为1， 第一列和最后一列也设置为1
		
		for(int i=0;i<map.length; i++){
			for(int j=0; j<map[i].length; j++){
				if(i == 0 || i == map.length-1 || j ==0 || j ==map[i].length-1){
					map[i][j] = 1;
				}
			}
		}

		map[3][1] = 1;
		map[3][2] = 1;


		System.out.println("=======当前地图情况========");
		for(int i=0; i<map.length; i++){
			for(int j=0; j<map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		T t1 = new T();
		t1.findWay(map, 1, 1);

		System.out.println("=======运行后地图情况========");
		for(int i=0; i<map.length; i++){
			for(int j=0; j<map[i].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

	}
}


class T {
	//使用递归回溯的思想来解决老鼠出迷宫
	
	//1.findway方法是用来专门找出迷宫路径的
	//2.如果找到就返回true，否则就返回false
	//3.map就是二维数组，即表示迷宫
	//4.i，j就是老鼠的位置，初始位置是(1,1);
	//5.因为我们是递归找路，所以规定map数组各个值得含义
	//  0表示可以走 1表示障碍物 2 表示可以走 3 表示走过，但是走不通是死路
	//6.当map[6][5] = 2是就说明找到通过，否则就继续找
	//7.确定老鼠找路的策略 下->右->上->左
	
	public boolean findWay(int[][] map, int i, int j){
		if(map[6][5] == 2){//说明我们已经找到了返回true
			return true;
		}else{
			if(map[i][j] == 0){//当前这个位置0，可以走

				//假定当前这个位置可以走通
				map[i][j] = 2;

				//使用我们的走路策略，来确定这个位置是否真的可以走通
				//下->右->上->左
				if(findWay(map, i+1, j)){
					return true;
				}else if(findWay(map, i, j+1)){
					return true;
				}else if(findWay(map, i-1, j)){
					return true;
				}else if(findWay(map, i, j-1)){
					return true;
				}else{
					//都走不通，假定错误
					map[i][j] = 3;
					return false;
				}
			}else{
				return false;
			}
		}
	}
}