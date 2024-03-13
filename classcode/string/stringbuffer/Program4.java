class StringBuf4{
        public static void main(String [] args){
                StringBuffer str = new StringBuffer ("");
                System.out.println(str.capacity());	//16

	        str.append("shashi");
		System.out.println(str); //shahsi
		System.out.println(str.capacity()); //16

		str.append("Bagal");
                System.out.println(str); //Bagal
                System.out.println(str.capacity());//16

		str.append("Core2web");
                System.out.println(str);  //shashibagalCore2web
                System.out.println(str.capacity()); //34
        }
}
