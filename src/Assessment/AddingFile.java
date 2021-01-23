package Assessment;

import java.io.File;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddingFile {
	
	public static void addFile(){ 
		
		Scanner reader = new Scanner(System.in); 
		//boolean success = false; 
		System.out.println("Enter the file name with path to be created : "); 
		String filename = reader.nextLine(); 
		
		try {
			 Path path = Paths.get(filename);
			 if(path.isAbsolute())
			 {
				 //System.out.println("correct path");			 
			 File f = new File(filename);			
			if(f.createNewFile()) {
				System.out.println("No such file exists, creating now!");
				System.out.printf("Successfully created new file: %s%n", f);
			}else {
				System.out.println("File already exist!");
				
		} 
			 }
			 else
			 {
				 System.out.println("Incorrect path. Please enter the correct path.");
			 }
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Incorrect file path!");
			e.printStackTrace();
		}	
		catch(InvalidPathException ee)
		 {
		 		System.out.println("Invalid Path. Please enter the correct path."); 
		 }
				
		}
	
}

	

