public class TestPerson{
	 public static void main(String[] args){
	 	Person p1 = new Person("С��", 19);
	 	Person p2 = new Person("С��", 20);

	 	if(p1.compareTo(p2)){
	 		System.out.println("�������ֺ�����һ��");
	 	}else{
	 		System.out.println("�������ֺ����䲻һ��");
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