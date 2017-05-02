package online.mobwell.network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Comm {
	private ServerSocket serverSocket;

	public static final int PORT = 151105;

    private ExecutorService executorService = Executors.newFixedThreadPool(10);  

	public Comm() {

	}

	public void startServer() {
		try {
			System.out.println("Starting Server");
			serverSocket = new ServerSocket(PORT); 

			while(true) {
				System.out.println("Waiting for request");
				try {
					Socket s = serverSocket.accept();
					System.out.println("Processing request");
					executorService.submit(new ServiceRequest(s));
				} catch(IOException ioe) {
					System.out.println("Error accepting connection");
					ioe.printStackTrace();
				}
			}
		}catch(IOException e) {
			System.out.println("Error starting Server on "+PORT);
			e.printStackTrace();
		}
	}

	class ServiceRequest implements Runnable {

		private Socket socket;

		public ServiceRequest(Socket connection) {
			this.socket = connection;
		}

		public void run() {

			// TODO Logic here

			try {
				socket.close();
			}catch(IOException ioe) {
				System.out.println("Error closing client connection");
			}
		}        
	}
}


