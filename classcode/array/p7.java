import java.util.*;
class Rcb7{
        public static void main(String []args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a array Size");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter Array Element");
                for (int i=0;i<arr.length;i++){
                        arr[i]= sc.nextInt();
                }
                int count = 0;
		int count1 = 0;
                for(int i=0;i<arr.length;i++){
                        if ( arr[i]% 2==0){
                                count++;
                        }
			else{
				count1++;
			}
                }

                System.out.println("Count of Even Array = " + count);
		System.out.println("Count of Old Array = " + count1);

        }
}
