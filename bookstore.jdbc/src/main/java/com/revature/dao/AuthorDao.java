package com.revature.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.pojos.Author;
import com.revature.pojos.Genre;
import com.revature.util.ConnectionFactory;

public class AuthorDao implements DAO<Author, Integer> {

	@Override
	public List findAll() {
		
		List<Author> author = new ArrayList<>();
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection()) {
			
			String query ="select * from bn_author";
			
			//STATEMENT INTERFACE - implementation exposed via connection
			Statement statement =  conn.createStatement();
			
			//ResultSet Interface - represents the result set of a DB query
			ResultSet rs =  statement.executeQuery(query);
			
			//return false when there are no more rows in result set
			
			while(rs.next()) {
				Author temp = new Author();
				temp.setAuthor_id(rs.getInt(1));
				temp.setFirst_name(rs.getString(2));
				temp.setLast_name(rs.getString(3));
				temp.setBio(rs.getString(4));
		
				author.add(temp);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return author;
	}

	@Override
	public Author findById(Integer id) {
		
		Author a = null;
		try(Connection conn = ConnectionFactory.getInstance().getConnection()) {
			
			String sql = "select * from bn_author where author_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				a = new Author();
				a.setFirst_name(rs.getString(2));
				
				a.setLast_name(rs.getString(3));

			}
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return a;
	}




	@Override
	public Author save(Author obj) {
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection()) {
			
			conn.setAutoCommit(false);
			
			String sql = "insert into bn_author(first_name, last_name, bio) values(?,?,?)";
			String[] keyNames = {"Author_Id"};
			
			PreparedStatement ps = conn.prepareStatement(sql, keyNames);
			
			ps.setString(1, obj.getFirst_name());
			ps.setString(2, obj.getLast_name());
			ps.setString(3, obj.getBio());
			
			int numRows = ps.executeUpdate();
			
			if(numRows > 0) {
				ResultSet pk = ps.getGeneratedKeys();
				while(pk.next()) {
					obj.setAuthor_id(pk.getInt(1));
				}
				conn.commit();
			}
			
		}catch(SQLException e) {
			
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Author update(Author obj) {
//		try(Connection conn = ConnectionFactory.getInstance().getConnection()) {
//			conn.setAutoCommit(false);
//			
//			String sql = "update bn_author set first_name = '?' where last_name = '?'";
//		} catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return null;
		
		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			
			String sql = "update bn_book set title = ?, price = ? where book_id = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, obj.getTitle());
			ps.setDouble(2, obj.getPrice());
			ps.setInt(3, obj.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void delete(Author obj) {
		// TODO Auto-generated method stub
		
	}

	
	

}
