/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlexample;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author hiramtodd
 */
public class BackEndMenu {

  public static final void urltest() {
      
    URL url;
    HttpURLConnection urlConnection = null;
    try {

      // This the URL that we are trying to contact which is why we are using a Try-Catch.
      url = new URL("http://marvelcomicsuniverse.com");

      /**
       * This is a connection that will open up a pipe line into the internet with the help of using Java run application
       * that uses HTTP to contact the URL we are trying to reach.
       * **/
      urlConnection = (HttpURLConnection) url
              .openConnection();

      InputStream in = urlConnection.getInputStream();

      InputStreamReader isw = new InputStreamReader(in);

      /**
       * Once the connection is made, a message is sent back and goes through this while loop. The "char"
       * is short for characters and requests for the current characters to print out that are on that
       * web URL.
       ***/
      int data = isw.read();
      while (data != -1) {
        char current = (char) data;
        data = isw.read();
        System.out.print(current); // The ouput print is current.
        
      }
    } catch (Exception e) {

      e.printStackTrace();

    } finally {
      try {

        urlConnection.disconnect();

      } catch (Exception e) {

        /**
         * This here will send out a message if we are unable to connect to the site for whatever
         * reason. Then it will disconnect. Here there is no timelimit, it is dependent on how many
         * tries there are.
         ***/
        e.printStackTrace(); //If you want further info on failure...

      }
    }
  }
  public static final void smtpExample() {
      
// declaration section:
// smtpClient: our client socket
// os: output stream
// is: input stream
    Socket smtpSocket = null;
    DataOutputStream os = null;
    DataInputStream is = null;
    
// Initialization section:
// Try to open a socket on port 25
// Try to open input and output streams
    try {
        
      smtpSocket = new Socket("localhost", 25);
      os = new DataOutputStream(smtpSocket.getOutputStream());
      is = new DataInputStream(smtpSocket.getInputStream());
      
    } catch (UnknownHostException e) {
        
      System.err.println("Did not recognize server: localhost");
      
    } catch (IOException e) {
        
      System.err.println("Was not able to open I/O connection to: localhost");
      
    }
    
// If everything has been initialized then we want to write some data
// to the socket we have opened a connection to on port 25
    if (smtpSocket != null && os != null && is != null) {
        
      try {

        os.writeBytes("HELO\n");
        os.writeBytes("MAIL From: david.banks0889@gmail.com\n");
        os.writeBytes("RCPT To: david.banks0889@gmail.com\n");
        os.writeBytes("DATA\n");
        os.writeBytes("From: david.banks0889@gmail.com\n");
        os.writeBytes("Subject: TEST\n");
        os.writeBytes("Hi there\n"); // message body
        os.writeBytes("\n.\n");
        os.writeBytes("QUIT");
        
// keep on reading from/to the socket till we receive the "Ok" from SMTP,
// once we received that then we want to break.
        String responseLine;
        while ((responseLine = is.readLine()) != null) {
          System.out.println("Server: " + responseLine);
          if (responseLine.contains("Ok")) {
            break;
            
          }
        }
        
// clean up:
// close the output stream
// close the input stream
// close the socket
        os.close();
        is.close();
        smtpSocket.close();
        
      } catch (UnknownHostException e) {
          
        System.err.println("Trying to connect to unknown host: " + e);
        
      } catch (IOException e) {
          
        System.err.println("IOException:  " + e);
        
      }
    }
  }
  public final static void connect(){
    Connection conn = null;
    try {
        
      conn = DriverManager.getConnection("jdbc:mysql://localhost/cit361-sandbox?" +
                      "user=root&password=");

      // Do something with the Connection

    } catch (SQLException ex) {
        
      // handle any errors
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());

    }

    if (null != conn) {
        
      System.out.println("Connected to database!");
      
    } else {
        
      System.out.println("Failed to make connection!");
      
    }
    try {
        
      Statement stmt = conn.createStatement();
      String query = "select * from movies ;";
      //movies is the table name
      ResultSet rs = stmt.executeQuery(query);
      while (rs.next()) {
        String name = rs.getObject(2).toString();
        String Start_Time = rs.getObject(3).toString();
        System.out.println(name + ": " + Start_Time);
        //movies table has name and price columns

      }
    } catch (SQLException e) {
        
      for(Throwable ex : e) {
          
        System.err.println("Error occurred " + ex);
        
      }
      
      System.out.println("Error in fetching data");
      
    }
  }
  public static void purchaseTicketsCompanyList() {
      
    List companyList = new ArrayList();  // A List contains instances of Object. Upcast ArrayList to List
    companyList.add("AMC Theatres");            // add() takes Object. String upcast to Object implicitly
    companyList.add("Cinemark Theatres");
    companyList.add("Megaplex Theatres");
    companyList.add("Regal Entertainment Theatres");
    companyList.add("Fandango");
    companyList.add("Moviefone");

    Iterator iter = companyList.iterator();
    while (iter.hasNext()) {      // any more element
      // Retrieve the next element, explicitly downcast from Object back to String
      String str = (String)iter.next();
      System.out.println(str);

    }
  }

  public static void ticketPrices() {
      
    TreeMap ageGroup = new TreeMap();

    // Add some ageGroup.
    ageGroup.put("Adult", 8.75);
    ageGroup.put("Child", 5.50);
    ageGroup.put("Senior Citizen", 5.25);
    ageGroup.put("Military Veteran", 5.00);

    // Iterate over all ageGroup, using the keySet method.
    for(Object key: ageGroup.keySet())
      System.out.println(key + " - $" + ageGroup.get(key));
    System.out.println();

    System.out.println("Highest key: " + ageGroup.lastKey());
    System.out.println("Lowest key: " + ageGroup.firstKey());

    System.out.println("\nPrinting all values: ");
    for(Object val: ageGroup.values())
      System.out.println("$" + val);
    System.out.println();

    // Clear all values.
    ageGroup.clear();

    // Equals to zero.
    System.out.println("After clear operation, size: " + ageGroup.size());
    
  }
}
