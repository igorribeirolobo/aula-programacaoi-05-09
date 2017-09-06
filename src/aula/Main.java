package aula;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		funcoes funcao = new funcoes();
		int a = 0, b = 0;
		boolean executa = true;
		while(executa)
		{
		   try {
		    a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de A: "));
		    executa = false;
		   }
		   catch(NumberFormatException e)
		   {
			   JOptionPane.showMessageDialog(null, "informe um numero válido, erro: "+ e.toString());
           }
		}
		executa = true;
		while(executa)
		   try
		   {
		    b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor de B: "));
		    executa = false;

		   }
		   catch(NumberFormatException e)
		   {
			   JOptionPane.showMessageDialog(null,"informe um numero válido, erro: "+ e.toString());
		   }
	    funcao.RecebeNumero(a, b);
	    JOptionPane.showMessageDialog(null, "A soma retronou um resultado que é: "+ funcao.Somar());
	}

}
