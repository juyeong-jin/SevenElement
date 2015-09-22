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

@WebServlet("/Lifecycle")
public class LifeCycleServlet extends HttpServlet {
	
	static Log log  = LogFactory.getLog(LifeCycleServlet.class);
	@Override
	public void init() throws ServletException {
		log.info("#########");
		log.info("init()...");
		log.info("#########");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.info("@@@@@@@@@@");
		log.info("doGet()...");
		log.info("@@@@@@@@@@");
		
		PrintWriter out = resp.getWriter();
		out.println("doGet() called...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.info("@@@@@@@@@@");
		log.info("doPost()...");
		log.info("@@@@@@@@@@");
		
		PrintWriter out = resp.getWriter();
		out.println("doPost() called...");
	}
	
		// 파라미터 식별 ( <ul> <li> )
		
		// 요청헤더식별 ( <ol> <li> )
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.info("@@@@@@@@@@");
		log.info("doPut()...");
		log.info("@@@@@@@@@@");
	
		PrintWriter out = resp.getWriter();
		out.println("doPut() called...");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		log.info("@@@@@@@@@@");
		log.info("doDelete()...");
		log.info("@@@@@@@@@@");
		
		PrintWriter out = resp.getWriter();
		out.println("doDelete() called...");
	}
	
	@Override
	public void destroy() {
		log.info("############");
		log.info("destroy()...");
		log.info("############");
	}
	
}
