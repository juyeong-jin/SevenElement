package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/cookie/cookieread")
public class CookieReadServlet extends HttpServlet{
	
	static Log log = LogFactory.getLog(CookieReadServlet.class);
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	// 요청들어오는 것에 대해 utf-8로 인코딩
		response.setContentType("text/html; charset=utf-8");	// 문서타입; 그것에 대해 엔코딩된건 응답헤더로 들어감
		PrintWriter out = response.getWriter();
	
		out.println("<hr>");
		out.println("<h1> 쿠키 읽기 완료 ==> 헤더를 참조하세요</h1>");
		out.println("<hr>");
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies !=null)
		for(Cookie c : cookies)	{
			String name = c.getName();
			String value = URLDecoder.decode(c.getValue(), "utf-8");
			out.println(name + "=" + value + "<br>");
		}
	}
	
}
