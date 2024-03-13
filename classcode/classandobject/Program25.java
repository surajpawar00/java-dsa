class Demo25{
	int x = 10;
	Demo25(){
		System.out.println("in Non arg constuctor");
	}
	Demo25(int x ){
		System.out.println("In java Constructor");
	}

	public static void main(String [] args){
		Demo25 obj = new Demo25();
		Demo25 obj2 = new Demo25();
	}
}

