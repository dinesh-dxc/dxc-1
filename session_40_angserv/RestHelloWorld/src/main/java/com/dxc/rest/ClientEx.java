package com.dxc.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

public class ClientEx {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:8080/RestHelloWorld/webapi/employ/employInsert");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employ No   ");
			int empno=Integer.parseInt(sc.nextLine());
			System.out.println("Enter Name  ");
			String name = sc.nextLine();
			System.out.println("Enter Department  ");
			String dept = sc.nextLine();
			System.out.println("Enter Designation  ");
			String desig = sc.nextLine();
			System.out.println("Enter Basic   ");
			int basic = Integer.parseInt(sc.nextLine());

		//	String input = "{\"empno\":9111,\"name\":\"Raj\",\"dept\":\"Java\",\"desig\":\"Programmer\",\"basic\":98234}";
		//	String input = "{\"empno\":9111,\"name\":\"Raj\",\"dept\":\"Java\",\"desig\":\"Programmer\",\"basic\":98234}";
		//	String worki = "{\"empno\":" +empno +",\"name\":\" "+name +"\",\"dept\":\"" +dept +"\",\"desig\":\""+desig +"\",\"basic\": "+basic +"}";
			String input = "{\"empno\":" +empno +",\"name\":\" "+name +"\",\"dept\":\"" +dept +"\",\"desig\":\""+desig +"\",\"basic\": "+basic +"}";
			System.out.println(input);
			//String input ="{'empno':'5533','name':'Prakash','dept':'Java','desig':'Programmer','basic':'88245'}";
			// String input = "{\"qty\":100,\"name\":\"iPad 4\"}";

			OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();

//			if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
//				throw new RuntimeException("Failed : HTTP error code : "
//						+ conn.getResponseCode());
//			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {

				System.out.println(output);
			}

			conn.disconnect();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
