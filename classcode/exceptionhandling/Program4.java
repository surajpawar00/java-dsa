class Demo4{
	void m1(){
		System.out.println("Start m1");
		System.out.println(0/0);
		System.out.println("End  m1");
	}
	void m2(){
		
		System.out.println("Start m2");
		m1();
		System.out.println("end  m2");
	}
	public static void main(String [] args){

		System.out.println("Start main");
		Demo4 obj = new Demo4();
		obj.m2();
		System.out.println("End m1");
	}
}
/*Start main
Start m2
Start m1
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo4.m1(Program4.java:4)
        at Demo4.m2(Program4.java:10)
        at Demo4.main(Program4.java:17)*/
