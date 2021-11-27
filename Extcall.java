package com.javatpoint.servlets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Extcall {
	
	
		private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL2 = "https://www.kayak.co.in/";
	//	https://www.portlandlibrary.com/
			private static final String GET_URL = "https://www.portlandlibrary.com/";
		private static final String POST_URL = "https://localhost:9090/SpringMVCExample/home";

		private static final String POST_PARAMS = "userName=Pankaj";

/*		public static void main(String[] args) throws IOException {
			System.out.println("inside mEthod");
			try {
				sendGET();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("GET DONE");
			//sendPOST();
			//System.out.println("POST DONE");
		}
*/
		public  void sendGET() throws IOException, InterruptedException {
			//int counter123;
		//	System.setProperty("UseSunHttpHandler", "true") ;
			URL obj = new URL(GET_URL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					System.out.println("reading");
				}
				for (int counter123=1;counter123<=3;counter123++);
				{
		response.append(inputLine);
		Thread.sleep(500);
	}
				
				in.close();

				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("GET request not worked");
			}

		}
		public  void sendGET2() throws IOException, InterruptedException {
			//int counter123;
		//	System.setProperty("UseSunHttpHandler", "true") ;
			URL obj = new URL(GET_URL2);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", USER_AGENT);
			int responseCode = con.getResponseCode();
			System.out.println("GET Response Code :: " + responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(
						con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					System.out.println("reading");
				}
				for (int counter123=1;counter123<=3;counter123++);
				{
		response.append(inputLine);
		Thread.sleep(500);
	}
				
				in.close();

				// print result
				System.out.println(response.toString());
			} else {
				System.out.println("GET request not worked");
			}

		}

		private static void sendPOST() throws IOException {
			URL obj = new URL(POST_URL);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("User-Agent", USER_AGENT);

			// For POST only - START
			con.setDoOutput(true);
			OutputStream os = con.getOutputStream();
			os.write(POST_PARAMS.getBytes());
			os.flush();
			os.close();

	}


	}


