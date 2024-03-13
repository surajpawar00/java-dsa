class Demo11{
	public static void main(String [] args){
		Demo11 obj = new Demo11();
		obj.m1();
		obj = null;
		try{
			obj.m2();
		}catch(NullPointerException obj2){
			System.out.println("here");
		}
		finally{
			System.out.println("Connection closed");
		}
		System.out.println("End main");
	}
	void m1(){
	}
	void m2(){
	}
}



