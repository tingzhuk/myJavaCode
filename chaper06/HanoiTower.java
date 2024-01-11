public class HanoiTower{
	public static void main(String[] args){
		Tower t1 = new Tower();

		t1.move(5, 'A', 'B', 'C');
	}
}

class Tower{

	//方法
	//num 表示要移动的个数，a,b,c分别表示A塔，B塔，C塔
	public void move(int num, char a, char b, char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		}else{
			//如果有多个盘，可以看成两个，最下面和最上面(num-1)个盘
			//1.先移动上面num-1个盘
			move(num-1, a, c, b);
			//2.把最下面那个盘移动到c盘
			System.out.println(a + "->" + c);
			//3.再把b塔上的左右盘借助a盘移动到c盘
			move(num-1, b, a, c);
		}
	}
}