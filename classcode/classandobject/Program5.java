class Demo5{
	int x = 10;
	int y = 20;
	void disp(){
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args){
		Demo5 obj = new Demo5();
		obj.disp();
		System.out.println(obj.x);
		System.out.println(obj.y);
	}
}

