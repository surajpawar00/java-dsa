class Parent{
	Parent(){
		System.out.println("In Parent Constructor");
	}
	void property(){
		System.out.println("Gold,Cars");
	}
	void marry(){
		System.out.println("Deepika Padukon");
	}
}
class Child extends Parent {
	Child (){
		System.out.println("In child Constuctor");
	}
	void marry (){
		System.out.println("Sonam Bajwa");
	}
}
class Demo3{
	public static void main(String [] args){
		Child obj = new Child();
		obj.marry();
		obj.property();
	}
}

