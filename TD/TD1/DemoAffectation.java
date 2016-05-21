class DemoAffectation{

	public static void main (String args[]){
		
		boolean b1 = false;
		boolean b2 = b1;
		b2 = !b2;
		System.out.println( b1 );
	
		Interrupteur i1 = new Interrupteur();
		Interrupteur i2 = i1;
		i2.basculer();
		System.out.println( i1.estEnMarche );	
	}

}

	
