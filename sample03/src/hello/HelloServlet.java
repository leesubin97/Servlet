package hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("HelloServlet doGet");
		//http 주소에 값이 넘겨져서 나온다 파라미터가 보인다
		//get 공개를 해도되는 방식
		
		/*
		 		 servlet - > java(html)
		 		 JSP -> html(java)
		 */
		
		//html 에서 데이터를 받아보자
		String name = req.getParameter("name");
		System.out.println("name :" + name);
		
		//html code 데이터를 html로 날려준다
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html>");
		pw.println("<head>");
			pw.println("<title>제목</title>");
		pw.println("</head>");
		
		pw.println("<body>");
		
			pw.println("<h3>HelloServlet</h3>");
			pw.println("<p>name:"+ name + "</p>");
			
		
		pw.println("</body>");
		
		
		
		pw.println("</html>");
		pw.close();
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println("HelloServlet doPost");
		//http 주소에 값이 뜨지 않는다(input한값) 파라미터가 안보인다
		//post 공개 안하는 방식 더 무겁다
	}

}
