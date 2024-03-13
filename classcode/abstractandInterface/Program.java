abstract class Parent{
	void carrier(){
		System.out.println("Doctor");
	}
	abstract void marry();
}
class Client{
	public static void main(String [] args){
	       Parent obj = new Parent();
	}
}
/*Program.java:9: error: Parent is abstract; cannot be instantiated
               Parent obj = new Parent();
                            ^
1 error*/
