package com.mss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PurchseOrders {
	public static String purchases(String i_name,Long i_cost){
		return "sucess";
		 /*Connection con = null;
	        
         String url = "jdbc:mysql://localhost:3306/miracle";
         try {
				Class.forName("com.mysql.jdbc.Driver");
			
         	con = DriverManager.getConnection(url, "root", "root");
			 
         Statement st = con.createStatement();

       //  ResultSet resultSet = st.executeQuery("SELECT NAME, SALARY FROM eaiuser1.Emp WHERE ID ="+id);
         int i=st.executeUpdate("insert into purchase values('"+i_name+ "','"+i_cost+"')");
	if(i==1)
	return "success";
	else
		return "false";
	}
         catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//l
catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
         return "false";	
}*/


}
}