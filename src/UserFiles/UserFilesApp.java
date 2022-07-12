package UserFiles;

import java.util.Scanner;

public class UserFilesApp {

	

	UserFiles Userfiles ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserFilesApp userfilesapp = new UserFilesApp();
		userfilesapp.MainMenu();
		
		

	}

	private void MainMenu() {
		// TODO Auto-generated method stub
		System.out.println("Main Menu");
		Userfiles = new UserFiles();
		this.Userfiles.createDirectory();
		
		
		Scanner input = new Scanner(System.in);
		int mainSelection;
		
		
		System.out.println("%*****%*****%*****%*****%*****%*****% - SIMPLILEARN - %*****%*****%*****%*****%*****%*****%");
		
		      System.out.println("%*****%*****%*****%*****%*****%*****% - FSD PHASE I JAVA PROJECT - %*****%*****%*****%*****%*****%*****%");
		
		
		      System.out.println("%*****%*****%*****%*****%*****%*****% - VARSHARANI TODKAR - %*****%*****%*****%*****%*****%*****%");
		
		      System.out.println();
		      
		      do {
		    	  
		    	  
		    	  System.out.println("Choose from the below options");
		    	  
		    	  System.out.println("1.Display The File Name in Asending Order");
		    	  
		    	  System.out.println("2. Display The Interface Menu");
		    	  
		    	  System.out.println("3. Exit");
		    	  
		    	  mainSelection = input.nextInt();
		    	  
		    	  switch(mainSelection) {
		    	  case 1:
		    		  Userfiles.listFilesinAscendingOrder();
		    	  break;
		    	  
		    	  
		    	  case 2:
		    		  System.out.println("Option 2 selected");
		    		  userInterfaceMenu();
		    	  break;
		    	  
		    	  case 3:
		    		  System.out.println("Thank you For Using Our Application");
		    		  
		    		  System.exit(0);
		    		  
		    	 break;
		    	 
		    default:
		    	System.out.println("wrong Optio");
		    			  
		    	  }
		    	  
		      }while(mainSelection!=3);
		      
		
		
		
	}

	private void userInterfaceMenu() {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int selection;
		
		do {
			
			System.out.println("%*****%*****%*****%****% - USERINTERFACE - %*****%*****%*****%*****%");
			
			System.out.println("Choose From The Below Options");
			System.out.println("1. Add a user specified file from the application");
			System.out.println("2. Delete a user specified file from the application");
			System.out.println("3. Seacrch for a user specified file from the application");
			System.out.println("4.Back to the main Menu");
			
			selection = input.nextInt();
			switch(selection) {
			case 1:
				this.Userfiles.createuserFile();
				break;
				
			case 2:
				System.out.println("Option 2 Selected");
				this.Userfiles.deleteuserFile();
				break;
				
			case 3:
				System.out.println("Option 3 Selected");
				this.Userfiles.searchFile();
				break;
				
			case 4:
				MainMenu();
				
				
		   default:
			   System.out.println("Wrong Option Selected");
				
			}
			
		}while(selection !=4);
		
		
	}

}