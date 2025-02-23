import java.util.*;
class Armstrong{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the number to check Armstrong or not :");
		int Onum = sc.nextInt();
		int num = Onum ;
		int count = 0;
		int sum = 0;
		while(num > 0){
			count++;
			num = num/10;
		}
		num = Onum;
		System.out.println(num);
		while(num != 0){
			int rem = num % 10;
			int mul = 1;

		        for(int j = 0 ; j<count ; j++){
                               mul = mul * rem;
			}
			sum = sum + mul;
			num = num/10;

		}

		if(Onum == sum){
			System.out.println("Given Number is Armstrong Number");
		}
		else{
			System.out.println("Given Number is not Armstrong NUmber");
		}


	}
}
