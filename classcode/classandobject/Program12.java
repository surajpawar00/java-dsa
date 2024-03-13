class demo12A {
	int emp_id = 21;
	String emp_name = "Manav";
	void emp_info(){
		System.out.println("Id " + emp_id);
		System.out.println("name " +emp_name);
	}
}
class Demo12{
	public static void main(String [] args){
		demo12A obj = new demo12A();
		obj.emp_info();
		System.out.println(obj.emp_id);
		System.out.println(obj.emp_name);
	}
}

