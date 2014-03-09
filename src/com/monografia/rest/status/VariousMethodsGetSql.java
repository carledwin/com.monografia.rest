package com.monografia.rest.status;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.sql.*;
import com.monografia.rest.dao.*;


@Path("/mysql/variousMethodsGetSql")
public class VariousMethodsGetSql {

	@Path("/databaseMySQL")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnDatabaseMySQL()throws Exception{
		PreparedStatement query = null;
		String stringTIME = null;
		String returnDataSource = null;
		Connection conn = null;
		
		try {
			
			conn = MysqlMonografia.mySQLMonografiaConnection().getConnection();
			query = conn.prepareStatement("SELECT CURRENT_TIMESTAMP() TIMESTAMP");
			ResultSet rs = query.executeQuery();
			
			while(rs.next()){
				stringTIME = rs.getString("TIMESTAMP");
			}
			
			query.close();
			
			returnDataSource = "<p>Hora certa do Banco de Dados MySQL: <br /><b>" +stringTIME+ "</b></p>";
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn != null)conn.close();
		}
		return returnDataSource;
	}
	
}
