class Outer1{
	class Inner1{
		void m1 (){
			System.out.println("in M1 Inner");
		}
	}
	void m2(){
		System.out.println("in M2 Outer ");
	}

}
class Client1{
	public static void main(String [] args ){
		Outer1 obj = new Outer1();
		obj.m2();
	//	obj.m1(); error 
	        Outer1.Inner1 obj1 = obj.new Inner1();
		obj1.m1();
	}
}

		
