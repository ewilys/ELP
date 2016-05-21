import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.*; 

/*
 * Button listener
 */
public class ButtonEqual implements ActionListener {

	
	//instance de processeur
	private Processeur p;
	//instance de JTextField
	private JTextField text;

	public ButtonEqual(Processeur p, JTextField text){
		this.p=p;
		this.text=text;
	}

    @Override 
    public void actionPerformed(ActionEvent e) {
	//print 'beep' to the standard output
	//when an action event is received
	double res=p.obtenirResultat();
	text.setText(text.getText()+"="+res); 
    }

}
