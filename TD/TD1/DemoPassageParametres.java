class DemoPassageParametres{
	
	public static void main (String args[]){
		

		boolean b1 = false;
		b1=faireBasculerBooleen(b1);
		System.out.println( b1 );
	
		Interrupteur i1 = new Interrupteur();
		faireBasculerInterrupteur(i1);
		System.out.println( i1.estEnMarche );

	}

	static boolean faireBasculerBooleen(boolean unBool) {
		unBool = !unBool;
		System.out.println(unBool);
		return unBool;
	}
		
	static void faireBasculerInterrupteur(Interrupteur unInterrupteur) {
  		unInterrupteur.basculer();
	}

}
