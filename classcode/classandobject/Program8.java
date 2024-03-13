class MacD{
	int NoOfItem = 5;
	String str = "Frices";
	void menu(){
		String menu1 = "Veg";
		String menu2 = "NonVeg";
		 System.out.println(NoOfItem);
		 System.out.println(str);
	}
}
class User{
	public static void main(String[] args){
		MacD obj = new MacD();
		obj.menu();
	}
}

