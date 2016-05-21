import java.lang.Math;

class Sinusoide extends FonctionDeRDansR{

	double myA, myB;
	
	public Sinusoide(double a, double b){

		myA=a;
		myB=b;
	}

	public double evaluer (double x){

		return myA*Math.cos(x)+myB*Math.sin(x);
	}

}
