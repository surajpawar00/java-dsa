import java.util.*;
class Rcb5{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                int arr[] = new int[5];
                System.out.println("Enter Array Element");
                for (int i=0;i<arr.length;i++){
                        arr[i]= sc.nextInt();
                }
		int Sum = 0;
                for(int i=0;i<arr.length;i++){
                        Sum =Sum + arr[i];
                }
		System.out.println("Sum of Array = " + Sum);

        }
}

