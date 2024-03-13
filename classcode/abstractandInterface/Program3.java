abstract class Parent3 {
	void Homeland(){
		System.out.println("India ");
	}
	abstract void car();
}
class Child3 extends Parent3{
	void car(){
		System.out.println("Tata Harrior");
	}
}
class Client3{
	public static void main(String [] args ){
		Child3 obj = new Child3();
		obj.Homeland();
		obj.car();
	}
}


