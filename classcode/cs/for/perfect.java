class demo7{
	public static void main(String [] args){
		int n = 6;
		int sum = 0;
		for(int i = 1;i<n ;i++){
			if(n%i==0){
				sum = sum + i;
			}
	}
	if(sum == n){
		System.out.println(" It is a Perfect Number");
	}
else{
System.out.println("It is Not Perfect Number");
}
	}
}
