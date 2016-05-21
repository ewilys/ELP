/** Classe testant l'interrupteur à bascule. */
class InterrupteurTest {
    public static void main(String[] args) {
	Interrupteur i = new Interrupteur(); 
	//TODO

	System.out.println("interrupteur initialisé est il en ON ? "+i.estEnMarche);
	
	i.basculer();
	
	System.out.println("basculement effectué, interrupteur en ON ? "+i.estEnMarche);

    }
}
