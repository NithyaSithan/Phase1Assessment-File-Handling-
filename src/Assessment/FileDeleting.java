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
		System.out.println("Enter the Directory Path: ");
		String fileDir = reader.nextLine();
		System.out.println("Enter the file name to be deleted: ");
		String fileName = reader.nextLine();
		
		
		 try
	        { 
			 File dir = new File(fileDir);
		        if(dir.isDirectory())
		        {
		        	 File[] fileList = dir.listFiles();
		        	 String[] flist = dir.list();	
		        	 int flag = 0;
		        		if(flist == null) {
		        			System.out.println("Empty directory");
		        		}
		        		else {
		        			for(int i = 0; i < flist.length; i++) {
		        				String filename = flist[i];
		        				
		        				if(filename.equals(fileName)) {
		        					
		        					flag = 1;
		        				}
		        			}
		        		}
		        		if(flag == 1) {
			 Path path = Paths.get(fileDir+"/"+fileName);
						 
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
		        else
		        {
		        	System.out.println("File Not Found");
		        }
		        
		        } 	
		        else
		        {
		        	System.out.println("Invalid directory.");
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

