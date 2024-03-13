// Mul of even number
import java.util.*;
class Rcb9{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a array Size");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter Array Element");
                for (int i=0;i<arr.length;i++){
                        arr[i]= sc.nextInt();
                }
                int mul = 1;
                for(int i=0;i<arr.length;i++){
                        if ( arr[i]% 2==0){
                                mul =  mul*arr[i];
                        }

                }

                System.out.println("mul of even Array = " + mul);

        }
}
