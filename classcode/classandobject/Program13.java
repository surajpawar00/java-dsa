class demo13A{
	int x = 10;
	String y = "manav";
	static int z = 20;
	void info(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
class Demo13{
	public static void main(String[] args){
	       demo13A obj1 = new demo13A();
               demo13A obj2 = new demo13A();
	       obj1.info();
	       obj2.info();
	       System.out.println(" ...............");
	       obj1.x = 1000;
	       obj1.y = "madhu";
	       obj1.z = 2000 ;
	       obj1.info();
	       obj2.info();
	}
}

               	       
