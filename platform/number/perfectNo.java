import java.util.*;
class PerfectNum{
      public static void main(String []args){
             Scanner sc = new Scanner(System.in);
             System.out.println("Give a Number to check were perfect or not");
             int num = sc.nextInt();
             int numSum = 0;
             for(int i = 1 ;i<num;i++){
                 if(num%i == 0){
                    numSum = numSum + i;
                 }
             }
             if(num == numSum){
                System.out.println("Given number is perfect number");
             }
             else{
                System.out.println("Given number is not perfect number");
             }
 
  }
      
}
