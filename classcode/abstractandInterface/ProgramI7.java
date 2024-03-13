interface DemoI7{
	void gun();
	default void fun(){
		System.out.println("in fun Demo");
	}
}
class DemoChildI7 implements DemoI7{
	public void gun(){
		System.out.println("in gun DemoChild");
	}
}
class ClientI7{
	public static void main(String [] args){
		DemoI7 obj = new DemoChildI7();
		obj.gun();
		obj.fun();
	}
}

