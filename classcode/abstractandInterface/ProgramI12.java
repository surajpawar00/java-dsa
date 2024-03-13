interface DemoI12{
	int x = 10 ;
	void fun();
}
class DemoChildI12 implements DemoI12{
	public void fun(){
		System.out.println(x);
		System.out.println(DemoI12.x);
	}
}
class ClientI12{
	public static void main(String [] args){
		DemoI12 obj = new DemoChildI12();
		obj.fun();
	}
}

