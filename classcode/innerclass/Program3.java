class Outer3{
	void m1(){
		System.out.println("In m1 Outer");
	
	//method local inner class 
	class Inner3{
		void m1(){
			System.out.println("in m1 Inner");
		}
	}
	Inner3 obj1 = new Inner3();
	obj1.m1();
}
void m2(){
	System.out.println("in m2 outer");
}
}
class Client3{
public static void main(String []args){
	Outer3 obj = new Outer3();
	obj.m1();
	obj.m2();
}
}
