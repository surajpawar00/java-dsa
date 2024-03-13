//ArithmeticException:
class Demo3{
	void m1(){
		System.out.println(10/0);
		m2();
	}
	void m2(){
		System.out.println("In m2");
	}
	public static void main(String [] args){
		System.out.println("Start main");
		Demo3 obj = new Demo3();
		obj.m1();
		System.out.println("End main");
	}
}
/*Start main
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo3.m1(Program3.java:3)
        at Demo3.main(Program3.java:12)*/
