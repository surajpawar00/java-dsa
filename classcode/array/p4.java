import java.util.*;
class Rcb4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Array Element");
		for (int i=0;i<arr.length;i++){
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

