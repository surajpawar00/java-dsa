//cum of old element
import java.util.*;
class Rcb8{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a array Size");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter Array Element");
                for (int i=0;i<arr.length;i++){
                        arr[i]= sc.nextInt();
                }
                int sum = 0;
                for(int i=0;i<arr.length;i++){
                        if ( arr[i]% 2!=0){
                                sum = sum +arr[i];
                        }
                       
                }

                System.out.println("Sum of Old Array = " + sum);

        }
}
