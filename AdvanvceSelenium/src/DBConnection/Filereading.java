package DBConnection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			String location = "UsingBufferedwriter.txt";

			FileReader fileReader = new FileReader(location);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while ((line=bufferedReader.readLine())!= null) {
				System.out.println(line);
			}
		} 
}
