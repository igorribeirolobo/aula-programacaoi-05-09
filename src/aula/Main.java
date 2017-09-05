package aula;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		funcoes funcao = new funcoes();
		 int a, b;
		    a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A: "));
		    
		    b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B: "));
		    
		    funcao.RecebeNumero(a, b);
		    JOptionPane.showMessageDialog(null, "A soma retronou um resultado que é: "+ funcao.Somar());
		  
	}

}
