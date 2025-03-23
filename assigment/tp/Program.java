import java.util.Scanner;
class Rohit {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int N = sc.nextInt();
		for(int i = 1 ; i<= N; i++){
			for(int j = N-i; j<N;j++){
			         System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
