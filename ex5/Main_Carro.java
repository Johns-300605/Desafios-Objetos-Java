import java.util.Scanner;

public class Main_Carro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = null;

        while (true) {
            System.out.println("\n1. Criar um novo carro");
            System.out.println("2. Acelerar o carro");
            System.out.println("3. Frear o carro");
            System.out.println("4. Exibir informações do carro");
            System.out.println("5. Sair\n");

            System.out.print("\nEscolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Placa: ");
                    String placa = scanner.nextLine();

                    carro = new Carro(marca, modelo, ano, placa);
                    System.out.println("Carro criado com sucesso!");
                    break;

                case 2:
                    if (carro == null) {
                        System.out.println("Crie um carro primeiro!");
                        break;
                    }
                    System.out.print("Incremento de velocidade: ");
                    int incremento = scanner.nextInt();
                    carro.acelerar(incremento);
                    break;

                case 3:
                    if (carro == null) {
                        System.out.println("Crie um carro primeiro!");
                        break;
                    }
                    System.out.print("Decremento de velocidade: ");
                    int decremento = scanner.nextInt();
                    carro.frear(decremento);
                    break;

                case 4:
                    if (carro == null) {
                        System.out.println("Crie um carro primeiro!");
                        break;
                    }
                    System.out.println("Marca: " + carro.getMarca());
                    System.out.println("Modelo: " + carro.getModelo());
                    System.out.println("Ano: " + carro.getAno());
                    System.out.println("Placa: " + carro.getPlaca());
                    System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}