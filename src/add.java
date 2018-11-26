//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.*;
//
////@WebServlet("/hello")
////public class Nana extends HttpServlet
////{
////	public void service(HttpServletRequest request
////			, HttpServletResponse response)
////			throws IOException, ServletException
////	{
////		
////		response.setCharacterEncoding("UTF-8");
////		response.setContentType("text/html; charset=UTF-8"); 
////		
////		//OutputStream os = response.getOutputStream();
////		//PrintStream out = new PrintStream(os,true);
////		
////		//문자 전용 스트림
////		PrintWriter out = response.getWriter();
////		
////		
//////		http://localhost:9000/newlecture/hello?cnt=5
//////		int cnt = Integer.parseInt(request.getParameter("cnt"));
////		
////		
////		String temp_ = request.getParameter("cnt");
////		int cnt = 0;
////		
////		if(temp_!=null&&!temp_.equals(""))
////			cnt = Integer.parseInt(temp_);
////		
////		//int x = 3/0;
////		for (int i = 0; i < cnt; i++) {
////			//내려쓰고 싶으면 뒤에 <br/>
////			
////			//chrome는 알아서 
////			out.println((i+1)+": 안뇽 Servlet!!<br/>");
////	//		this.getClass().getAnnotat
////		}
////	
////	}
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//@WebServlet("/add")
//public class Nana extends HttpServlet
//{
//	
//	
//	/*
//	 서블릿
//	 자바프로그램 + 웹 출력/입력
//	 출력 : response -> 스트맃, 콘텐츠 종류, 인코딩
//	 입력 : 요청할 때 입력 -> 요청GET, POST
//	 GET 
//	 POST
//	 */
//	public void service(HttpServletRequest request
//			, HttpServletResponse response)
//			throws IOException, ServletException
//	{
//		//한글 깨지는거 방지
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8"); 
//		
//		PrintWriter out = response.getWriter();
//		
//		int x = 0;
//		int y = 0;
//		
//		if(request.getMethod().equals("POST")) {
//		
//			String x_ = request.getParameter("x");
//			String y_ = request.getParameter("y");
//					
//			if(x_!=null&&!x_.equals("")) 
//	 			x = Integer.parseInt(x_);		
//			
//			if(y_!=null&&!y_.equals("")) 
//				y = Integer.parseInt(y_);
//			
//		}
//		
//		int sum = x+y;
//
//		/////////////////////////////////////////////////////
//		
//		
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta charset=\"UTF-8\">");
//		out.println("<title>Insert title here</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("	<form action=\"add\" method=\"post\">");
//		out.println("		<table border=\"1\">");
//		out.println("			<tr>");
//		out.println("				<td>안녕하세요를 몇 번 듣고 싶으세요?</td>");
//		out.println("			</tr>");
//		out.println("			<tr>");
//		out.println("				<td>");
//		out.println("					<label>x:</label>");
//		if(x==0)
//			out.println("					<input type=\"text\" name=\"x\" /> ");
//		else
//			out.println("					<input type=\"text\" value=\""+x+"\"name=\"x\" /> ");
//			//out.println("					<input type=\"text\" value=  "+x+"name=\"x\" /> ");
//		
//		out.println("					<hr>");
//		out.println("					<label>y:</label>");
//		
//		if(y==0)
//			out.println("					<input type=\"text\" name=\"y\" /> ");
//		else
//			out.println("					<input type=\"text\" value=\""+y+"\"name=\"y\" />");
//		
//		out.println("					<input type=\"submit\" value=\"입력\"/>");
//		out.println("				</td>");
//		out.println("			</tr>");
//		
//		
//		out.println("			<tr>");
//		out.println("				<td>");
//		out.println("					<label>sum : "+sum+"</label>");
//
//		out.println("				</td>");
//		out.println("			</tr>");
//		
//		
//
//		out.println("		</table>");
//		out.println("	</form>");
//		out.println("</body>");
//		out.println("</html>");
//		
//		
//		
//		/////////////////////////////////////////////////////
//		
//
//	
//	}
//}











//////////////////////////////////////////////////////////////////////////
















import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

//@WebServlet("/hello")
//public class Nana extends HttpServlet
//{
//	public void service(HttpServletRequest request
//			, HttpServletResponse response)
//			throws IOException, ServletException
//	{
//		
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8"); 
//		
//		//OutputStream os = response.getOutputStream();
//		//PrintStream out = new PrintStream(os,true);
//		
//		//문자 전용 스트림
//		PrintWriter out = response.getWriter();
//		
//		
////		http://localhost:9000/newlecture/hello?cnt=5
////		int cnt = Integer.parseInt(request.getParameter("cnt"));
//		
//		
//		String temp_ = request.getParameter("cnt");
//		int cnt = 0;
//		
//		if(temp_!=null&&!temp_.equals(""))
//			cnt = Integer.parseInt(temp_);
//		
//		//int x = 3/0;
//		for (int i = 0; i < cnt; i++) {
//			//내려쓰고 싶으면 뒤에 <br/>
//			
//			//chrome는 알아서 
//			out.println((i+1)+": 안뇽 Servlet!!<br/>");
//	//		this.getClass().getAnnotat
//		}
//	
//	}
//}


















@WebServlet("/add")
public class add extends HttpServlet {
	
	
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 
		
		PrintWriter out = response.getWriter();
		
		int x = 0;
		int y = 0;
		int sum = 0;
		
		String sum_ = request.getParameter("s");
		if(sum_!=null)
				sum = Integer.parseInt(sum_);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("add.jsp");
		request.setAttribute("sum", sum);
		dispatcher.forward(request, response);

		/////////////////////////////////////////////////////
		
		///이와 같은 html코드를
		//jsp파일로 전환하여 jasper를 사용
		//F:\Study\Java\work\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\newlecture\org\apache\jsp
		
//		out.println("<!DOCTYPE html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta charset=\"UTF-8\">");
//		out.println("<title>Insert title here</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("	<form action=\"add\" method=\"post\">");
//		out.println("		<table border=\"1\">");
//		out.println("			<tr>");
//		out.println("				<td>안녕하세요를 몇 번 듣고 싶으세요?</td>");
//		out.println("			</tr>");
//		out.println("			<tr>");
//		out.println("				<td>");
//		out.println("					<label>x:</label>");
//		if(x==0)
//			out.println("					<input type=\"text\" name=\"x\" /> ");
//		else
//			out.println("					<input type=\"text\" value=\""+x+"\"name=\"x\" /> ");
//			//out.println("					<input type=\"text\" value=  "+x+"name=\"x\" /> ");
//		
//		out.println("					<hr>");
//		out.println("					<label>y:</label>");
//		
//		if(y==0)
//			out.println("					<input type=\"text\" name=\"y\" /> ");
//		else
//			out.println("					<input type=\"text\" value=\""+y+"\"name=\"y\" />");
//		
//		out.println("					<input type=\"submit\" value=\"입력\"/>");
//		out.println("				</td>");
//		out.println("			</tr>");
//		
//		
//		out.println("			<tr>");
//		out.println("				<td>");
//		out.println("					<label>sum : "+sum+"</label>");
//
//		out.println("				</td>");
//		out.println("			</tr>");
//		
//		
//
//		out.println("		</table>");
//		out.println("	</form>");
//		out.println("</body>");
//		out.println("</html>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 
		
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		
		int x = 0;
		int y = 0;
		int sum = 0;
		int page;
		
		switch (cmd) {
		case "덧셈":
			
			String x_ = request.getParameter("x");
			String y_ = request.getParameter("y");
					
			if(x_!=null&&!x_.equals("")) 
	 			x = Integer.parseInt(x_);		
			
			if(y_!=null&&!y_.equals("")) 
				y = Integer.parseInt(y_);
			
			sum = x+y;
			
			break;

		case "session":
		{
			String sum1 = request.getParameter("sum");
			HttpSession session = request.getSession();
			session.setAttribute("sum", sum1);
		}
			break;
		case "application":
		{
			String sum1 = request.getParameter("sum");
			ServletContext application = request.getServletContext();
			application.setAttribute("sum", sum1);
		}
			break;
		default:
			break;
		}
		
		
		
		
		
		
		

//		forward 방식
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/add");
//		request.setAttribute("sum", sum);
//		dispatcher.forward(request, response);
		
//		forward의 문제점
//		post 처리 forward -> get이 아닌 post를 요청하게되어 무한루프가 돌게된다.
		
//		Redirect 방식
		response.sendRedirect("add?s="+sum);
//		s=key sum=value
//		값을 못 넘긴다.		
		
		
		
//		현재 서블릿에서 다른 서블릿을 요청하는 방법 두가지.
		
//		Redirect -> 지금까지 처리한 내용과 상관없이 완전히 새로운 서블릿을 요청할 때
//					지금 서블릿과 요청될 서블릿이 공유해야 할 것이 없는 경우
		
//		Forward -> 지금 서블릿이 새로운 서블릿에게 지금까지 처리한 것을 넘겨주면서 이어가야 할때
		
		
		
			
		

	}

	
}





