package rail_likhita;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Ser {
	Connection con;
	ResultSet rs;
	public void meth() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1810");
		System.out.println("connection created");
		
	}
	public JSONArray meth1() throws SQLException, JSONException {
		PreparedStatement st=con.prepareStatement("select trn_start from train_data");
		rs=st.executeQuery();
		System.out.println(rs);
		JSONArray js=new JSONArray();
		
		while(rs.next()) {
			JSONObject ob=new JSONObject();
			ob.put("st", rs.getString(1));
			js.put(ob);
			
		}
		return js;
		
		}
}

