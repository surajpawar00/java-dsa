import java.util.*;
class PalimdromeNo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number to check Palimdrome or not :");
		int num = sc.nextInt();
	        int rnum = num;
		int Cnum =0;
		int rem = 0;
		while(num != 0){
			rem = num % 10;

			Cnum = (Cnum * 10) + rem ;

			num = num /10;
		}
		if(Cnum == rnum){
			System.out.println("Given Number is palimdrome");
		}
		else{
			System.out.println("Given number is not palimdrome");
		}
	}
}
