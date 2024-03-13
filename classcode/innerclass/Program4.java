class Outer4{
	void m1(){
		System.out.println("in m1 outer");
	}
	static class Inner4{
		void m1(){
			System.out.println("in m1 inner");
		}
	}
}
class Client4{
	public static void main(String [] args){
		Outer4.Inner4 obj = new Outer4.Inner4();
		obj.m1();
	}
}

