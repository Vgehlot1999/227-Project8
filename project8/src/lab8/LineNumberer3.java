package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LineNumberer3 {
	public static void main(String[] args) throws FileNotFoundException {
	
		File file = new File("story.txt");

		
		Scanner scanner = new Scanner(file);
           Scanner line = null;
		int lineCount = 0;
	
		while (scanner.hasNextLine()) 
		{
			 line =new  Scanner(scanner.nextLine());
			 while(line.hasNext())
			 {
				 line.next();
	             lineCount++;
			 }
			 System.out.println(lineCount);
			 lineCount = 0;
		}
	
		scanner.close();
		
        
		System.out.println("Done");
	}
}











