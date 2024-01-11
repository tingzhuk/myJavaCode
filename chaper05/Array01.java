public class Array01{
	public static void main(String[] args){
		/*
		他们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg。
		请问六只鸡的总体重是多少？平均体重是多少？

		思路分析
		1.定义六个变量 double， 求和得到总体重
		2.平均体重等于总体重/6
		 */
		
		//使用数组解决
		System.out.println("=================");

		//定义一个数组
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		System.out.println("数组的长度为" + hens.length);

		//遍历数组得到数组的左右的元素和
		//数组的下标从0开始编号，通过数组的下标来访问数组的元素
		double totalWeight = 0;
		for(int i=0; i<hens.length; i++){
			//ystem.out.println("第"+ i +"个元素的值是" + hens[i]);
			totalWeight += hens[i];
		}

		//总体重为
		System.out.println("总体重为：" + totalWeight);
		//平均体重为
		System.out.println("平均体重为：" + totalWeight/6);
	}
}