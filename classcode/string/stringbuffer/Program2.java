class StringBuf2{
        public static void main(String [] args){
                String str1 = "Class";
		StringBuffer str2 = new StringBuffer ("COre2web");
                System.out.println(str1);  // class
                System.out.println(str2);  // Core2web

		str1 = str1.concat("Java");

		System.out.println(str1);      // class java (on heap) 
        }
}

