import java.util.Scanner;
class DataOverFlowException extends RuntimeException{
	DataOverFlowException(String msg){
		super(msg);
	}
}
class DataUnderFlowException extends RuntimeException{
	DataUnderFlowException(String msg){
		super(msg);
	}
}
class ArrayDemo14{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements in array");
		int n = sc.nextInt();

                int[] arr = new int[n];
		System.out.println("Note: 0<elments>100");
		for (int i = 0 ; i < arr.length;i++){
			int data = sc.nextInt();
			if (data <0)
				throw new DataUnderFlowException("Mitra elemnet ha 0 peksha lahan aahe ");
			if (data >100)
				throw new DataOverFlowException("Mitra element ha 100 peksha motha aahe");
			arr[i] = data;
		}
	}
}

