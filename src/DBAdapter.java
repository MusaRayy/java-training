package com.myapps35.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JOptionPane;

public class DBAdapter 
{
	ResultSet rs ;
	Connection con;
	Statement stmt;
	PreparedStatement pst;
	

	public void insertData(String fname,String lname,String email,String address,String password)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost/facebook?user=root&password=");
			String sql = "Insert Into users (firstname,lastname,email,address,password) Values ('"+fname+"','"+lname+"','"+email+"','"+address+"','"+password+"')";
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "new account created successfully","Success",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e,"Error",JOptionPane.INFORMATION_MESSAGE);
			}
	}
	
	public boolean checkLogin(String uname,String pswd)
	{
		try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/udemy","root","");
            PreparedStatement pst=con.prepareStatement("select * from users where email=? and password=?");
            pst.setString(1, uname); //t
            pst.setString(2, pswd);
            //executes the prepared statement
            rs=pst.executeQuery();
            if(rs.next())
            {
                //TRUE iff the query founds any corresponding data
                return true;
            }
            else
            {
                return false;
            }
             
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
		return false;
	}
	
	public void getAllData()
	{
		try{
			if(rs == null)
			{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				con= DriverManager.getConnection("jdbc:mysql://localhost/udemy?user=root&password=");
				String sql = "Select * from tablename";
				stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = stmt.executeQuery(sql);
			}
			if(rs.next() && !rs.isAfterLast())//After Last was giving invalid cursor state error
			{
				try{
					String id       = (rs.getString("id"));
					String fname    = (rs.getString("firstname"));
					String lname    = (rs.getString("lastname"));
					String email    = (rs.getString("email"));
					String address  = (rs.getString("address"));
					String password = (rs.getString("password"));
				}catch(SQLException e){JOptionPane.showMessageDialog(null, e,"Error",JOptionPane.INFORMATION_MESSAGE);}
			}
		}
		catch(Exception e){e.printStackTrace();}
	}
	
	
	private void updateData(String id,String fname,String lname,String email,String address,String password)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con= DriverManager.getConnection("jdbc:mysql://localhost/udemy?user=root&password=");
			String sql = "Update users Set firstname='"+fname+"',lastname='"+lname+"',email='"+email+"',address='"+address+"',password='"+password+"' Where id='"+id+"'";
			stmt= con.createStatement();
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Can't update your details now try...", "Error", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	private void deleteData(String id)
	{
		Connection con;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con= DriverManager.getConnection("jdbc:mysql://localhost/udemy?user=root&password=");
			String sql = "delete from users where id = '"+id+"'";
			stmt= con.createStatement();
			stmt.execute(sql);
			JOptionPane.showMessageDialog(null, "Data Deleted successfully","Success",JOptionPane.INFORMATION_MESSAGE);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Data can't be delete!","Error",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
}