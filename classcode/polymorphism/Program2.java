class Demo2{
	void fun (int x){
		System.out.print("In int");
		System.out.println(x);
	}
	void fun (float y){
                System.out.println("In float");
		System.out.println(y);
        }
	void fun (Demo2 obj){
                
		System.out.println("In Demo Obj para");
		System.out.println(obj);
        }
	public static void main(String[] args){
		Demo2 obj1 = new Demo2();
		obj1.fun(10);
		obj1.fun(10.9f);
		Demo2 obj = new Demo2();
		obj1.fun(obj);
	}
}

