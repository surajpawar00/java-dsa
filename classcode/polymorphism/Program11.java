class Parent{
	char fun(){
		System.out.println("Parent fun");
	return 'A';
	}
}
class Child extends Parent{
	int fun(){
		System.out.println("In child Fun");
	return 10;
	}
}
class Client11{
	public static void main(String []args){
		Parent obj = new Child();
		obj.fun();
	}
}
/*Program11.java:8: error: fun() in Child cannot override fun() in Parent
        int fun(){
            ^
  return type int is not compatible with char
1 errors*/
