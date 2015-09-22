package com.webapp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

public class SessionDeleteTest {

   static Log log = LogFactory.getLog(SessionDeleteTest.class);
   
   public static void deleteSession(String sessionid){

      try {
         Socket socket = new Socket("localhost", 80);
         
         InputStream in = socket.getInputStream();
         OutputStream out = socket.getOutputStream();
         
         PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));
         BufferedReader reader = new BufferedReader(new InputStreamReader(in));
         
         writer.println("GET /SevenElement/session/sessiondelete HTTP/1.1");
         writer.println("Host: localhost:80");
         writer.println("Cookie:" + sessionid);
         writer.println();
         writer.println();
         writer.flush();
         
         socket.close();
         
      } catch (UnknownHostException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      List<String> sessions = new ArrayList<String>();
      FileReader reader = null;
      try {
      reader = new FileReader("jsession.txt");
      BufferedReader breader = new BufferedReader(reader);
      
      String line = null;
      while((line = breader.readLine()) != null) 
         sessions.add(line);
      
      for(String s : sessions) {
         log.info(s);
      	deleteSession(s);
      }
      
   } catch (FileNotFoundException e) {
      e.printStackTrace();
   } catch (IOException e) {
      e.printStackTrace();
   } finally {
      try {
         reader.close();
      } catch (IOException ignore) {
         ignore.printStackTrace();
      }
   }
   }    
}
      
//      PrintWriter writer = null;
//      try {
//      writer = new PrintWriter("jsession.txt");
//      
//       for(int i=0; i<1000; i++){   
//            String session = getSession(i);
//            sessions.add(session);
//            }
//            
//            for(String s : sessions){
//               log.info(s);
//               writer.println(s);
//            }
//      
//   } catch (FileNotFoundException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//   } finally {
//      writer.close();
//   }
  
