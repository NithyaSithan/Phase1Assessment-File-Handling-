package Assessment;

import java.util.List;
import java.util.Scanner;
import Assessment.FileSorting;
import Assessment.AddingFile;
import Assessment.FileDeleting;
import Assessment.SearchFile;

public class AssessmentTest {

	public static void main(String[] args) {
		
		System.out.println("\n\t Welcome to Lockers Pvt. Ltd");
		System.out.println("\t Email: lockers@lockers.com");
		System.out.println("\t ****************************");
		System.out.println("\n\t Developed By: Nithya");
		System.out.println("\t Email: nithya@lockers.com");
		System.out.println("\t ***************************");
		System.out.println("\n This application is useful to : ");
		System.out.println("\n # Retrieving the file names in an ascending order");
		System.out.println("\n # Adding file to a Directory");
		System.out.println("\n # Deleting a file from the Directory");
		System.out.println("\n # Searching a file in the Directory");
		
		showMainMenu();
		

	}

			private static int showMainMenu() {
				
				Scanner scanner1 = new Scanner(System.in);
				int choice1;
				while(true)
				{
					System.out.println("\nPlease enter an option ");
					System.out.println("\n1. Sorting Files in a Directory by ascending order");
					System.out.println("\n2. List of Business Level Operations");
					System.out.println("\n3. Close the application");
					choice1 = scanner1.nextInt();
					switch (choice1) {
					case 1:
						FileSorting.sortingFile();
						break;
					case 2:
						showSubMenu();
					case 3:
						scanner1.close();
						System.out.println("Program ends.....");
						System.exit(0);
						break;
				}
				}
				
			}
			
			private static int showSubMenu() {
				Scanner scanner2 = new Scanner(System.in);
				
				int choice2;
				while(true)
				{
					System.out.println("\nList of User Interfaces");
					System.out.println("-------------------------");
					System.out.println("\nPlease enter your choice :");
					System.out.println("\n1. Add a file to the existing Directory");
					System.out.println("\n2. Delete a file in the Directory");
					System.out.println("\n3. Search a file in the Directory");
					System.out.println("\n4. Back to Main Menu");
					choice2 = scanner2.nextInt();
					switch (choice2) {
					case 1:
						AddingFile.addFile();
						break;
					case 2:
						FileDeleting.deleteFile();
						break;
					case 3:
					    SearchFile.fileSearch();
					    break;
					case 4:
						showMainMenu();
						break;
				}
				}
				
				
			}
			
}
