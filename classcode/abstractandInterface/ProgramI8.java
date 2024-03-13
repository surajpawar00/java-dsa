interface DemoI8A{
	default void fun(){
		System.out.println("in Fun DemoB");
	}
}
interface DemoI8B{
	default void fun(){
		System.out.println("in fun DemoB");
	}
}
class DemoChildI8 implements DemoI8A,DemoI8B{
	public void fun(){
		System.out.println("in ChildDemo fun");
	}
}
class ClientI8{
	public static void main(String [] args){
		DemoI8A obj = new DemoChildI8();
		obj.fun();
		DemoI8B obj2 = new DemoChildI8();
		obj2.fun();
		DemoChildI8 obj3 = new DemoChildI8();
		obj3.fun();
	}
}




