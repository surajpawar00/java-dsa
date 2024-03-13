class Parent4{
	Parent4(){
		System.out.println("In Parent ");
	}
	void fun(){
		System.out.println("In Fun ");
	}
}
class Child4 extends Parent4{
	Child4 (){
		System.out.println("In Child ");
	}
	void gun (){
		System.out.println("In Gun ");
	}
}
class Client4{
	public static void main(String [] args){
		Child4 obj = new Child4();
		obj.fun();
		obj.gun();
		Parent4 obj2 = new Parent4();
		obj2.fun();
		obj2.gun();
	}
}
/*Program4.java:24: error: cannot find symbol
                obj2.gun();
                    ^
  symbol:   method gun()
  location: variable obj2 of type Parent4
1 error*/

