package fileediting;
import java.io.File;
import java.io.IOException;
public class Createfile {
	public static void main(String[]args) {
		try {
			File obj=new File("C:\\Users\\Admin\\Documents\\sample\\simple.text");
			if(obj.createNewFile()) {
				System.out.println("new fie created:"+obj.getName());
			}else {
				System.out.println("file already complete");	
			}	
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}

}

