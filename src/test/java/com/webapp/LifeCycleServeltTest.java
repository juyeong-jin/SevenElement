package com.webapp;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.Test;

public class LifeCycleServeltTest {
	
	public void Sender(String request){
		Socket soc = null;
		try {
			soc = new Socket("jyjin", 8080);
			InputStream in = soc.getInputStream();
			OutputStream out = soc.getOutputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));
			
			writer.print(request);
			writer.flush();
			String line = null;
//			while((line = reader.readLine()) != null){
//				System.out.println(line);
//			}
			line = reader.readLine();
			System.out.println(line);
		
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				soc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Test
	public void testdoGet() {
		String request="";
		request += "GET /SevenElement/lifecycle HTTP/1.1\n";
		request += "Host: jyjin:8080";
		request += "\n";
		request += "\n";
		Sender(request);
	} 
	
	@Test
	public void testdoPost() {
		String request="";
		request += "POST /SevenElement/lifecycle HTTP/1.1\n";
		request += "Host: jyjin:8080";
		request += "\n";
		request += "\n";
		Sender(request);
	}
	
	@Test
	public void testdoPut() {
		String request="";
		request += "PUT /SevenElement/lifecycle HTTP/1.1\n";
		request += "Host: jyjin:8080";
		request += "\n";
		request += "\n";
		Sender(request);
	}
	
	@Test
	public void testdoDelete() {
		String request="";
		request += "DELETE /SevenElement/lifecycle HTTP/1.1\n";
		request += "Host: jyjin:8080";
		request += "\n";
		request += "\n";
		Sender(request);
	}

}
