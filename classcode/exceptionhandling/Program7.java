
import java.io.*;
class Demo7{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Str = br.readLine();
                System.out.println(Str);
		br.close();
		String Str2 = br.readLine();
                System.out.println(Str2);

	}
}
/*KD anna
KD anna
Exception in thread "main" java.io.IOException: Stream closed
        at java.base/java.io.BufferedReader.ensureOpen(BufferedReader.java:123)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:321)
        at java.base/java.io.BufferedReader.readLine(BufferedReader.java:396)
        at Demo7.main(Program7.java:9)*/
