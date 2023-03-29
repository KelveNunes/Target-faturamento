package example;



public class Faturamento {

	private int dia;
	private double valor;
	
	public Faturamento(int dia, double valor) {
		this.dia = dia;
		this.valor = valor;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	


}