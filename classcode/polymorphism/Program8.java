class Demo8{
	void Fun(int x, float y ){
		System.out.println("Int-Float");
	}
	void Fun(float x , int y ){
		System.out.println("Float-Int");
	}
}
class Client8{
	public static void main(String [] args){
		Demo8 obj = new Demo8();
		obj.Fun(10,10);
	}
}
/*Program8.java:12: error: reference to Fun is ambiguous
                obj.Fun(10,10);
                   ^
  both method Fun(int,float) in Demo8 and method Fun(float,int) in Demo8 match*/
