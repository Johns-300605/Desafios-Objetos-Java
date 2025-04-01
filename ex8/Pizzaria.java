import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pizza {
    private String nome;
    private double valor;
    private String ingredientes;

    public Pizza(String nome, double valor, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return nome + " - R$" + valor + " (" + ingredientes + ")";
    }
}

class Pedido {
    Pizza pizza;
        private String tamanho;
        private String endereco;
        boolean cancelado;
        
            public Pedido(Pizza pizza, String tamanho, String endereco) {
                this.pizza = pizza;
                this.tamanho = tamanho;
                this.endereco = endereco;
                this.cancelado = false;
            }
        
            public void cancelarPedido() {
                this.cancelado = true;
            }
        
            @Override
            public String toString() {
                return "Pedido: " + pizza.getNome() + " (" + tamanho + ") - R$" + pizza.getValor() + 
                       "\nEndereço: " + endereco + (cancelado ? " - CANCELADO" : "");
            }
        }
        
        public class Pizzaria {
            private List<Pizza> pizzas = new ArrayList<>();
            private List<Pedido> pedidos = new ArrayList<>();
            private Scanner scanner = new Scanner(System.in);
        
            public Pizzaria() {
                // Adicionando pizzas iniciais
                pizzas.add(new Pizza("Mussarela", 30.0, "Mussarela, tomate, orégano"));
                pizzas.add(new Pizza("Calabresa", 35.0, "Calabresa, cebola, azeitona"));
                pizzas.add(new Pizza("Portuguesa", 40.0, "Presunto, ovo, cebola, azeitona"));
            }
        
            public void adicionarPedido() {
                System.out.println("Pizzas disponíveis:");
                for (int i = 0; i < pizzas.size(); i++) {
                    System.out.println((i + 1) + ". " + pizzas.get(i));
                }
        
                System.out.print("Escolha o número da pizza: ");
                int escolha = scanner.nextInt() - 1;
                scanner.nextLine(); // Consumir a quebra de linha
        
                if (escolha < 0 || escolha >= pizzas.size()) {
                    System.out.println("Opção inválida.");
                    return;
                }
        
                Pizza pizzaEscolhida = pizzas.get(escolha);
        
                System.out.print("Tamanho (P/M/G): ");
                String tamanho = scanner.nextLine();
        
                System.out.print("Endereço de entrega: ");
                String endereco = scanner.nextLine();
        
                pedidos.add(new Pedido(pizzaEscolhida, tamanho, endereco));
                System.out.println("Pedido adicionado com sucesso!");
            }
        
            public void cancelarPedido() {
                System.out.println("Pedidos:");
                for (int i = 0; i < pedidos.size(); i++) {
                    System.out.println((i + 1) + ". " + pedidos.get(i));
                }
        
                System.out.print("Escolha o número do pedido para cancelar: ");
                int escolha = scanner.nextInt() - 1;
                scanner.nextLine(); // Consumir a quebra de linha
        
                if (escolha < 0 || escolha >= pedidos.size()) {
                    System.out.println("Opção inválida.");
                    return;
                }
        
                pedidos.get(escolha).cancelarPedido();
                System.out.println("Pedido cancelado com sucesso!");
            }
        
            public void gerarRelatorio() {
                System.out.println("Relatório de Pedidos:");
                double totalPedidos = pedidos.size();
                double somaPrecos = 0;
        
                for (Pedido pedido : pedidos) {
                    System.out.println(pedido);
                    if (!pedido.cancelado) {
                    somaPrecos += pedido.pizza.getValor();
            }
        }

        System.out.println("\nTotal de pedidos: " + totalPedidos);
        if (totalPedidos > 0) {
            System.out.println("Média de preço dos pedidos: R$" + (somaPrecos / totalPedidos));
        }
    }

    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu da Pizzaria:");
            System.out.println("1. Adicionar pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Gerar relatório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    pizzaria.adicionarPedido();
                    break;
                case 2:
                    pizzaria.cancelarPedido();
                    break;
                case 3:
                    pizzaria.gerarRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}