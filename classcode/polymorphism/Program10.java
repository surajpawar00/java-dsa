class Demo10{
	void Fun(Object obj ){
		System.out.println("In Object");
	}
	void Fun(String str){
		System.out.println("String");
	}

}
class Client10{
	public static void main(String []args){
		Demo10 obj = new Demo10();
		obj.Fun("Core2web");
		obj.Fun(new StringBuffer("Core2web"));
	        obj.Fun(null);
	}
}

