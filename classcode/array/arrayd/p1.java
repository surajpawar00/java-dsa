class DimensionArray{
	public static void main(String[] args){
		int arr[] [] = new int[2][3];
		      arr[0][0]= 11;
		      arr[0][1]= 13;
		      arr[0][2]= 14;
		      arr[1][0]= 21;
		      arr[1][1]= 22;
		      arr[1][2]= 23;
	      for(int i = 0;i<2;i++){
		      for (int j =0 ;j<3;j++){
			      System.out.print((arr[i][j])+ " ");
		      
		      }
	      System.out.println();
	      }
	}
}


