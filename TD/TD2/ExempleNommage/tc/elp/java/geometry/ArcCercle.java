class ArcCercle{

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
