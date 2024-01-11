public class TestPerson{
	 public static void main(String[] args){
	 	Person p1 = new Person("小明", 19);
	 	Person p2 = new Person("小红", 20);

	 	if(p1.compareTo(p2)){
	 		System.out.println("俩人名字和年龄一样");
	 	}else{
	 		System.out.println("俩人名字和年龄不一样");
	 	}
	 }
}

class Person{
	String name;
	int age;

	public Person(){};

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public boolean compareTo(Person p){
		if(this.name.equals(p.name) && this.age == p.age){
			return true;
		}else{
			return false;
		}
	}
}