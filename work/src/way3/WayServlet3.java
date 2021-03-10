package way3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dto.searchDto;

public class WayServlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
			pw.println("<title>제목</title>");
		pw.println("</head>");
		
		pw.println("<body>");
		pw.println("<h3>data3 Servlet</h3>");
		
		searchDto result = (searchDto)req.getAttribute("result");
		//저장한 mem 객체를 짐싼걸 풀어온다.
		
		pw.println("<p>이름:" + result.getName() + "</p>");
		pw.println("<p>연령대:" + result.getAge() + "</p>");
		pw.println("<p>성별:" + result.getUniS() + "</p>");
		pw.println("<p>취미:" + result.getFavor() + "</p>");
		
		
		
		
		/*
		 * pw.println("<h3>World Servlet</h3>");
		 * 
		 * 
		 * String name = req.getParameter("name"); String age = req.getParameter("age");
		 * 
		 * 
		 * pw.println("<p>name:" + name + "</p>");
		 * pw.println("age : <input type = 'text	' value = " + age +"><br>");
		 */
		pw.println("</body>");
		
		
		
		pw.println("</html>");
		pw.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
}
