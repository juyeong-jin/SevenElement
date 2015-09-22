package com.webapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@WebServlet("/sessioncreate")
public class SessionCreateServlet extends HttpServlet{
	
	static Log log = LogFactory.getLog(SessionCreateServlet.class);  
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	// 요청들어오는 것에 대해 utf-8로 인코딩
		response.setContentType("text/html; charset=utf-8");	// 문서타입; 그것에 대해 엔코딩된건 응답헤더로 들어감
		PrintWriter out = response.getWriter();
		
		String loginid = request.getParameter("loginid");
		
		HttpSession session = request.getSession(); // request.getSession(true)
		session.setAttribute("loginid", loginid);
		
		session.setMaxInactiveInterval(60*3);  // 3분
		
		out.println("<hr>");
		out.println("<h1> 세션 생성 ==> Set-Cookie헤더를 참조하세요</h1>");
		out.println("<h2>Timeout = " + session.getMaxInactiveInterval() + "</h2>");
		out.println("<hr>");
	}
	
}
