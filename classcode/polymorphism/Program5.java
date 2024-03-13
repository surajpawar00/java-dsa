class Parent5{
	Parent5(){
		System.out.println("In Parent ");
	}
	void fun(){
		System.out.println("In Fun ");
	}
}
class Child5 extends Parent5{
	Child5 (){
		System.out.println("In Child ");
	}
	void gun (){
		System.out.println("In Gun ");
	}
}
class Client5{
	public static void main(String [] args){
		Child5 obj = new Child5();
	/*	Child5 obj2 = new Parent5();
	 *	child's object and parent's object can't be supported
	 *	Program5.java:20: error: incompatible types: Parent5 cannot be converted to Child5
                Child5 obj2 = new Parent5();
                              ^
1 error*/
	}
}

