/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opac;
import java.sql.*;
/**
 *
 * @author MudPoet
 */
public class connection {
    
    // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/oop";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "1234";
	   
	    Connection conn=null;
	    Statement stmt=null;
	    ResultSet rs=null;
	    PreparedStatement ps=null;
	    
	    public connection(){
	    	open();
	    }
	    
	   public void open()
		{
			try
			{
				//STEP 2: Register JDBC driver
	            Class.forName("com.mysql.jdbc.Driver");

	            //STEP 3: Open a connection
	            // System.out.println("Connecting to database...");
	            conn = DriverManager.getConnection(DB_URL,USER,PASS);	            
	            stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
	            
	            
	            
	            
	            
	           
	        	String sql = "Select * from register";

	        	rs = stmt.executeQuery(sql);


	        	while (rs.next()) {

	        	String fname = rs.getString("adminFULLNAME");
	        	String lname = rs.getString("adminCOURSE");

	        System.out.println(fname + "   " + lname + " ");

	        }
	}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
			   
		public void close()
		{
			
			 try{	            
		            //STEP 6: Clean-up environment
				 	ps.close();
		            rs.close();
		            stmt.close();
		            conn.close();
		         }catch(SQLException se){
		            //Handle errors for JDBC
		            se.printStackTrace();
		         }catch(Exception e){
		            //Handle errors for Class.forName
		            e.printStackTrace();
		         }finally{
		            //finally block used to close resources
		            try{
		               if(stmt!=null)
		                  stmt.close();
		            }catch(SQLException se2){
		            }// nothing we can do
		            try{
		               if(conn!=null)
		                  conn.close();
		            }catch(SQLException se){
		               se.printStackTrace();
		            }//end finally try
		         }//end try 
		}

			public static void main(String[] args){
				new connection();
                                
				
			}
}
