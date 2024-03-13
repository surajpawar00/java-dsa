class Icc2 {
	Icc2(){
		System.out.println("In Icc Constructor");

	}
	void info(){
		System.out.println("ODI , T20");
	}

}
class Bcci2 extends Icc2 {
	Bcci2(){
		System.out.println("In Bcci Constructor");
	}
}
class Client2{
	public static void main (String [] args){
		Bcci2 obj = new Bcci2 ();
		obj.info();

	}
}


