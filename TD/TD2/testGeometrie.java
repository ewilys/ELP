import tc.elp.java.geometry;

class testGeometrie{

	public static void main (String[] args){
		
		Point p=new Point (0,0);
		double r=5;
		Cercle c=new Cercle(p,r);
		Secteur s=Secteur.Pquadrant();
		ArcCercle ac=new ArcCercle(c,s);

		System.out.println(ac);
	}
}
