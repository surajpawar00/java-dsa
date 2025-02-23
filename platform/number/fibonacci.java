import java.util.*;
class Fibonacci{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number where fibonacci numbers you want to be print");
		int num = sc.nextInt();
		int[] fib = new int[num];
			fib[0] = 0;
			fib[1] = 1;
			for(int j = 2; j < num; j++){
				fib[j] = fib[j-1] + fib[j-2]; 
			}
			for(int i =0 ; i< num ; i++){
				System.out.println(fib[i]);
			}
		
	}
}
