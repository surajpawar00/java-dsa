import java.util.Scanner;
class MyNumber extends RuntimeException{
	MyNumber(String msg){
		super(msg);
	}
}
class Demo15{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the Mobile Number ");
			String str = sc.next();
			if (str.length() != 10 ){
				throw new MyNumber("Number must be 10 digit ");
			}
			System.out.println(str);
		
	}
}
