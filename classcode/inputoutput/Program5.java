import java.io.*;
class Demosac2{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		 int size = Integer.parseInt(br.readLine());
		 int element = Integer.parseInt();
                 System.out.println(" Enter elements = ");
		 for (int i=0; i < size;i++){
			 element = (br.readline());
		 }
               System.out.println(element);
	}
}

