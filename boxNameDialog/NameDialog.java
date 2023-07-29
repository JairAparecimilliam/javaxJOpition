import javax.swing.JOptionPane;

public class NameDialog
{
	public static void main(String[] args)
	{

	//pede pro usuario inserir seu nome
	String name = JOptionPane.showInputDialog("What's your name?");

	//cria a mensagem 
	String message = String.format("Welcome, %s, to Java Programming!", name);

	//exibe a mensagem para cumpromentar o usuario pelo seu nome
	JOptionPane.showMessageDialog(null, message);
	
	}//fim de main
}//termina NameDialog
