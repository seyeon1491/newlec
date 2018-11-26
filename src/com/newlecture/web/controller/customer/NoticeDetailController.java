package com.newlecture.web.controller.customer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newlecture.web.entity.Notice;

@WebServlet("/customer/notice/detail")
public class NoticeDetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id = Integer.parseInt(request.getParameter("id"));

		String sql = "select * from notice where id='"+id+"'";

		try {
			String url =  "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,"c##sist","dclass"); 
			Statement st = con.createStatement();  
			 
			ResultSet rs =st.executeQuery(sql);  
	
			rs.next();
	
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writerId = rs.getString("writer_id");
			
			Notice n = new Notice(
	    			rs.getInt("id"),
	    			rs.getString("title"),
	    			rs.getString("content"),
	    			rs.getString("writer_id"),
	    			rs.getDate("regDate"),
	    			rs.getInt("hit")
	    			);
			
	
			rs.close();
			st.close();
			con.close();
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/customer/notice/detail.jsp");
//			request.setAttribute("title", title);
//			request.setAttribute("content", content);
//			request.setAttribute("writerId", writerId);
			request.setAttribute("n", n);
		
			dispatcher.forward(request, response);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
