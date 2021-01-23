package Assessment;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Scanner;

public class FileSorting {
	
	public static void sortingFile() {
	    Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the directory path: ");
        String dirPath = scanner.nextLine(); 
        
        File folder = new File(dirPath);
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();

            

            System.out.println("\nTotal number of items present in the directory: " + fileList.length );


           for(File file:fileList)
            {
                System.out.println(file.getName());
            }

           FileFilter fileFilter = new FileFilter()
            {
                @Override
                public boolean accept(File file) {
                    return !file.isDirectory();
                }
            };

            fileList = folder.listFiles(fileFilter);
            
            Arrays.sort(fileList);

            System.out.println("\nList of Files by ascending order");
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }

        } 
        else
        {
        	 System.out.println("Invalid Path. Please enter the correct path.");
        }
	
}
	
	}
	
