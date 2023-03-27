package DBConnection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileoutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		String location="UsingFOS.txt";
		String content="learning Java Using FOS";
		
		FileOutputStream fileOutputStream= new  FileOutputStream(location);
		byte[]bs=content.getBytes();
		fileOutputStream.write(bs);
		fileOutputStream.close();
	}

}
