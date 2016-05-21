package tc.elp.java.geometry;

import tc.elp.java.geometry.Cercle;
import tc.elp.java.geometry.Secteur;

public class ArcCercle{

	private Cercle cercle;
	private Secteur secteur;

	public ArcCercle(Cercle cercle, Secteur secteur){
		
		this.cercle=cercle;
		this.secteur=secteur;
		
	}

	public String toString(){
		
		return "arc de cercle = secteur "+this.secteur+" du "+this.cercle;
	}
	

}
