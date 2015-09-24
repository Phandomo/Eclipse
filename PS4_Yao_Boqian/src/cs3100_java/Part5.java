package cs3100_java;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part5 {
	public static void main (String[] args) throws IOException
	{
				try (Scanner s = new Scanner(System.in))
				{
			
					Pattern p = Pattern.compile("<(((([\"'])((\\\\{2})*|(.*?[^\\\\](\\\\{2})*)))\\4)*?)|(\\w\\s\\d\\+\\=\\-\\*\\/)*?>");

					// Pull the entire document into a string
					String document = "";
					String result="";
					while (s.hasNextLine())
					{
					document = s.nextLine();
					// Replace every substring that matches the pattern with
					// the string ""
					Matcher m = p.matcher(document);
				    result += m.replaceAll("")+"\n";					
										
					}
					
					// Print out the result					
					System.out.println(result);
				}
	}

}
