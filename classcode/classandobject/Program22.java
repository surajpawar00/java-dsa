class Demo22{
	int x = 10;
	Demo22(){
		System.out.println("Construtor");
	}
	{
		System.out.println("Instance block 1");
	}
	public static void main(String [] args){
		Demo22 obj = new Demo22();
		System.out.println("main");
	}
	{
		System.out.println("Instance block 2");
	}
}

