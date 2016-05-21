import java.awt.event.ActionListener; 
import javax.swing.*;
import java.awt.event.ActionEvent; 

/*
 * Button listener
 */
public class ButtonPlus implements ActionListener {

	//instance de processeur
	private Processeur p;
	//instance de JTextField
	private JTextField text;

	public ButtonPlus(Processeur p, JTextField text){
		this.p=p;
		this.text=text;
	}


    @Override 
    public void actionPerformed(ActionEvent e) {
	//print '+' to the JTextField
	//when an action event is received
	p.plus();
	text.setText(text.getText()+"+");
	 
    }

}
