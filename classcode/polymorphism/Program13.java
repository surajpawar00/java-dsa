class Parent13{
	public void fun (){
		System.out.println("In Parent Fun");
	}
}
class Child13 extends Parent13{

	 void fun (){
		System.out.println("In child Fun");
		}
	
}
/*Program13.java:8: error: fun() in Child13 cannot override fun() in Parent13
         void fun (){
              ^
  attempting to assign weaker access privileges; was public
1 error*/

