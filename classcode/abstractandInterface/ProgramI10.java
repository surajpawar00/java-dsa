interface DemoI10{
	static void fun(){
		System.out.println("In Fun Demo");
	}
}
class DemoChildI10 implements DemoI10{

	 void fun(){
		System.out.println("In Fun Demo child ");
		DemoI10.fun();
	}
}
class ClientI10{
	public static void main(String [] args ){
		DemoChildI10 obj = new DemoChildI10();
		obj.fun();
		DemoI10.fun();
	}
}
