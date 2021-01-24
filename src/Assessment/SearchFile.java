package Assessment;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Scanner;

public class SearchFile {
	
	public static void fileSearch() {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the directory name to search:");
        String dirPath = scan.nextLine(); 
        
        File dir = new File(dirPath);
        if(dir.isDirectory())
        {
            File[] fileList = dir.listFiles();

            System.out.println("\nTotal number of items present in the directory: " + fileList.length );


           for(File file:fileList)
            {
                System.out.println(file.getName());
            }
           
           System.out.println("\nEnter the file name to be searched:");
   		String name = scan.next();
   		
   		
   		String[] flist = dir.list();
   		int flag = 0;
   		if(flist == null) {
   			System.out.println("Empty directory");
   		}
   		else {
   			for(int i = 0; i < flist.length; i++) {
   				String filename = flist[i];   				
   				if(filename.equals("name")) {
   					System.out.println(filename + " found");
   					flag = 1;
   				}
   			}
   		}
   		if(flag == 0) {
   			System.out.println("File Not Found");
   		}

	            
	      
	        }
        else
        {
        	System.out.println("Invalid Directory. Please enter the correct directory.");
        	//System.exit(0);
        }
		
		
		
	}

}

