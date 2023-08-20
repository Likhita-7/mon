package com.pack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	Connection con;
	public Connect() {
	}

	Connection meth() throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		 con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1810");
		 return con;
	}
	
	
}
