package DBConnection;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFilewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String location="UsingFilewriter.txt";
		String content="Learning Selenium and Java";
		
		FileWriter fileWriter=new FileWriter(location);
		fileWriter.write(content);
		fileWriter.close();
	}

}
