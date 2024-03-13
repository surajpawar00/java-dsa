class StringBuf5{
	public static void main(String[] args){
		StringBuffer str = new StringBuffer(100); //initial capacity
	        str.append("Binecaps");
		str.append("Core2web");

		System.out.println(str); //BinecapsCore2web
		System.out.println(str.capacity()); //100
		

		str.append("Indicators");

		System.out.println(str);
		System.out.println(str.capacity());
	}
}

