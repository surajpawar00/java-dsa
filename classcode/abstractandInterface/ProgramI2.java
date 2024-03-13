interface Demo1{
	void fun();
	void gun();
}
abstract class DemoChild1 implements Demo1{
	public void fun(){
		System.out.println("In Fun ");
	}
}
class DemoChild2 extends DemoChild1{
	public  void gun(){
		System.out.println("In Gun ");
	}
}

class ClientI2{
	public static void main(String [] args){
		Demo1 obj1 = new DemoChild2();
		obj1.fun();
		obj1.gun();
	}
}

