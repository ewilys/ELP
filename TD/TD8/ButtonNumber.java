import java.awt.event.ActionListener; 
import javax.swing.*;
import java.awt.event.ActionEvent; 

/*
 * Button listener
 */
public class ButtonNumber implements ActionListener {

	
	//instance de processeur
	private Processeur p;
	//instance de JTextField
	private JTextField text;

	public ButtonNumber(Processeur p, JTextField text){
		this.p=p;
		this.text=text;
	}

    @Override 
    public void actionPerformed(ActionEvent e) {
	//print 'beep' to the standard output
	//when an action event is received
	
	JButton bouton=(JButton)e.getSource();
	String chiffreClique=bouton.getText();

	p.nouveauChiffre(chiffreClique);
	text.setText(p.obtenirNombreCourant());
	
    }

}
