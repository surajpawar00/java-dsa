import java.util.*;
class PrimeNo{
	public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give number to check were prime or not");
	int num = sc.nextInt();
	int count = 0;
	for(int i = 1; i <=num ; i++){
		if(num % i ==0){
			count++;
		}
	}
	if(count == 2){
		System.out.println("Given number is prime number");
	}
	else{
		System.out.println("Given Number is not prime");
	}
   }
}
