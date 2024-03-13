class Parent17{
       static void fun (){
                System.out.println("In Parent Fun");
        }
}
class Child17 extends Parent17{

         static void fun (){
                System.out.println("In child Fun");
                }
}
class Client17{
	public static void main(String [] args){
		Child17 obj = new Child17();
		obj.fun();
		Parent17 obj2 = new Parent17();
		obj2.fun();
		Parent17 obj3 = new Child17();
		obj3.fun();
	}
}
//Due to static methods didin't follow overrridding this is know as Method hidding
