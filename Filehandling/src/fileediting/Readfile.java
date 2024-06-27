package fileediting;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Readfile {
	public static void main(String[]args) {
		try {
			File obj=new File("C:\\Users\\Admin\\Documents\\sample\\simple.text");
			Scanner reader=new Scanner(obj);
			while(reader.hasNextLine()) {
			String data=reader.nextLine();
			
			System.out.println(data);
		}}
	catch(FileNotFoundException e) {
		System.out.println("Error occured");
	}
	}

}


