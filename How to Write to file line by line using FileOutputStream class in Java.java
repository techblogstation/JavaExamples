// Java Program for Write to file line by line using FileOutputStream class

import java.io.File;
import java.io.FileOutputStream;

public class ExampleJavaFileWrite {

	public static void main(String[] args) {

//Declaring reference of File class
		File file = null;

//Declaring reference of FileOutputStream class
		FileOutputStream fileOutStream = null;

		String data = "TechBlogStation";

		try {
			file = new File("D:/TBS/file.txt");

//Creating Object of FileOutputStream class
			fileOutStream = new FileOutputStream(file);

//In case file does not exists, Create the file
			if (!file.exists()) {
				file.createNewFile();
			}

//fetching the bytes from data String
			byte[] b = data.getBytes();

//Writing to the file
			fileOutStream.write(b);

//Flushing the stream
			fileOutStream.flush();

//Closing the stream
			fileOutStream.close();

			System.out.println("File writing done.");

		}
//Handing Exception
		catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutStream != null) {
					fileOutStream.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
