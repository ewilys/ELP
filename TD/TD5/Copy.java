import java.util.*;
import java.io.*;


public class Copy{

	public static void main (String[]args) throws IOException, FileNotFoundException{

		InputStream fin ;
		OutputStream fout;


		switch(args.length){
			case 2 :
				fin=new FileInputStream(new File(args[0]));
				fout=new FileOutputStream(new File(args[1]));
				break;
			case 1 :
				fin=new FileInputStream(new File (args[0]));
				fout=System.out;
				break;
			default:
				fin=System.in;
				fout=System.out;
				break;
			
		}
		copy(fin, fout);
		
		fin.close();
		fout.close();
}

	private static void copy(InputStream is, OutputStream os)  throws IOException {
		int octet=is.read();		
		while ( octet !=-1) {
			os.write(octet);
			octet=is.read();
		}
			

	}

	

}
