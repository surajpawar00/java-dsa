class ConsDemo3{
	ConsDemo3(){
		System.out.println("In constructor");
	}
	void fun(){
		 ConsDemo3 obj = new  ConsDemo3();
	}
	public static void main(String [] args){
		 ConsDemo3 obj1 = new  ConsDemo3();
		  ConsDemo3 obj2 = new  ConsDemo3();

		  obj1.fun();
	}
}


