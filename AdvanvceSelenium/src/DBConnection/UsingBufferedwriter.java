package DBConnection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class UsingBufferedwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	String location="UsingBufferedwriter.txt";
	String content="Learning Java using buffered ";
	
	FileWriter fileWriter=new FileWriter(location);	
	
	BufferedWriter bufferedReader= new BufferedWriter(fileWriter);
	bufferedReader.write(content);
	bufferedReader.close();
	
	}

}
