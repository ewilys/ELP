import java.net.*;
import java.io.*;


public class Serveur{
	
	public static void main (String[] args) throws IOException{
	
		ServerSocket connection= new ServerSocket(8080);
		Socket socket=connection.accept();

		InputStream is=socket.getInputStream();
		BufferedReader in= new BufferedReader(new InputStreamReader(is));
		String line= in.readLine();
		while(line != null){
		System.out.println("ligne recue : "+line);
		if (line.equals("stop")){
			line=null;
			
			System.out.println("fin");
		}
		else{line=in.readLine();}
		

		}
	}

}
