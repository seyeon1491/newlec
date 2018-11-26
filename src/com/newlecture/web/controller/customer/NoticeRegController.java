package com.newlecture.web.controller.customer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/customer/notice/reg")
//jsp에서 <form action="" method="post" enctype="multipart/form-data"> 으로해서 데이터를 받을수 있게하는 서블릿
@MultipartConfig(
		fileSizeThreshold = 1024*1024, // 
		maxFileSize = 1024*1024*10,     //10메가
		maxRequestSize = 1024*1024*10*5 //10메가 5개까지
		)
	
public class NoticeRegController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/customer/notice/reg.jsp");
		dispatcher.forward(request, response);
	}	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//한글 읽어오기
		request.setCharacterEncoding("UTF-8");
		
		String path = request.getServletContext().getRealPath("/upload");
		System.out.println(path);
		
//		String filePath = path + "\\aa.jpg";
		String filePath = path + File.separator +"aa.jpg";
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		//파일 전송
		Part part = request.getPart("file");
		InputStream fis = part.getInputStream();
		//OutputStream fos = new FileOutputStream("F:/aa.jpg");
		OutputStream fos = new FileOutputStream(filePath);
		
		byte[] buf = new byte[1024];
 	
		
 //		while(true) {
 //			int size = fis.read(buf);    // 1024 1024 ... 읽어오다 다읽으면 -1 -1 반복
 //			if(size==-1)
 //				break;
 //			fos.write(buf, 0, size); //0번째 부터 size만큼
 			
 //		}
		
		int size = 1024;    // 1024 1024 ... 읽어오다 다읽으면 -1 -1 반복
		
		while((size = fis.read(buf))>=0) 
 			fos.write(buf, 0, size); //0번째 부터 size만큼
		
		fos.flush();
		fos.close();
 		

		System.out.println(title);

		String sql = "insert into notice(id, title, writer_id, content) values(notice_seq.nextval, ?,?,?)";
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "c##sist", "dclass");
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, title);
			st.setString(2, "newlec");
			st.setString(3, content);
	
			//ResultSet rs = st.executeQuery();
			int affected = st.executeUpdate();
			response.sendRedirect("list");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}


