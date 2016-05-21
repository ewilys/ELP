package tc.elp.java.geometry;

import tc.elp.java.geometry.Point;

class Cercle {

	private Point centre;
	private double rayon;
	

	public Cercle(Point centre, double rayon){
		
		this.centre=centre;
		this.rayon=Abs(rayon);
		
		
	}

	public static double Abs(double a){
		return java.lang.Math.abs(a);
	}

	public String toString(){
		
		return "cercle de centre "+this.centre+" et de rayon "+this.rayon;
	}
	
}
