package contaBancaria;

//import java.io.IOException;
import java.util.Scanner;

//import contaBancaria.model.contaBancaria;
import contaBancaria.model.ContaPoupanca;
import contaBancaria.model.ContaCorrente;
import contaBancaria.util.Cores;


public class Menu_contaBancaria {

	public static void main(String[] args) {
		

				Scanner leia = new Scanner(System.in);
				
				// criamos objeto conta c1
			//	contaBancaria c1 = new contaBancaria(1, 123, 1, "Erica Araújo", 30000.0f);
			//	
				// Visualizamos os dados da conta c1
			//	c1.visualizar();
				
				//bAlteramos o saldo da conta c1
			///	c1.setSaldo(35000);
			//	System.out.println("\n\n" + c1.getSaldo());
				
				
			//	contaBancaria c2 = new contaBancaria(2, 123, 1, " João Panzo", 30000.0f);
				
			//	c2.visualizar();
				
			//	// Efetuamos um saque na conta c2 e visualizamos o novo saldo
			//	if (c2.sacar(1000.0f))
				//	System.out.println("\n\n" + c2.getSaldo());
				
				
				// Efetuamos deposito na conta c1
			//	c1.depositar(10000.0f);
				
				// Visualizamos os dados da conta c1 após o deposito
			//	c1.visualizar();
				
				ContaCorrente c3 = new ContaCorrente (3, 123, 1, "Kiala ", 20000.0f, 1000.0f);
				
				c3.visualizar();
				
				ContaPoupanca cp1 = new ContaPoupanca (2, 123, 2,"Vioka", 10000.0f, 18);
				cp1.visualizar();
				
				
				int opcao,numero, agencia, tipo, aniversario, numeroDestino;
				String titular; 
				float saldo, limite, valor;

				while (true) {

					System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                BANCO DO BRAZIL COM Z                ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Criar Conta                          ");
					System.out.println("            2 - Listar todas as Contas               ");
					System.out.println("            3 - Buscar Conta por Numero              ");
					System.out.println("            4 - Atualizar Dados da Conta             ");
					System.out.println("            5 - Apagar Conta                         ");
					System.out.println("            6 - Sacar                                ");
					System.out.println("            7 - Depositar                            ");
					System.out.println("            8 - Transferir valores entre Contas      ");
					System.out.println("            9 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("Entre com a opção desejada:                          ");
					System.out.println("                                                     " + Cores.TEXT_RESET);

					opcao = leia.nextInt();

					if (opcao == 9) {
						System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
						leia.close();
						System.exit(0);
						
						
						
					}

					switch (opcao) {
						case 1:
							System.out.println("Criar Conta\n\n");
							
							System.out.println("Número da Agencia: ");
							agencia = leia.nextInt();
							
							System.out.println("Nome do Titular: ");
							leia.skip("\\R?");
							titular = leia.nextLine();
							
							do {
							System.out.println("Tipo da Conta (1-CC / 2 - CP: ");
							tipo = leia.nextInt();
							} while (tipo <1 && tipo>2);
							
							System.out.println("Saldo da Conta: ");
							saldo = leia.nextFloat();
							
							switch(tipo) {
							case 1 -> {
								System.out.println("Limite da Conta Corrente: ");
								limite = leia.nextFloat();
								ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
								cc.visualizar();
								
							}
							
							case 2 -> {
								System.out.println("Aniversário da Conta Poupança: ");
								aniversario = leia.nextInt();
								ContaCorrente cp = new ContaCorrente(0, agencia, tipo, titular, saldo, aniversario);
								cp.visualizar();
							}
							
							}
						
							keyPress();
							break;
						case 2:
							System.out.println("Listar todas as Contas\n\n");
							
							keyPress();
							break;
						case 3:
							System.out.println("Consultar dados da Conta - por número\n\n");
							System.out.println("Número da Conta: ");
							numero = leia.nextInt();
							
							
							
							keyPress();
							break;
							
						case 4:
							
							System.out.println("Atualizar dados da Conta\n\n");
							System.out.println("Número da Conta: ");
							numero = leia.nextInt();
							
							System.out.println("Número da Agencia: ");
							agencia = leia.nextInt();
							
							System.out.println("Nome do Titular: ");
							leia.skip("\\R?");
							titular = leia.nextLine();
							
							
						//	tipo = 0;
							
							do {
							System.out.println("Tipo da Conta (1-CC / 2 - CP: ");
							tipo = leia.nextInt();
							} while (tipo <1 && tipo>2);
							
							System.out.println("Saldo da Conta: ");
							saldo = leia.nextFloat();
							
							switch(tipo) {
							case 1 -> {
								System.out.println("Limite da Conta Corrente: ");
								limite = leia.nextFloat();
								ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
								cc.visualizar();
								
							}
							
							case 2 -> {
								System.out.println("Aniversário da Conta Poupança: ");
								aniversario = leia.nextInt();
								ContaCorrente cp = new ContaCorrente(0, agencia, tipo, titular, saldo, aniversario);
								cp.visualizar();
							}
							
							}
						 
							
							
							
							keyPress();
							break;
							
							
						case 5:
							System.out.println("Apagar a Conta\n\n");
							System.out.println("Número da Conta: ");
							numero = leia.nextInt();
							
							
							keyPress();
							break;
							
							
						case 6:
							System.out.println("Saque\n\n");
							
							System.out.println("Número da Conta: ");
							numero = leia.nextInt();
							
							System.out.println("Valor do saque: ");
							valor = leia.nextFloat();
							
							
							keyPress();
							break;
							
							
						case 7:
							System.out.println("Depósito\n\n");
							
							System.out.println("Número da Conta: ");
							numero = leia.nextInt();
							
							System.out.println("Valor do saque: ");
							valor = leia.nextFloat();
							
							
							
							keyPress();
							break;
						case 8:
							System.out.println("Transferência entre Contas\n\n");
							
							System.out.println("Número da Conta - Origem: ");
							numero = leia.nextInt();
							
							System.out.println("Número da Conta - Destino: ");
							numeroDestino = leia.nextInt();
							
							System.out.println("Valor da Transferencia: ");
							valor = leia.nextFloat();
							
							
							
							keyPress();
							break;
						default:
							System.out.println("\nOpção Inválida!\n");
							
							keyPress();
							break;
					}
				}
			}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		


	}

	}
}

	

