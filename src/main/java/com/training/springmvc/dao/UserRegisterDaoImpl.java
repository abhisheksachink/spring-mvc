package com.training.springmvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.training.springmvc.model.User;
@Repository
public class UserRegisterDaoImpl implements UserRegisterDao{
	public List<User> setUsers(String userN,String pasw){
		List<User> userList = new ArrayList<>();
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "india@123";
	        con = DriverManager.getConnection(url,user,pass);
	        PreparedStatement ps=con.prepareStatement(  
                    "insert into user(username,passsword) values (?,?)");  
        
       ps.setString(1,userN);
       ps.setString(2,pasw);
       ps.executeUpdate();  
	          	
	        	
	        }
	       
		
	        catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return userList;

	}
}
