package fileediting;
import java.io.File;
public class Deletefile {
	public static void main(String[]args) {
			File obj=new File("C:\\Users\\Admin\\Documents\\sample\\simple.text");
			if(obj.delete()) {
				System.out.println("File Deleted");
			}else {
				System.out.println("error");	
				
			}	
		}

}
