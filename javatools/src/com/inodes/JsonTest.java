package com.inodes;

import java.sql.Timestamp;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		String jsonStr = "{\"attr\":[{\"number\":123,\"status\":\"yiji\"},{\"number\":123456,\"status\":\"yiji\"}]}";
		//String jsonStr = "{\"attr\":\"yilian\"}";
		try {
			JSONObject jsonObj = new JSONObject(jsonStr);
			//System.out.println(jsonObj);
			//JSONArray jsonArray = jsonObj.getJSONArray("attr");
			//System.out.println(jsonArray);
			//JSONObject newJson = jsonArray.getJSONObject(0);
			//System.out.println(newJson);
			//System.out.println(newJson.get("number"));
			System.out.println(Timestamp.valueOf("2017-01-01 00:00:01").getTime());
			System.out.println(new Timestamp(1483200001000L));
			Iterator keys = jsonObj.keys();
			while(keys.hasNext()){
				String key = (String) keys.next();
				JSONArray jsonArr = jsonObj.getJSONArray(key);
				for (int i = 0; i < jsonArr.length(); i++) {
					JSONObject storeObj = jsonArr.getJSONObject(i);
					String storeNum = storeObj.getString("number");
					System.out.println(storeNum);
				}
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
