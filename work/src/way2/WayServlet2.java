package way2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.searchDto;



public class WayServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//System.out.println("SampleServlet doGet");
				//java
				//다시받음
				String name = req.getParameter("name");
				String age = req.getParameter("age");
				String uniS = req.getParameter("uniS");
				String favor = req.getParameter("favor");
				
				System.out.println(name);
				System.out.println(age);
				System.out.println(uniS);
				
				
		/*
		 * System.out.println(name); System.out.println(age); System.out.println(uniS);
		 * System.out.println(favor);
		 */
				
				//java
				//resp.sendRedirect("world?name" + name + "&age=" +age);
				searchDto dto = new searchDto(name, age, uniS, favor);
				//생성한 Dto 의 파라미터에 받아온 데이터를 넣는다.
				
				req.setAttribute("result", dto); //dto를 mem객체로 저장해서 짐을싼다.
				
				
				//forward 전진
				req.getRequestDispatcher("data3").forward(req,resp);//짐을 가지고이동
				
				//getRequestDispatcher : 클라이언트가 전송한 데이터를 그대로 옮긴다.
				//sendRedirect: 새로운 페이지로 이동(기존 데이터 전송 불가)
				
				//word로 가라 대신 짐을 가지고 이동해라
				//resp.sendRedirect("world"); 그냥 경로이동
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
