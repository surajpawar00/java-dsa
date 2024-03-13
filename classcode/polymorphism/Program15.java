class Parent15{
        final void fun (){
                System.out.println("In Parent Fun");
        }
}
class Child15 extends Parent15{

         void fun (){
                System.out.println("In child Fun");
                }
}
/*Program15.java:8: error: fun() in Child15 cannot override fun() in Parent15
         void fun (){
              ^
  overridden method is final
1 error*/
