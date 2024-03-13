//array address at heap and how it work on stack 
class Kkr1{
	static void fun(int arrx[]){
		System.out.println("Changing Array 1 & 2 value");
		arrx[1]=70;
		arrx[2]= 80;
	}

	public static void main (String[] args){
		int arr[] = {10,20,30,40};
		for( int x : arr){
			System.out.println(x);
		}
		System.out.println(" Address of this array");
		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));

		fun(arr);
              // System.out.println(" After changing arrays address");
	       System.out.println(System.identityHashCode(arr[0]));
	       System.out.println(System.identityHashCode(arr[1]));
	       System.out.println(System.identityHashCode(arr[2]));
               System.out.println(System.identityHashCode(arr[3]));
	}
}


