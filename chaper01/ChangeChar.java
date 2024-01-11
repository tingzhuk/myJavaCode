public class ChangeChar{
	public static void main(String[] args){
		// \t : 一个制表位，实现对其功能
		System.out.println("北京\t天津\t上海");
		// \n : 换行
		System.out.println("jack\nsmith");
		// \\ : 一个\
		System.out.println("hello\\word");
		// \' : 一个''
		System.out.println("老韩说：\"要好好学java，有前途\"");
		// \r : 一个回车
		// 解读
		// 1.输出  信息牧业经济学院
		// 2. \r 表示回车
		System.out.println("河南牧业经济学院\r信息");
		System.out.println("河南牧业经济学院\r\n信息");
	}
}