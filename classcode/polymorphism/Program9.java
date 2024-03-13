class Demo9{
	void Fun(String str ){
		System.out.println("String");
	}
	void Fun(StringBuffer str2){
		System.out.println("StringBuffer");
	}
}
class Client9{
	public static void main(String [] args){
		Demo9 obj = new Demo9();
		obj.Fun("Core2web");//String
		obj.Fun(new StringBuffer("Core2web")); //StringBuffer
		//obj.Fun()   //  Ambiguous
			   }
}

