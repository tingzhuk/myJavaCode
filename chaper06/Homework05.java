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
		System.out.println("Բ���ܳ�Ϊ" + 2*3.14*radius);
	}
}