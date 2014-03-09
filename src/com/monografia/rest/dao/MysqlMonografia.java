package com.monografia.rest.dao;

import javax.naming.*;
import javax.sql.*; 

public class MysqlMonografia {

	private static DataSource dsMysqlMonografia = null;
	
	private static Context context = null;
	
	public static DataSource mySQLMonografiaConnection() throws Exception{
		
		
		 if(dsMysqlMonografia != null){
			 return dsMysqlMonografia;
		 }
		
		
		try {
			
			if(context == null){
				context = new InitialContext();
			}
			
			//dsMysqlMonografia = (DataSource) context.lookup("monografiadb");
			
			dsMysqlMonografia = (DataSource) context.lookup("jndiMonografia");
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		return dsMysqlMonografia;
	}
}
