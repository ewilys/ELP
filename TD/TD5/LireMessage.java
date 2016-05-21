import java.io.*; 
import java.util.*; 

public class LireMessage {

    public static void main(String args[]) {
	if (args.length < 1) {
	    System.out.println("usage: java LireMessage <dest>"); 
	}
	else {

	    try {
	
		File dest = new File(args[0]);
		FileInputStream fin = new FileInputStream(dest); 
		ObjectInputStream oin = new ObjectInputStream(fin);

		Message m =(Message) oin.readObject(); 
		System.out.println(m);

		oin.close(); 
		fin .close(); 

	    } catch (FileNotFoundException e) {
		System.err.println("ERR: Le fichier source n'existe pas ou le fichier de destination ne peut Ãªtre crÃ©e ou ouvert."); 
	    } catch (IOException e) {
		System.err.println("ERR: entrÃ©e/sortie.");
	    }catch(ClassNotFoundException e){
		System.err.println("ERR : classe non trouvée"); 
	    } finally {
		System.out.println("END"); 
	    }	    
	}
    }
}
