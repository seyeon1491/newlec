import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/cal")
public class cal extends HttpServlet {

	
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 
		
		PrintWriter out = response.getWriter();
		
		int num = 0;
		
		String num_ = request.getParameter("s");
		
		


		RequestDispatcher dispatcher = request.getRequestDispatcher("cal.jsp");
		request.setAttribute("num", num_);
		dispatcher.forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); 
		
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String cmd = request.getParameter("cmd");
		String num_ = request.getParameter("s");	
		
		String num="";
			
		switch (cmd) {
			
			case "0":		
				num = num_+cmd;
				break;
		
			case "1":		
				num = num_+cmd;
				break;
				
			case "2":		
				num = num_+cmd;
				break;
				
			case "3":		
				num = num_+cmd;
				break;
				
			case "4":		
				num = num_+cmd;
				break;
				
			case "5":		
				num = num_+cmd;
				break;
				
			case "6":		
				num = num_+cmd;
				break;
				
			case "7":		
				num = num_+cmd;
				break;
				
			case "8":		
				num = num_+cmd;
				break;
				
			case "9":		
				num = num_+cmd;
				break;
				
				
				
				
			case "+":
				num = num_+cmd;
				break;
				
			case "-":		
				num = num_+cmd;
				break;
				
			case "*":		
				num = num_+cmd;
				break;
				
			case "/":		
				num = num_+cmd;
				break;
				
			case "C":		
				num = "";
				break;
				
			case "Del":		
				num = Integer.parseInt(num_.substring(0,num_.length()-1))+"";
				break;
				
			
			
				
			case "=":		
					
				if(num_.contains("+"))	{
					String [] a = num_.split("[+]");
					num = (Integer.parseInt(a[0]) + Integer.parseInt(a[1]))+"";
					break;
				}
				else if(num_.contains("-"))	{
					String [] a = num_.split("[-]");
					num = (Integer.parseInt(a[0]) - Integer.parseInt(a[1]))+"";
					break;
				}
				else if(num_.contains("*"))	{
					String [] a = num_.split("[*]");
					num = (Integer.parseInt(a[0]) * Integer.parseInt(a[1]))+"";
					break;
				}

				else if(num_.contains("/"))	{
					String [] a = num_.split("[/]");
					num = (Integer.parseInt(a[0]) / Integer.parseInt(a[1]))+"";
					break;
				}
		}
		

		//response.sendRedirect("cal?s="+num);
		RequestDispatcher dispatcher = request.getRequestDispatcher("cal.jsp");
		request.setAttribute("num", num);

		dispatcher.forward(request, response);
	

	}


	
}
