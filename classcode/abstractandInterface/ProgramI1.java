interface Demo1{
	void fun();
	void gun();
}
class DemoChild1 implements Demo1{
	public void fun(){
		System.out.println("In Fun ");
	}
	public void gun(){
		System.out.println("In gun ");
	}
}
class ClientI1{
	public static void main(String [] args){
		//Demo1 obj = new Demo1();
		Demo1 obj1 = new DemoChild1();
		obj1.fun();
		obj1.gun();
	}
}

