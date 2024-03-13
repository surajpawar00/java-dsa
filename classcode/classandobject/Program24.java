class Demo24{
	int x = 10;
	Demo24(){
		System.out.println("In construtor");
		System.out.println(this);
	}
	void fun (){
		System.out.println(x);
		System.out.println(this);
	}
	public static void main(String [] args){
		Demo24 obj = new Demo24();
		obj.fun();
		System.out.println(this);
	}
}


