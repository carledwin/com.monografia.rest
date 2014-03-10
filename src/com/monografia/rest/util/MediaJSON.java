package com.monografia.rest.util;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import java.sql.ResultSet;

public class MediaJSON {

	public JSONArray mediaJSONArray(ResultSet rs) throws Exception{
		
		JSONArray json = new JSONArray();
		
		try {
			
			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
			
			while(rs.next()){
				
				int columns = rsmd.getColumnCount();
				
				JSONObject objJson = new JSONObject();
				
				for (int i = 0; i < columns+1; i++) {
					
					String nm_column = rsmd.getCatalogName(i);
					
					if(rsmd.getColumnType(i) == java.sql.Types.ARRAY){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM ARRAY");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.BIGINT){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM BIGINT");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.BOOLEAN){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM BOOLEAN");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.DOUBLE){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM DOUBLE");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.FLOAT){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM FLOAT");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.INTEGER){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM INTEGER");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.NVARCHAR){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM NVARCHAR");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.VARCHAR){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM VARCHAR");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.TINYINT){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM TINYINT");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.SMALLINT){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM SMALLINT");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.DATE){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM DATE");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.TIMESTAMP){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM TIMESTAMP");
					}
					else if(rsmd.getColumnType(i) == java.sql.Types.NUMERIC){
						objJson.put(nm_column, rs.getArray(nm_column));
						System.out.println("MediaJSON COM NUMERIC");
					}
					else{
						objJson.put(nm_column, rs.getObject(nm_column));
						System.out.println("MediaJSON COM OBJECT : " + nm_column);
					}
				}
				
				json.put(objJson);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	return json;	
	}
	
}
