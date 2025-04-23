import java.util.List;

public class Main {

	public static void main(String[] args) { 
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Banco banco = new Banco("Bradesco", "001");
				
		Conta cc = new ContaCorrente(venilton, banco);
		Conta poupanca = new ContaPoupanca(venilton, banco);

		cc.depositar(100);
		cc.transferir(101, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
