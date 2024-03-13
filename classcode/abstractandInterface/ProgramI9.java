interface DemoI9{
	static void fun(){
		System.out.println("In Fun Demo");
	}
}
class DemoChildI9 implements DemoI9{

}
class ClientI9{
	public static void main(String [] args ){
		DemoChildI9 obj = new DemoChildI9();
		obj.fun();
	}
}
/*ProgramI9.java:12: error: cannot find symbol
                obj.fun();
                   ^
  symbol:   method fun()
  location: variable obj of type DemoChildI9
1 error*/
