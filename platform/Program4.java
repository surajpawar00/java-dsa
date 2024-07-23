import java.util.*;
class Main4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number to check even or old ");
		int num = sc.nextInt();
		if(num % 2 == 0){
			System.out.println(num + " Number is even");
		}
		else{
			System.out.println(num +" Number is old");
		}
	} 

}
