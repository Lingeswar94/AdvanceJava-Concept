package DBConnection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		JSONObject jsonObject=new JSONObject();
		jsonObject.put("Name", "Lingeswar");
		jsonObject.put("Age", "27");
		jsonObject.put("Status", "Married");
		
		JSONArray array=new JSONArray();
		array.add("Simple Thing");
		array.add("Yes can you");
		
		jsonObject.put("Quote", array);
		
		FileWriter fileWriter=new FileWriter("Usingwriter.json");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(jsonObject.toJSONString());
		bufferedWriter.close(); 
		
		
		
	}

}
