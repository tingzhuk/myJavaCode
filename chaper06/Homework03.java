public class Homework03{
	public static void main(String[] args){
		Book book = new Book();

		double price = 177;
		System.out.println("=====修改前的价格======");
		System.out.println(price);

		price = book.updatePrice(price);

		System.out.println("======修改后的价格======");
		System.out.println(price);
	}
}

class Book{
	public double updatePrice(double price){
		if(price > 150){
			return 150;
		}else if(price > 100){
			return 100;
		}else{
			return price;
		}
	}
}