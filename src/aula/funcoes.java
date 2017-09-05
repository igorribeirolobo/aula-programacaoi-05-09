package aula;

public class funcoes {

	private int num1 = 0;
	private int num2 = 0;
	private int resultado = 0;
	
	public void RecebeNumero(int a,int b)
	{
		this.num1 = a;
		this.num2 = b;
	}
	
	public int Somar()
	{
		this.resultado = this.num1 + this.num2;
		
		return this.resultado;
	}
	
	
}
