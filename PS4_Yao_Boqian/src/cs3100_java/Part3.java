package cs3100_java;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {
	 /**
     * Prints out the number of integer literals the input contains
     */
    public static void main (String[] args) throws IOException
    {
      
        try (Scanner s = new Scanner(System.in))
        {
          
            Pattern p = Pattern.compile("(^|\\s)\\(\\d{3}\\)\\s?\\d{3}-\\d{4}($|\\s)");
            
            // Use this variable to accumulate the answer
            int count = 0;
            
            // Work on one line at a time
            while (s.hasNextLine())
            {
                // Match on the current line
                Matcher m = p.matcher(s.nextLine());
                                
                while (m.find())
                {
                    count++;
                }
            }
            
            // Display the answer
            System.out.println(count);
        }
    }
}
