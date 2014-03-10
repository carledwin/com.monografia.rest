package com.monografia.rest.constructor;

import java.sql.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import org.codehaus.jettison.json.JSONArray;
import com.monografia.rest.dao.*;
import com.monografia.rest.util.*;

@Path("/db/constructor/*")
public class ConstructorMySQL {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllClientes()throws Exception{
		
		PreparedStatement query = null;
		Connection conn = null;
		String resultString = null;
		
		try {
		
			conn = MysqlMonografia.mySQLMonografiaConnection().getConnection();
			query = conn.prepareStatement("select * from tb_cliente");
			
			ResultSet rs = query.executeQuery();
			
			MediaJSON converterForJSON = new MediaJSON();
			JSONArray jsonArray = new JSONArray();
			
			jsonArray = converterForJSON.mediaJSONArray(rs);
			query.close();
			
			resultString = jsonArray.toString();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(conn != null) conn.close();
		}
		return resultString;
	}
}
