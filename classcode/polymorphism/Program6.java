class Parent6{
	Parent6(){
		System.out.println("In Parent ");
	}
	void fun(int x){
		System.out.println("In Parent Fun ");
	}
}
class Child6 extends Parent6{
	Child6 (){
		System.out.println("In Child ");
	}
	void fun (){
		System.out.println("In Child Fun ");
	}
}
class Client6{
	public static void main(String [] args){
		Parent6 obj = new Child6();
		obj.fun();
	
	}
}

