package restAssured;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class thirdtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //First case
		String a= "[1,2,3]";
		JsonPath jsonpath = new JsonPath(a);
		List<Integer> i= new ArrayList<Integer>();
		i=jsonpath.get();
		System.out.println(i.get(0));
		//Second case
		// Sample JSON's taken from https://opensource.adobe.com/Spry/samples/data_region/JSONDataSetSample.html#Example1
		String b="{\r\n" + 
				"	\"id\": \"0001\",\r\n" + 
				"	\"type\": \"donut\",\r\n" + 
				"	\"name\": \"Cake\",\r\n" + 
				"	\"ppu\": 0.55,\r\n" + 
				"	\"batters\":\r\n" + 
				"		{\r\n" + 
				"			\"batter\":\r\n" + 
				"				[\r\n" + 
				"					{ \"id\": \"1001\", \"type\": \"Regular\" },\r\n" + 
				"					{ \"id\": \"1002\", \"type\": \"Chocolate\" },\r\n" + 
				"					{ \"id\": \"1003\", \"type\": \"Blueberry\" },\r\n" + 
				"					{ \"id\": \"1004\", \"type\": \"Devil's Food\" }\r\n" + 
				"				]\r\n" + 
				"		},\r\n" + 
				"	\"topping\":\r\n" + 
				"		[\r\n" + 
				"			{ \"id\": \"5001\", \"type\": \"None\" },\r\n" + 
				"			{ \"id\": \"5002\", \"type\": \"Glazed\" },\r\n" + 
				"			{ \"id\": \"5005\", \"type\": \"Sugar\" },\r\n" + 
				"			{ \"id\": \"5007\", \"type\": \"Powdered Sugar\" },\r\n" + 
				"			{ \"id\": \"5006\", \"type\": \"Chocolate with Sprinkles\" },\r\n" + 
				"			{ \"id\": \"5003\", \"type\": \"Chocolate\" },\r\n" + 
				"			{ \"id\": \"5004\", \"type\": \"Maple\" }\r\n" + 
				"		]\r\n" + 
				"}";
		JsonPath jsonpath1 = new JsonPath(b);
		List<HashMap<String,String>> l=null;
		l=jsonpath1.get("batters.batter.id");
		System.out.println(l.get(3));
		//Third case
		String c="{\r\n" + 
				"	\"id\": \"0001\",\r\n" + 
				"	\"type\": \"donut\",\r\n" + 
				"	\"name\": \"Cake\",\r\n" + 
				"	\"image\":\r\n" + 
				"		{\r\n" + 
				"			\"url\": \"images/0001.jpg\",\r\n" + 
				"			\"width\": 200,\r\n" + 
				"			\"height\": 200\r\n" + 
				"		},\r\n" + 
				"	\"thumbnail\":\r\n" + 
				"		{\r\n" + 
				"			\"url\": \"images/thumbnails/0001.jpg\",\r\n" + 
				"			\"width\": 32,\r\n" + 
				"			\"height\": 32\r\n" + 
				"		}\r\n" + 
				"}";
		JsonPath jsonpath2 =new JsonPath(c);
		String test= jsonpath2.getString("image.url");
		System.out.println(test);
	
	}

}
