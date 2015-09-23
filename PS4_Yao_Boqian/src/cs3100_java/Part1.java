package cs3100_java;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1
{
    /**
     * Prints out all e-mail addresses contained in the input,
     * one address per line.  On each line, also prints out
     * the domain part of the address.
     */
	public static void main (String[] args) throws IOException
	{
	    // Create a Scanner to read from the test file
		URL url = Class.class.getResource("/files/Part1.txt");
		try (Scanner s = new Scanner(url.openStream()))
		{
		    // To keep things simple, we're requiring the pieces of the e-mail address
		    // to be word characters, which isn't quite right.
			Pattern p = Pattern.compile("(\\d{3}-\\d{2}-\\d{4})");
			
			// Consider the input one line at a time
			while (s.hasNextLine())
			{
			    // For each line, print out the match and the domain
			    // part of the match
				Matcher m = p.matcher(s.nextLine());
				while (m.find())
				{
					
					System.out.println(m.group());
				}
			}
		}
	}
}

