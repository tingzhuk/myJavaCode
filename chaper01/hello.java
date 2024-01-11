//这是一个类
//main(){} 表示方法的开始和结束
//；表示语句结束
public class hello {
	public static void main(String[] args){
		System.out.println("王鑫磊hello java");
	}


}

//一个源文件中最多只能有一个public类，其他类不受限制
//Dog 是一个类
//编译后，每一个类都对应一个.class
class Dog{
	/*
	多行注释
	 */
	//一个源文件中最多只能有一个public类。其他类的个数不限，也可以将main方法写在非public类里面
	//然后指定运行非public类，这样进入的方法就是非public方法
	public static void main(String[] args){
		System.out.println("hello dog");
	}
}