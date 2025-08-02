package tnsExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException1 
{
//	Checked Exception
	static String acceptText() 
	{
		BufferedReader br;
		InputStreamReader is = new InputStreamReader(System.in);
		br = new BufferedReader(is);
		System.out.println("Enter a String:");
		String s = null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
	
}
