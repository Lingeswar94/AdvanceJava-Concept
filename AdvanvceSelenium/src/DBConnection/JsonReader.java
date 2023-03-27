package DBConnection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		
		JSONParser jsonParser = new JSONParser();

		FileReader fileReader = new FileReader("Usingwriter.json");
		Object object = jsonParser.parse(fileReader);

		JSONObject jsonObject = (JSONObject) object;
		String name = (String) jsonObject.get("Name");
		Object age = jsonObject.get("Age");
		JSONArray array = (JSONArray) jsonObject.get("Quote");
		Iterator iterator = array.iterator();
		System.out.println(name);
		System.out.println(age);
		do {
			System.out.println(iterator.next());
		}
		while(iterator.hasNext()); 
			
		}
	}

