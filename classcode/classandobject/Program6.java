class Demo6{
	int x = 10;
	String str = "shashi";
	void fun(){
		String str2 = new  String("Core2web");
		System.out.println(str2);
	}
	public static void main(String [] args){
		Demo6 obj = new Demo6();
		obj.fun();
		System.out.println(obj.x);
		System.out.println(obj.str);
	}
}

