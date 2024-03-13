class code {
	public static void main(String[] args){
	       int n = 153;
               int temp1 = n;
               int temp2 = n;
               int count = 0;
	       int sum = 0;
               for(int i =1; 1<=n;i++){
	          if(n%10!=0){
	             count++;
		  }
                n = n/10 ;
	       }
	       while(temp1!=0){
		       int rem = temp1%10;
		       int mul = 1;
		       for (int j = 1; j<=count; j++){
			       mul = mul*rem;
		       }
		       sum = sum +mul;
		       temp1 = temp1/10;
	       }
	       if (temp2==sum){
		       System.out.println("Armstrong Number");
	       }
	       else{
		       System.out.println("Not a Armstrong Number");
	       }
	}
}

               

