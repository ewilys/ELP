class TestComplexe{

    public static void main(String[] args) {

	boolean res = true; 
	Complexe c1 = new Complexe(2,5); 
	Complexe c2= new Complexe(1,3);
	
	res=res && TestVecteur.testsUnitaires(c1,c2);
	
	Complexe c1_=c1.obtenirConjugue();
	System.out.println("conjugué de c1= "+c1_);

	double norme = c1.obtenirNorme();
	System.out.println("norme de c1 ="+norme);

	c1_.multiplier(c1);
	System.out.println("multiplication de c1 et conjugue de c1 ="+c1_);

	res =res && (c1_.x==norme);
	String msg = (res) ? "SUCCES" : "ECHEC"; 
	System.out.println(msg); 
	

	Complexe c0=new Complexe(0,0);

	try { // attention l'ordre est respectée , si on divise d2 par c1 apres l'exception ce n'est pas fait car l'exception a déja été attrapé. 
		c2.diviser(c1);
		System.out.println(c2); 
		
		c2.diviser(c0);
		System.out.println(c2); 

	}catch(DivisionComplexeParZero d){
		d.printStackTrace();
	}finally {
		System.out.println(c2); 
	}	
    }
}
