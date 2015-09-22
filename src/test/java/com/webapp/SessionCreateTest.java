package com.webapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SessionCreateTest {

   static Log log = LogFactory.getLog(SessionCreateTest.class);
   
   public static String getSession(int param){
      String session=null;
      try {
         Socket socket = new Socket("localhost", 80);
         
         InputStream in = socket.getInputStream();
         OutputStream out = socket.getOutputStream();
         
         PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));
         BufferedReader reader = new BufferedReader(new InputStreamReader(in));
         
         writer.printf("GET /SevenElement/sessioncreate?loginid=x%03d HTTP/1.1", param);
         writer.println();
         writer.println("Host: localhost:80");
         writer.println();
         writer.println();
         
         writer.flush();
         
         
         String line=null;
         while((line=reader.readLine()) !=null){
            if(line.startsWith("Set-Cookie")){
               
               StringTokenizer token = new StringTokenizer(line, ":;");
//               System.out.println(line);
               String key = token.nextToken();
               session = token.nextToken();
               break;         
            }
            
         }
         socket.close();
         
         
      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      return session;
      
   }
   
   
   public static void main(String[] args) {
      List<String> sessions = new ArrayList<String>();
      PrintWriter writer = null;
      try {
      writer = new PrintWriter("jsession.txt");
      
       for(int i=0; i<10; i++){   
            String session = getSession(i);
            sessions.add(session);
            }
            
            for(String s : sessions){
               log.info(s);
               writer.println(s);
            }
      
   } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   } finally {
      writer.close();
   }
  
   }

}
//try {
//URL url = new URL("http://www.google.com");
//HttpURLConnection httpurl = (HttpURLConnection) url.openConnection();
//httpurl.setRequestProperty("Accept", "utf-8");
//
//
//InputStream in = httpurl.getInputStream();
//BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//
//String line=null;
//while((line=reader.readLine()) !=null){
//   log.info(line);
//}
//
//String header = httpurl.getHeaderField("Content-Type");
//
//log.info("Content-Type:"+header);
//
//
//} catch (MalformedURLException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//} catch (IOException e) {
//// TODO Auto-generated catch block
//e.printStackTrace();
//}
//
//