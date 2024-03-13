class Outer6{
	static class Inner6{
		void m1(){
			System.out.println("In m1 inner Static ");
		}
	}
}
class Client6{
	public static void main(String [] args){
		Outer6.Inner6 obj = new Outer6.Inner6();
		obj.m1();
	}
}

