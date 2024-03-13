class Demo18{
	int x = 10 ;
	static int y = 20;
	static {
		System.out.println("In static block 1");
	}
	public static void main (String []args){
		System.out.println("In main method ");
		Demo18 obj = new Demo18();
		System.out.println(obj.x);
	}
	static {
		System.out.println("In static block 2");
		System.out.println(y);
	}
}


