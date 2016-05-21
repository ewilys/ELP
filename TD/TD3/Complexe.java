import java.lang.*;

class Complexe extends Vecteur{

	public Complexe (Vecteur v){
		super (v);
	}

	public Complexe(double x, double y){
		super (x,y);
	}

	public double obtenirNorme(){
		return ( Math.pow(this.x, 2) + Math.pow(this.y,2));

	}
		
	public Complexe obtenirConjugue(){
		
		return new Complexe(this.x, -this.y);
		
	}

	public void multiplier(Complexe c){
		
		this.x=(this.x*c.x) -(this.y*c.y);
		this.y=(this.x*c.y)+(this.y*c.x);

	}

	public void diviser(Complexe c) throws DivisionComplexeParZero{
	
		if (c.x==0 && c.y==0){
			throw new DivisionComplexeParZero();
		}
		else{
		
		multiplier(c);
		double normeC= c.obtenirNorme();
		this.x=this.x/normeC;
		this.y=this.y/normeC;
	
		}
	}
	
	public String toString(){

		return this.x+"+ i("+this.y+")";
	}


}
