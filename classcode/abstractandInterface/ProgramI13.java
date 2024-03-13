interface A{
	int x = 10;
}
interface B{
	int x = 20;
}
class ChildI13 implements A,B{
	int x = 30 ;
	void fun (){
		System.out.println(x);
	}
}
class ClientI13{
	public static void main(String [] args){
		ChildI13 obj = new ChildI13();
		obj.fun();
	}
}

