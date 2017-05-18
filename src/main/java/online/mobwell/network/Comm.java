package online.mobwell.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONArray;
import org.json.JSONObject;

import online.mobwell.ex_solutions.Exercicio4;
import online.mobwell.exercises.ChaSwitch;
import online.mobwell.exercises.Exercise;

public class Comm {
	private ServerSocket serverSocket;

	public static final int PORT = 15114;

	private ExecutorService executorService;

	//	Logger logger = Logger.getLogger(getClass().getSimpleName());

	public Comm() {
		executorService = Executors.newFixedThreadPool(10);  
	}

	public void startServer() {
		Socket s = null ;
		PrintWriter out = null;
		BufferedReader in = null;

		String code = "";
		try {
			while(true) {
				//				if (!serverSocket.isBound()) {
				try {
					System.out.println("Starting Server");
					serverSocket = new ServerSocket(PORT); 
					System.out.println("Waiting for request");
					s = serverSocket.accept();
					System.out.println("Processing request");
					out = new PrintWriter(s.getOutputStream(), true);
					in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				}catch(IOException e) { 
					System.out.println("Error starting Server on "+PORT);
					e.printStackTrace();
					serverSocket.close();
					s.close();
					code = null;
					out.close();
					in.close();
//					System.exit(0);
				}
				//				}
//				while (code != null && code.compareTo("die") != 0) {
					System.out.println("Listening...");
					code = in.readLine();
					System.out.println("readLine: " + code);

					ChaSwitch cha = ChaSwitch.getSwitch(code);
					cha.getEx().writeExecute();
					cha.getEx().reviewExercise();
					
					Exercise ex = cha.getEx();

					JSONObject jobj = new JSONObject();

					jobj.put("execution-error", ex.getExecutionError());
					jobj.put("file-location", ex.getFilesdir());
					jobj.put("results", ex.getMarks());

					out.println(jobj.toString());
						serverSocket.close();
						s.close();
						out.close();
						in.close();

					if (code != null && code.compareTo("die") == 0) {
						System.exit(0);
					}

			}
		} catch(Exception ioe) {
			System.out.println("Error accepting connection");
			ioe.printStackTrace();
		}
	}
}
/*
   class ServiceRequest implements Runnable {

   private Socket socket;

   public ServiceRequest(Socket connection) {
   this.socket = connection;
   System.out.println("started");
   }

   public void run() {
   try {
   System.out.println("running");
// TODO Logic here
PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

System.out.println(in.readLine());

//				logger.debug(in.readLine());
socket.close();
}catch(IOException ioe) {
System.out.println("Error closing client connection");
}
   }        
   }
   }
   */

