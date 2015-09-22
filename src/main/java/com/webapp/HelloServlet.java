package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	
	static Log log = LogFactory.getLog(HelloServlet.class);
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	// 요청들어오는 것에 대해 utf-8로 인코딩
		
		response.setContentType("text/html; charset=utf-8");	// 문서타입; 그것에 대해 엔코딩된건 응답헤더로 들어감
		
		String remoteAddr = request.getRemoteAddr();
		String remoteHost = request.getRemoteHost();
		log.info("remoteAdder = " + remoteAddr);
		log.info("remoteHost = " + remoteHost);
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");	// HTML5 문서 타입
		out.println("<html>");
		out.println("<body>");
		out.println("<hr/>");
		out.println("<h1><a href=\"http://www.warning.or.kr\">하하.</a></h1>");
		out.println("<hr/>");
		out.println("<h1> My Address = " + remoteAddr + "</h1>");
		out.println("<h2> My Host = " + remoteHost + "</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}
	
}
