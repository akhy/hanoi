// class Input.java
package library;
import java.io.*;
public class Input{


	public Input(){

	}

	public static String readString(){
      InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader sis = new BufferedReader(is);
		try
		{
			return sis.readLine();
		}
		catch(Exception e)
		{
			System.out.print("Ada kesalahan Masukan");
						System.exit(1);
			return "";
		}
	}

	public static int readInt(){
		try
		{
			return Integer.parseInt(readString());
		}
		catch(Exception e)
		{
			System.out.print("Ada kesalahan Masukan");
			System.exit(1);
			return 0;
		}
	}

	public static float readFloat(){
		try
		{
			return Float.parseFloat(readString());
		}
		catch(Exception e)
		{
			System.out.print("Ada kesalahan Masukan");
			System.exit(1);
			return 0;
		}
	}




	public static double readDouble(){
		try
		{
			return Double.parseDouble(readString());
		}
		catch(Exception e)
		{
			System.out.print("Ada kesalahan Masukan");
			System.exit(1);
			return 0;
		}
	}
}
