class MiDemo6{

        static void fun(int xarr[]){
                for ( int x : xarr){
                        System.out.println(x);
                }
                 for ( int i=0 ; i < xarr.length;i++){
                        xarr[i]= xarr[i]+50;
                }
        }
        public static void main(String [] args){
                int arr[]={50,100,150};
               
                fun (arr);
                 for(int x : arr){
                        System.out.println(x);
                }
        }
}
