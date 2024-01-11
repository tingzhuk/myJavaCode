public class Homework05{
	public static void main(String[] args){
		Circle circle = new Circle();

		circle.radius = 5;

		circle.printPerimeter();
	}
}

class Circle{
	double radius;

	public void printPerimeter(){
		System.out.println("圆的周长为" + 2*3.14*radius);
	}
}