//Run time Exceptions
class Tpye2{
	public static void main(String [] args){
		int arr[] = new int[]{10,20,30,40,50};
		for (int i = 0 ; i <=arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
/*10
20
30
40
50
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at Tpye2.main(Type2.java:5)*/
