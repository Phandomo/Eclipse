package cs3100_java;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1
{
    /**
     * Replace all SSN in the input with #
     */
	public static void main (String[] args) throws IOException
	{
				try (Scanner s = new Scanner(System.in))
				{
			
					Pattern p = Pattern.compile("(\\s|^)\\d{3}-\\d{2}-\\d{4}(\\s|$)",Pattern.DOTALL);

					// Pull the entire document into a string
					String document = "";
					while (s.hasNextLine())
					{
						document += s.nextLine() + "\n";
					}

					// Replace every substring that matches the pattern with
					// the string "COMMENT"
					Matcher m = p.matcher(document);
					String result = m.replaceAll(" ###-##-#### ");
					
					// Print out the result
					System.out.println(result);
				}
	}
}

