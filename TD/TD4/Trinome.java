class Trinome extends FonctionDeRDansR{

	double myA, myB, myC;

	public Trinome(double a, double b, double c){
		myA=a;
		myB=b;
		myC=c;
	}
	
	public double evaluer(double x){
		return myA*x*x+myB*x+myC;
	}
}
