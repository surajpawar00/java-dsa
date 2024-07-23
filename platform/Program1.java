import java.util.*;

class Main{
	public static void main(String [] args){
		String str = "HELLO";

		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();

		str = str1.toString();

		System.out.println("Reverse of String is = " + str);
	}
}
