class JaggedArray2{
        public static void main(String [] args){
                int arr [] [] = {{10,20,30},{40,50},{60}};

                for (int i =0 ; i<3;i++){
                        for (int j = 0; j< 3;j++){
                                System.out.print((arr[i][j]) + " " );
                        }
                System.out.println();
                }
		// for each loop 
		 /*for (int x : arr){
                        for (int []y:x){
                        System.out.print(y + " ");
                        }
                        Syatem.out.println();

		}*/

       
       	}
}

//output;
/*10 20 30
40 50 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        at JaggedArray2.main(p5.java:7) */
