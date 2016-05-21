import java.awt.event.ActionListener; 
import javax.swing.*;
import java.awt.event.ActionEvent; 

/*
 * Button listener
 */
public class ButtonMinus implements ActionListener {
	
	
	//instance de processeur
	private Processeur p;
	//instance de JTextField
	private JTextField text;

	public ButtonMinus(Processeur p, JTextField text){
		this.p=p;
		this.text=text;
	}

    @Override 
    public void actionPerformed(ActionEvent e) {
	//print 'beep' to the standard output
	//when an action event is received
	p.moins();
	text.setText(text.getText()+"-");
    }

}
