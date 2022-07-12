package UserFiles;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.FileAlreadyExistsException;
	import java.nio.file.Files;
	import java.nio.file.NoSuchFileException;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.Arrays;
	import java.util.Collections; 
	import java.util.Iterator; 
	import java.util.List; 
	import java.util.Scanner;


public class UserFiles {
	 Path path;

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	public void createDirectory() {
		// TODO Auto-generated method stub
		this.path = Paths.get("./Files/UserFiles");
		try {
		Files.createDirectories(path); System.out.println("Directory created successfully");
		} catch (IOException e) {
		System.out.println("Failed to create the directory"
		 
		+e.getMessage());

		}
		

		
		
	}

	public void listFilesinAscendingOrder() {
		// TODO Auto-generated method stub
		String dir = this.path.toString();
		File[] listOfFiles = new File(dir).listFiles(); List<File> listofFile = Arrays.asList(listOfFiles); Collections.sort(listofFile);
		Iterator<File> it = listofFile.iterator();
		while(it.hasNext()) {
		System.out.println(it.next().getName());
		}

		

		
	}

	public void createuserFile() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); System.out.println("Enter the File Name you want to create");

		String filename= sc.next();

		Path newfilepath =Paths.get(this.path + "/" + filename);

		 

        try { Files.createFile(newfilepath);
		     System.out.println("File Created Successfully");
		  }
		catch(FileAlreadyExistsException e) {
		System.out.println("The file you want to create already exists");

		this.createuserFile();
		 
		}
		catch(IOException e) {
		System.out.println("Failed to create File" +e.getMessage());
		}

		
	}
		//To list all the files added to the directory
	public void listofFiles() {
		String dir = this.path.toString();
		File[] listOfFiles = new File(dir).listFiles();

		for(File file: listOfFiles) {
		if(file.isDirectory()) { System.out.println(file.getName());
		}
		else if(file.isFile()) { System.out.println(file.getName());
		}
		}
	}

	


	public void searchFile() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the File Name you want to search"); String FiletoSearch = sc.next();

		Path path = Paths.get(this.path + "/" + FiletoSearch);

		if(Files.exists(path)) {
		if(Files.isRegularFile(path)) { System.out.println("Files Exists");
		}
		if(Files.isDirectory(path)) {
		System.out.println("File Exists but it is a Directory");
		 
		}
		}
		else {

		}

		
	

}
	
	//To delete User specified File from the application
	public void deleteuserFile() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the File Name you want to delete"); String FileToDelete = sc.next();
		
		try {
			Files.delete(Paths.get(this.path + "/" + FileToDelete)); System.out.println("File Deleted Successfully");
		}

			catch(NoSuchFileException e) {
			System.out.println("File doesnot exists!!!Enter new File Name to delete");
			 
			}
			catch(IOException e) { e.printStackTrace();
			}


	}
	
	}
