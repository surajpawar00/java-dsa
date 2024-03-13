class Singleton{
	static Singleton obj = new Singleton();
	 Singleton(){
		System.out.println("Constructor");
	}
	static Singleton getObject(){
		return obj ;
	}
}
class Client5{
	public static void main (String [] args){
		Singleton obj1 = new Singleton();
		System.out.println(obj1);

		Singleton obj2= new Singleton();
		System.out.println(obj2);

		Singleton obj3 = new Singleton();
		System.out.println(obj3);
	}
}


