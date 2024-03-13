//1 
//2 C
//4 E 6
//7 H 9 J
//
//
//
//
//
//



class q1{

	public static void main(String[] boss){
	
	
		int a  = 1;
		char ch = 'A';



		for(int i = 1; i<= 4;i++){
		
			for(int j =1;j<=i ; j++){
			
				if(j%2==1){
				
					System.out.print((a++) +("  ")  );
					ch++;
				
				
				
				} 
				else{
				System.out.print((ch++)+("   "));
				a++;
				
				
				}
			
			
			
			
			
			
			
			
			
			
			
			}
		
		System.out.println();
		
		
		
		}
	
	
	
	
	
	}




}
