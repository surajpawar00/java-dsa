class Icc {
	Icc(){
		System.out.println("In Icc Constructor");
	}
}
class Bcci extends Icc {
	Bcci(){
		System.out.println("In Bcci Constructor");
	}
}
class Client1{
	public static void main (String [] args){
		Bcci obj = new Bcci ();
	}
}


