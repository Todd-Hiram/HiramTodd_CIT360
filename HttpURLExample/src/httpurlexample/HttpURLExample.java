/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 **/
package httpurlexample;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/**
 * @author hiramtodd
 * 
 * URL (Uniform Resource Locator) represents a resource on the world wide web, 
 * and in Java, the httpURLConnection class for HTTP (HyperText Transfer Protocol) is used for both sending and 
 * receiving data of any type and length over the web.
 */

public class HttpURLExample {

	private final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws Exception {

		HttpURLExample http = new HttpURLExample();

		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet();
		
		System.out.println("\nTesting 2 - Send Http POST request");
		http.sendPost();
	}

	/** 
         * URL and HTTP are work together in order to provide less complexity to
         * requests and responses using HTTP protocol. Java developers use this quite
         * a bit when it comes to interacting with web servers.
         * 
         * openConnection method returns a new connection to the resource that is
         * referred to by the URL which is the String url = () in lines 64 and 103
         * of both in Testing 1 and 2. 
         * 
         * Both the GET and POST requests are used to transfer data from client to 
         * server in HTTP protocol. However, there are differences. GET carries 
         * request parameter appended in URL string, and POST carries the request 
         * parameter in a message body which is the more secure way of transferring
         * the data.
         * 
         * GET can only pass limited amount of data while POST can pass larger 
         * amounts of data to the server. Also, GET is used mostly for viewing 
         * purposes such as in (e.g. SQL SELECT) while POST is used mostly for
         * updating purposes.
         * 
         * In the GET block below, it first obtains a new HttpURLConnection by calling 
         * URL#openConnection() and casting the result to HttpURLConnection.
         * 
         * Then the request is prepared by the primary property that is the url. 
         * Metadata information can also be included such as preffered content types,
         * and session cookies in the Request Header.
	 ***/
        
        /** Testing 1 **/
        // Here is where we prepare the GET request.
	private void sendGet() throws Exception {

                /** 
                 * This is the url we are requesting a connection to and assigning
                 * it to url. 
                 **/
		String url = "http://www.google.com/search?q=mkyong";
		
                // Here is the primary property of a request and it is in the url
                URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// Optional default is GET
//		con.setRequestMethod("GET");

                // Add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

                /**
                 * When it comes to response headers, here is normally where we include
                 * such metadata like content for response bodies: content type and
                 * length, modified dates and session cookies. Response body may be 
                 * read from the stream that is returned by getOutputStream(). If 
                 * no response from the body, then the method returns nothing.
                 **/
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL: " + url); // Displays the Google url.
                
                /** 
                 * This displays the status response code which in this case is 200
                 * which means that the GET request was successful.
                 * 
                 * The BufferedReader reads text from a character-input stream and
                 * it buffers characters so that it provides efficiency in not 
                 * only reading characters, but also arrays and lines. 
                 * 
                 * Reading the characters also receives help from InputStreamReader
                 * which is the bridge from byte streams to character streams.
                 **/
		System.out.println("Response Code: " + responseCode); 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream())
                );
		String inputLine;
		StringBuffer response = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                    }
                    in.close();

		// Print result
		System.out.println(response.toString());

	}
	
        
        /** Testing 2 **/
	// HTTP POST request
	private void sendPost() throws Exception {

		String url = "https://selfsolve.apple.com/wcResults.do";
		URL obj = new URL(url);
		HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
                
                /**
                * In Testing 2 block, POST request, the instance is configured with 
                * setDoOutput(boolean) method to include the request body and then
                * the data is transmitted using the stream that is returned with
                * the getOutputStream() method. This where the POST request is sent.
                **/
                con.setDoOutput(true);
                DataOutputStream wr = new DataOutputStream(
                        con.getOutputStream()
                );
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL: " + url);
		System.out.println("Post parameters: " + urlParameters);
                
                 /** 
                 * This displays the status response code which in this case is 200
                 * which means that the POST request was successful.
                 **/
		System.out.println("Response Code: " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                            response.append(inputLine);
                    }
                    in.close();
		
		//print result
		System.out.println(response.toString());

	}

}