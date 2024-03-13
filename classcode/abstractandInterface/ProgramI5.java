interface DemoI5A{
	void m1(){
		System.out.println("in A M1 ");
	}
}
interface DemoI5B{
	void m2(){
		System.out.println("in B M2 ");
	}
}
interface DemoI5C extends DemoI5A,DemoI5B{
}
class DemoChildI5 implements DemoI5C{
	public static void main(String [] args){
		DemoI5c obj = new DemoChidI5();
		obj.m1();
		obj.m2();

	}
}

