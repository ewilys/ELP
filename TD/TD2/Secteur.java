package tc.elp.java.geometry;

class Secteur{
	
	private double teta1,teta2;
	public static final double twoPi= 2*java.lang.Math.PI ;

	public Secteur(double teta1,double teta2){

		while( teta1 <0){
			teta1+=twoPi;
		}
		while( teta1 >= twoPi){
			teta1=(teta1)%(twoPi);
		}

		while( teta2 <0){
			teta2+=twoPi;
		}
		while( teta2 >twoPi){
			teta2=(teta2)%(twoPi);
		}

		this.teta1=teta1;
		this.teta2=teta2;
	}
		

	public static Secteur Scomplet(){
		
		Secteur sc=new Secteur(0,twoPi);
		return sc; 
	}

	public static Secteur Pquadrant(){
	
		Secteur pq= new Secteur(0, (twoPi)/4);
		return pq;
	}

	public String toString(){
		
		if (this.teta2!=twoPi){	
			return "[ "+ this.teta1+ " : "+this.teta2+" ]";
		}
		else {
			return "[ "+ this.teta1+ " : "+this.teta2+" [";
		}
	}

	public double ecart (){
		
		double ecart;
		if (this.teta1<=this.teta2){
			ecart=this.teta2-this.teta1;
		}
		else{
			ecart=twoPi -(this.teta1-this.teta2);
		}
		return ecart;
	}


}	
