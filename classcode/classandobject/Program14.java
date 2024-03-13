class demo14A{
	int x = 10 ;
	private int y = 20 ;
	static int z = 30 ;
	void fun (){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Demo14 {
	public static void main (String [] args){
		demo14A obj1 = new demo14A();
		demo14A obj2 = new demo14A();
		obj1.fun();
		obj2.fun();
		obj1.x = 100;
		//obj1.y = 200;
		obj2.z = 300;
		System.out.println("_______________");
		obj1.fun();
		obj2.fun();
	}
}


