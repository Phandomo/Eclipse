package cs3100_java;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part2
{
    /**
     * Replaces all comments with the string COMMENT.  Comments begin
     * with slash-star and end with star-slash.  The beginning and end
     * don't have to be on the same line.
     */
	public static void main (String[] args) throws IOException
	{
		try (Scanner s = new Scanner(System.in))
		{
		    
			Pattern p = Pattern.compile("(//[\\d\\D]*[\\d\\D]*.*?)", Pattern.DOTALL);
			
			
			while (s.hasNextLine())
			{
				Matcher m = p.matcher(s.nextLine());			
			    String result = m.replaceAll("");
				System.out.println(result);
						
			}
					
		}
	}
}
