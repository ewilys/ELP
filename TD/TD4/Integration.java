/** 
* Programme qui integre une fonction (ie. calcule l'aire sous la courbe).
*/
public class Integration
{
    /** 
     * Approximation de l'integration d'une fonction
     * sur un intervalle. 
     * @param a borne inferieure
     * @param b borne superieure
     * @param delta pas d'echantillonage
     * (plus il est petit, meilleure est l'approximation)
     * @return l'integration de la fonction f
     */
    private static double calculer(double a, double b, double delta, FonctionDeRDansR f)
    {
		
	System.out.println("integration sur ["+a+","+b+"] par pas de "+delta);
	double sum = 0; 
	for (double x = a; x <= b; x += delta)
	    sum += f.evaluer(x)*delta; 
	return sum; 
    }

    /** 
     * Approximation de l'integration d'une fonction
     * sur un intervalle. 
     * @param args un tableau d'arguments pour donner
     * les bornes de l'intervalle d'integration et
     * le nombre d'echantillons (plus ce nombre est
     * grand, plus l'estimation est precise). 
     */
    public static void main(String[] args)
    {
	double a, b; //bornes inf et sup de l'intervalle a integrer
	int n; //nombre d'echantillons
	double delta; //pas d'Ã©chantillonage = (b-a)/n

	if (args.length >= 3 )
	    {
		a = (double) Double.parseDouble(args[0]); 
		b = (double) Double.parseDouble(args[1]);
		n = (int) Integer.parseInt(args[2]); 
	    }
	else
	    {
		System.out.println("NB: Options <a> <b> <n>"); 
		System.out.println("Pour integrer sur [a,b] avec n Ã©chantillons"); 
		a = 0; 
		b = 10; 
		n = 100; 
		System.out.println("NB: Valeurs par dÃ©faut: "+a+", "+b+", "+n); 
		System.out.println(); 
	    }

	delta = (b-a)/n;

	//appel principal
	double res, verite; 

	FonctionDeRDansR f=new Sinusoide(0.0, 1.0);
	res = calculer(a, b, delta, f);
	System.out.println( "Resultat: "+res);
	verite = Math.cos(a)-Math.cos(b); //theoreme fondamental du calcul
	System.out.println( "Verite: "+verite);

    }
}	
