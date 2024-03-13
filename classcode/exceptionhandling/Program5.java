//NullPointerException
class Demo5{
	void m1(){
		System.out.println("Start m1");
	}
	void m2(){
                System.out.println("Start m2");
	}
	public static void main(String [] args){
		System.out.println("Start main");
		Demo5 obj = new Demo5();
		obj.m1();
		obj = null;
		obj.m2();
		System.out.println("End main");
	}
}
/*Start main
Start m1
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Demo5.m2()" because "<local1>" is null
        at Demo5.main(Program5.java:13)*/
