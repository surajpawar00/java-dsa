class StringDemo5{
	public static void main(String [] args){
		String str1 = "shashi";
		String str2 = new String ("shashi");
		String str3 = "shashi";
		String str4 = new String("shashi");

		System.out.println(str1.hashCode());
		 System.out.println(str2.hashCode());
		  System.out.println(str3.hashCode());
		   System.out.println(str4.hashCode());


	}
}
