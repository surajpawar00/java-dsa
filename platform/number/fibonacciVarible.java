import java.util.*;
class FibonacciVarible{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Fibonacci terms to print: ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		if(num < 0){
			System.out.println("Please Enter a positive input");
		}
		System.out.println(a);
		System.out.println(b);

		int temp;

		for(int i = 1 ; i <num ; i++){
			temp = a + b;
			System.out.println(temp);
			a = b;
			b = temp;
		}

	}
}
