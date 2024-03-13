static class demo15A{
	static int x = 10;
	static int y = 20;
	 static void disp(){
		 System.out.println(x);
		 System.out.println(y);
	 }
}
class Demo15{
	public static void main(String [] args){
		System.out.println(static demo15A.x);
		System.out.println(static demo15A.y);
		static demo15A.disp();
	}

}
/*Program15.java:15: error: class, interface, or enum expected
}
^
7 errors*/
