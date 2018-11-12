import javax.swing.*;


public class Trabalho2 {
	
	static class Conta {
		String titular;
		int numConta;
		float saldo;
	}
	int tam = 0;
	Conta vetorContas[] = new Conta[n];
	
	public static void criaConta(nome, num){
		tam ++;
		Conta nova = new Conta();
		nova.titlar = nome;
		nova.numConta = num;
    	}
	
	public static void main (String[] args) {
		String nome = "Oliver";
		int num = 1;
		criaConta(nome, num);
	}
}
