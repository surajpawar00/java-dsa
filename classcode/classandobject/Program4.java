class Facebook{
	int NumFrd = 1200;
	void AccTyp(){
		System.out.println("public Account");
	}
	public static void main(String[] args){
		Facebook obj = new Facebook();
		obj.AccTyp();
		System.out.println(obj.NumFrd);
	}
}

