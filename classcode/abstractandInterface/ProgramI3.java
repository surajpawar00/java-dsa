interface DemoI3A{
	void fun();
}
interface DemoI3B{
	void fun();
}
class DemoChildI3 implements DemoI3A,DemoI3B{
        public void fun(){
		System.out.println("In Child Fun ");
	}
}
class ClientI3{
	public static void main(String [] args ){
		DemoI3A obj = new DemoChildI3();
		obj.fun();
		DemoI3A obj2 = new DemoChildI3();
		obj2.fun();
	}
}

