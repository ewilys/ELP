
class ArgumentsApp{

	public static void main (String args[]){
		
		int length= args.length;

		if (length==0){
			System.err.println("aucun argument n'est donné , C'est PAS BIEN ! ");//ecrit sur sortie d'erreur
		}
		else {
			for (int i=0; i<length;i++){
				System.out.println("argument "+i+" = "+args[i]);
			}
		}
	}
}
