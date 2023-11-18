package com.sai;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Userdao {
	//insert data into database
		public int bookregi(String bookisbn,String bookname,String bookauthor,String bookprice)  {
			
			Connection connection=DatabaseUtils.createConnection();
			 int result=0;
			try {
				PreparedStatement preparedStatement=connection.prepareStatement("insert into bookdet values(?,?,?,?)");
				
				preparedStatement.setString(1,bookisbn);
				preparedStatement.setString(2,bookname);
				preparedStatement.setString(3,bookauthor);
				preparedStatement.setString(4,bookprice);
	     result=preparedStatement.executeUpdate();

			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			return result;		
		}
		
		// search operation
		
		public Bookinfo searchbybookisbn(String bookisbn) {
			
			Connection connection=DatabaseUtils.createConnection();
			Bookinfo Bookinfo=null;
			try {
				PreparedStatement preparedStatement=connection.prepareStatement("select * from bookdet where bookisbn=? ");		
				
				preparedStatement.setString(1, bookisbn);	
				ResultSet resultSet	=preparedStatement.executeQuery();
				resultSet.next();
				
					
				
				Bookinfo=new Bookinfo();
				Bookinfo.setBookisbn(resultSet.getString(1));
				Bookinfo.setBookname(resultSet.getString(2));
				Bookinfo.setBookauthor(resultSet.getString(3));
				Bookinfo.setBookprice(resultSet.getString(4));
			
			}
			
			catch (SQLException e) {
				e.printStackTrace();
			}
			return Bookinfo;
		}
		

		//Delete data from database
		
		public int bookdelete(String bookisbn) {
			Connection connection=DatabaseUtils.createConnection();
			int result=0;
			try {
				
				PreparedStatement preparedStatement=connection.prepareStatement("delete from bookdet where bookisbn=?");
				preparedStatement.setString(1, bookisbn);
				result=preparedStatement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return result;
}
}
