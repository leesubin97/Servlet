package way;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WayServlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//한글깨지려면 세팅꼭
				//포스트에서 할려면
				req.setCharacterEncoding("utf-8");
						
				
				
				String name = req.getParameter("name");
				String age = req.getParameter("age");
				String uniS = req.getParameter("uniS");
				String favor[] = req.getParameterValues("favor");
				
				resp.setContentType("text/html; charset=utf-8");
				
				PrintWriter pw = resp.getWriter();
				
				pw.println("<html>");
				pw.println("<head>");
					pw.println("<title>제목</title>");
				pw.println("</head>");
				
				pw.println("<body>");
				
				pw.println("<p>이름:" + name + "</p>");
				pw.println("<p>연령대:" + age + "</p>");
				
				
				
				
				pw.println("<p>성별:" + uniS + "</p>");
				
				String favor1="";
				
				if(favor != null) {
					for (int i = 0; i < favor.length; i++) {
						favor1 += favor[i] + "  ";
						
						
					}
					}
				
				pw.println("<p>취미:" + favor1 + "</p>");
				//데이터 전송 구간.
				//favor는 배열로 작성.
				pw.println("<a href='data2?name=" +name +"&age=" + age +
						"&uniS=" + uniS + "&favor=" + favor1+"'>데이터전송</a>");
				/*
				//favor값 받기위해 for문 작성.
				if(favor != null) {
				for (int i = 0; i < favor.length; i++) {
					
					pw.println(favor[i]);
				}
				}
				// a태그 닫아주기
				pw.println("'>데이터전송</a>");
				*/
				//sample에 name, sage변수를 가져간다.
				pw.println("</body>");
				
				
				
				pw.println("</html>");
				pw.close();
				
	}
	
}
