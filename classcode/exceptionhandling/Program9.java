import java.io.*;
class ExceptionDemo9{
	public static void main(String [] args)throws IOException,NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String =");
		String str = br.readLine();
		System.out.println(str);
		int data = 0;
		try{
		data = Integer.parseInt(br.readLine());
		}catch (NumberFormatException obj ){
			System.out.println("Please enter integer data ");
			data = Integer.parseInt(br.readLine());
		}
		System.out.println(data);
	}
}

