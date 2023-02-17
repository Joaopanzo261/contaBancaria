package contaBancaria;

import java.util.Scanner;

import contaBancaria.model.contaBancaria;
import contaBancaria.util.Cores;

public class Menu_contaBancaria {

	public static void main(String[] args) {
		

				Scanner leia = new Scanner(System.in);
				
				// criamos objeto conta c1
				contaBancaria c1 = new contaBancaria(1, 123, 1, "Erica Araújo", 30000.0f);
				
				// Visualizamos os dados da conta c1
				c1.visualizar();
				
				//bAlteramos o saldo da conta c1
				c1.setSaldo(35000);
				System.out.println("\n\n" + c1.getSaldo());
				
				
				contaBancaria c2 = new contaBancaria(2, 123, 1, " João Panzo", 30000.0f);
				
			
				c2.visualizar();
				
				// Efetuamos um saque na conta c2 e visualizamos o novo saldo
				if (c2.sacar(1000.0f))
					System.out.println("\n\n" + c2.getSaldo());
				
				
				// Efetuamos deposito na conta c1
				c1.depositar(10000.0f);
				
				// Visualizamos os dados da conta c1 após o deposito
				c1.visualizar();
				
				int opcao;

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

							break;
						case 2:
							System.out.println("Listar todas as Contas\n\n");

							break;
						case 3:
							System.out.println("Consultar dados da Conta - por número\n\n");

							break;
						case 4:
							System.out.println("Atualizar dados da Conta\n\n");

							break;
						case 5:
							System.out.println("Apagar a Conta\n\n");

							break;
						case 6:
							System.out.println("Saque\n\n");

							break;
						case 7:
							System.out.println("Depósito\n\n");

							break;
						case 8:
							System.out.println("Transferência entre Contas\n\n");

							break;
						default:
							System.out.println("\nOpção Inválida!\n");
							break;
					}
				}
			}

}

	
