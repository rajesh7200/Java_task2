package pgm_task2;

import java.io.File;

public class FileHandeling {

	public static void main(String[] args) {
		File f1=new File("D:/FileHandlingTopic");
		if(f1.mkdir())
		{
			System.out.println("Folder is created!!!...");
		}
		else {
			System.out.println("Folder is not created!!!!....");
		}
	}

}

