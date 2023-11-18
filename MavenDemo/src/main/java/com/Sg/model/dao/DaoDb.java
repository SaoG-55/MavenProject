package com.Sg.model.dao;

import com.Sg.model.data.ModelClass;
import java.sql.*;
public class DaoDb
{
	//to fetch data from db we use Dao layer
	public ModelClass getdata(int uid) 
	{
		ModelClass md=new ModelClass();
//		md.setUid(uid);
//		md.setUname("sar");
//		md.setPswd("1234");
//		md.setUemail("sarsao5@gmail.com");
		String url="jdbc:mysql://localhost:3306//datastores";
		String username="root";
		String password="1234";
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url,username,password);
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from datacentre where id="+uid);
			if(rs.next())
			{
				md.setUid(rs.getInt("id"));
				md.setUname(rs.getString("uname"));
				md.setPswd(rs.getString("upswd"));
				md.setUemail(rs.getString("uemail"));
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return md;
		
		
		
	}
	
	
}
