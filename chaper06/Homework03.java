public class Homework03{
	public static void main(String[] args){
		Book book = new Book();

		double price = 177;
		System.out.println("=====�޸�ǰ�ļ۸�======");
		System.out.println(price);

		price = book.updatePrice(price);

		System.out.println("======�޸ĺ�ļ۸�======");
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