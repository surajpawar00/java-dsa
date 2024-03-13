abstract class Parent2 {
	void carrier(){
		System.out.println("Doctor ");
	}
	abstract void marry();
}
class Child2 extends Parent2{
	void marry(){
		System.out.println("Disha Patani");
	}
}
class Client2{
	public static void main(String [] args ){
		Child2 obj = new Child2();
		obj.carrier();
		obj.marry();
	}
}


