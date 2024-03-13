class Demo20{
	static {
		System.out.println("in static demo method");
	}
	public static void main(String [] args){
		System.out.println("In main Demo Method");
	}
}
class Cliet20{
	static {
		System.out.println("in static cliet method");
	}
	public static void main(String [] args){
		System.out.println("In Main cliet method");
	}
	static {
		System.out.println("in static block 3");
	}
}

