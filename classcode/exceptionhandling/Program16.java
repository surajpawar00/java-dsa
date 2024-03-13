import java.util.Scanner;
class DataUnderFlowException extends RuntimeException {
    DataUnderFlowException(String msg) {
        super(msg);
    }
}

class DataOverFlowException extends RuntimeException {
    DataOverFlowException(String msg) {
        super(msg);
    }
}
class Demo16{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Elements");
		for (int i = 0 ;i <arr.length;i++){
			int data = sc.nextInt();
			if(data < 0 )
				try{
					throw new DataUnderFlowException("Value samll");
				}catch(DataUnderFlowException obj){
					System.out.println(obj.getMessage());
					data = sc.nextInt();
				}
			if(data > 100 )
                                try{
                                        throw new DataOverFlowException("Value large");
                                }catch(DataOverFlowException obj){
                                        System.out.println(obj.getMessage());
                                        data = sc.nextInt();
                                }
		}
	}
}


				 
