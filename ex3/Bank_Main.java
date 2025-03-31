import java.util.Scanner;
public class Bank_Main{

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Cnt_Bank conta = null;

            while (true) {
                System.out.println("\n--- Sistema Bancário ---");
                System.out.println("1. Criar Conta");
                System.out.println("2. Depositar");
                System.out.println("3. Sacar");
                System.out.println("4. Consultar Saldo");
                System.out.println("5. Sair");
                System.out.print("\nEscolha uma opção: ");

                int opcao = scan.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("\nNúmero da conta: ");
                        int numeroConta = scan.nextInt();
                        System.out.print("\nNome do titular: ");
                        scan.nextLine();
                        String nomeTitular = scan.nextLine();
                        conta = new Cnt_Bank(numeroConta, nomeTitular);
                        System.out.println("\nConta criada com sucesso!");
                        break;
                    case 2:
                        if (conta != null) {
                            System.out.print("\nValor do depósito: ");
                            double valorDeposito = scan.nextDouble();
                            conta.Deposito(valorDeposito);
                        } else {
                            System.out.println("\nConta não criada! Crie uma conta primeiro.");
                        }
                        break;
                    case 3:
                        if (conta != null) {
                            System.out.print("\nValor do saque: ");
                            double valorSaque = scan.nextDouble();
                            conta.Saque(valorSaque);
                        } else {
                            System.out.println("\nConta não criada! Crie uma conta primeiro.");
                        }
                        break;
                    case 4:
                        if (conta != null) {
                            System.out.println("Saldo da conta: R$" + conta.Saldo());
                        } else {
                            System.out.println("Conta não criada! Crie uma conta primeiro.");
                        }
                        break;
                    case 5:
                        System.out.println("Saindo do sistema...");
                        scan.close();
                        return;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
    }

