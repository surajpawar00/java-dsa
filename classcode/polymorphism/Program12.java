class Parent{
        Object fun(){
		Object obj = new Object();
                System.out.println("Parent fun");
        return obj ;
        }
}
class Child extends Parent{
        String  fun(){
                System.out.println("In child Fun");
        return "String";
        }
}
class Client12{
        public static void main(String []args){
                Parent p = new Child();
                p.fun();
        }
}
