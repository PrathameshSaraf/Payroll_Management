/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;
/**
 *
 * @author Prathamesh Saraf
 */
public class MyConnection {
    public static Connection getconnection(){
       Connection con=null;
       try
      {
       Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver is registered");
	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "prathamesh","Prathamesh8624@");
	if(con.isClosed())
			{
				System.out.println("connection closed ");
			}
			else
			{
				System.out.println("Connection created ");
			}
       
}catch(Exception e){
    System.out.println(e.getMessage());
}
        return con;
    
}
public static void main(String arg[])
	{
		new MyConnection();
	
}}