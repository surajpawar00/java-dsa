class Parent16{
       static void fun (){
                System.out.println("In Parent Fun");
        }
}
class Child16 extends Parent16{

         void fun (){
                System.out.println("In child Fun");
                }
}
/*Program16.java:8: error: fun() in Child16 cannot override fun() in Parent16
         void fun (){
              ^
  overridden method is static
1 error*/
