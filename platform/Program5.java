import java.util.*;
class Main5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num == 0 ){
			System.out.println("0");
		}
		else{
			int fib[] = new int[num +1] ;
			fib[0] = 0;
			fib[1] = 1;
			for(int i =2;i<=num;i++){
				fib[i] = fib[i-1] + fib[i-2];
			}
			for(int i = 0;i<= num ;i++){
				System.out.println(fib[i] + " " );
			}
		}
	}
}
