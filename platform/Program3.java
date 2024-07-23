import java.util.*;

class Main3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int cunt = 0;
		for(int i = 1;i<=num;i++){
			if(num % i == 0){
				cunt++;
			}
		}
		if(cunt == 2){
			System.out.println(num +" is a prime number");
		}
		else{
			 System.out.println(num +" is not prime number");
		}
	}
}
