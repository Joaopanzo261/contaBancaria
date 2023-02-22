package contaBancaria.model;

public class ContaCorrente extends contaBancaria {

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
public boolean sacar(float valor) {
		
		if(this.getSaldo() + this.getLimite()  < valor) {
			System.out.println("\nSaldo  insuficiebte");
			return false;
		}
	
	this.setSaldo(this.getSaldo() - valor);
	return true;
	
}
	public void visualiar () {
		
		super.visualizar();
		System.out.println(" Limite de crédito: " + this.limite);
	}
}

