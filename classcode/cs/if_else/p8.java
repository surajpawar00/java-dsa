class demo8{
	public static void main(String [] args){
		int i = 200;
		int bill;
		if (i <= 100){
		    bill = i * 1;
		   System.out.println( " bill is " + bill);
		}
		else if (i > 100){
			i = i - 100;
			bill = (i * 2) + 100;
			System.out.println(" bill is " + bill);
		}
	}
}


