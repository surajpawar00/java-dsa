class Demo26{
	int x = 10;
	Demo26(){
		System.out.println("In Non-Arg constructor");
	}
	Demo26(int x){
		this ();
		System.out.println("In para Constructor");
	}
	public static void main(String [] args){
		Demo26 obj = new Demo26();
	}
}

