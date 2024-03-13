class demo11A{
	int x = 10 ;
	private int y = 20 ;
	void fun(){
		System.out.println(x);
		System.out.println(y);
	}
}
class Demo11{
	public static void main (String []  args){

	demo11A obj = new demo11A();
	obj.fun();
	System.out.println(obj.x);
	System.out.println(obj.y);
	System.out.println(x);
	System.out.println(y);
	}
}
//output:
/*Program11.java:15: error: y has private access in demo11A
        System.out.println(obj.y);
                              ^
Program11.java:16: error: cannot find symbol
        System.out.println(x);
                           ^
  symbol:   variable x
  location: class Demo11
Program11.java:17: error: cannot find symbol
        System.out.println(y);
                           ^
  symbol:   variable y
  location: class Demo11
3 errors*/



