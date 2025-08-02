package tnsExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsException2 
{
	static String acceptText() throws IOException
	{
		BufferedReader br;
		InputStreamReader is = new InputStreamReader(System.in);
		br = new BufferedReader(is);
		System.out.println("Enter a String:");
		String s = null;
		s = br.readLine();
		
		return s;
	}

}
