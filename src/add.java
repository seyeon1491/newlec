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
////		//���� ���� ��Ʈ��
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
////			//�������� ������ �ڿ� <br/>
////			
////			//chrome�� �˾Ƽ� 
////			out.println((i+1)+": �ȴ� Servlet!!<br/>");
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
//	 ����
//	 �ڹ����α׷� + �� ���/�Է�
//	 ��� : response -> ��Ʈ��, ������ ����, ���ڵ�
//	 �Է� : ��û�� �� �Է� -> ��ûGET, POST
//	 GET 
//	 POST
//	 */
//	public void service(HttpServletRequest request
//			, HttpServletResponse response)
//			throws IOException, ServletException
//	{
//		//�ѱ� �����°� ����
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
//		out.println("				<td>�ȳ��ϼ��並 �� �� ��� ��������?</td>");
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
//		out.println("					<input type=\"submit\" value=\"�Է�\"/>");
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
//		//���� ���� ��Ʈ��
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
//			//�������� ������ �ڿ� <br/>
//			
//			//chrome�� �˾Ƽ� 
//			out.println((i+1)+": �ȴ� Servlet!!<br/>");
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
		
		///�̿� ���� html�ڵ带
		//jsp���Ϸ� ��ȯ�Ͽ� jasper�� ���
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
//		out.println("				<td>�ȳ��ϼ��並 �� �� ��� ��������?</td>");
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
//		out.println("					<input type=\"submit\" value=\"�Է�\"/>");
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
		case "����":
			
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
		
		
		
		
		
		
		

//		forward ���
		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/add");
//		request.setAttribute("sum", sum);
//		dispatcher.forward(request, response);
		
//		forward�� ������
//		post ó�� forward -> get�� �ƴ� post�� ��û�ϰԵǾ� ���ѷ����� ���Եȴ�.
		
//		Redirect ���
		response.sendRedirect("add?s="+sum);
//		s=key sum=value
//		���� �� �ѱ��.		
		
		
		
//		���� �������� �ٸ� ������ ��û�ϴ� ��� �ΰ���.
		
//		Redirect -> ���ݱ��� ó���� ����� ������� ������ ���ο� ������ ��û�� ��
//					���� ������ ��û�� ������ �����ؾ� �� ���� ���� ���
		
//		Forward -> ���� ������ ���ο� �������� ���ݱ��� ó���� ���� �Ѱ��ָ鼭 �̾�� �Ҷ�
		
		
		
			
		

	}

	
}





