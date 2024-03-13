class pattern3{
        public static void main(String [] args){
                     char CH = 'A';
                     int num = 1;
                for (int i= 1;i<=3;i++){
         
                        for(int j=1;j<=4;j++){
                                if(j%2==1){
                                        System.out.print(CH++ + " ");
                                }
                                else{
                                        System.out.print(num++ + " " );
                                }
                        }
                        System.out.println();
     }
        }
}
