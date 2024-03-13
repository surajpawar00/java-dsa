class Demo27A{
	private int jer_no = 0 ;
	private String name = null;
	Demo27A(int jer_no ,String name){
		this.jer_no = jer_no;
		this .name = name;
		System.out.println("In constructor");
	}
	void info(){
		System.out.println(jer_no + " = "+ name);
	}
}
class Demo27{
	public static void main (String [] args){
		Demo27A obj = new Demo27A(18,"Virat");
		obj.info();
		Demo27A obj2 = new Demo27A(7,"Dhoni");
                obj2.info();
		Demo27A obj3 = new Demo27A(45, "Rohit");
                obj3.info();
	}
}




