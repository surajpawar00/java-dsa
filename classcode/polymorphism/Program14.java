class Parent14{
        private void fun (){
                System.out.println("In Parent Fun");
        }
}
class Child14 extends Parent14{

         void fun (){
                System.out.println("In child Fun");
                }
}
class Client14{
	public static void main(String[] args){
	       Child14 obj = new Child14();
		obj.fun();
	}
}
//Parents methods doesn't came in child class 

