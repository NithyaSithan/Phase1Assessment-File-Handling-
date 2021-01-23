package Assessment;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDeleting {
	
	public static void deleteFile() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the file path to be deleted: ");
		String fileName = reader.nextLine();
		
		
		 try
	        { 
			 Path path = Paths.get(fileName);
			 
	           boolean fileDelete =  Files.deleteIfExists(path);
	           if(fileDelete)
	           {
	        	   System.out.println("Deletion successful."); 
	           }
	           else
	           {
	        	   System.out.println("Deletion Unsuccessful. File does not exist."); 
	           }
	            
	        } 
	        catch(NoSuchFileException e) 
	        { 
	            System.out.println("No such file/directory exists"); 
	        } 
	        catch(DirectoryNotEmptyException e) 
	        { 
	            System.out.println("Directory is not empty."); 
	        } 
	        catch(IOException e) 
	        { 
	            System.out.println("Invalid permissions."); 
	        } 
		 	catch(InvalidPathException ee)
		 {
		 		System.out.println("Invalid Path. Please enter the correct path."); 
		 }
	          
	        
	    } 
	} 

