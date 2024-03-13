class Demo23{
	int x = 10;
	static int y = 20;
Demo23(){
		System.out.println("In Constructor");
	}
	static {
		System.out.println("In static block");
	}
	{
		System.out.println("In Instances block");
	}
	public static void main(String []args){
		Demo22 obj = new Demo22();
	}
	static {
		System.out.println("In static block 2");
	}
	{
		System.out.println("In instances block 2");
	}
}

