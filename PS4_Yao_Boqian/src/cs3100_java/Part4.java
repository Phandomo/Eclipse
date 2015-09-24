package cs3100_java;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {
	 /**
     * Prints out all e-mail addresses contained in the input,
     * one address per line.  On each line, also prints out
     * the domain part of the address.
     */
	public static void main (String[] args) throws IOException
	{
	   
		try (Scanner s = new Scanner(System.in))
		{
		    // To keep things simple, we're requiring the pieces of the e-mail address
		    // to be word characters, which isn't quite right.
			Pattern p = Pattern.compile("(([\"'])((\\\\{2})*|(.*?[^\\\\](\\\\{2})*)))\\2");
			String result = "";
			// Consider the input one line at a time
			while (s.hasNextLine())
			{
			    // For each line, print out the match and the domain
			    // part of the match
				Matcher m = p.matcher(s.nextLine());
				while (m.find())
				{
					result+=m.group()+"\n";
				}
			}
			System.out.println(result);
		}
	}
}
