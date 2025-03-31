import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Atualizar produto");
            System.out.println("3. Remover produto");
            System.out.println("4. Gerar relatório");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.next();
                    System.out.print("Código do produto: ");
                    int codigo = scanner.nextInt();
                    System.out.print("Preço do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    estoque.adicionarProduto(new Produto(nome, codigo, preco, quantidade));
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Código do produto a atualizar: ");
                    codigo = scanner.nextInt();
                    System.out.print("Novo nome: ");
                    nome = scanner.next();
                    System.out.print("Novo preço: ");
                    preco = scanner.nextDouble();
                    System.out.print("Nova quantidade: ");
                    quantidade = scanner.nextInt();
                    estoque.atualizarProduto(codigo, nome, preco, quantidade);
                    break;
                case 3:
                    System.out.print("Código do produto a remover: ");
                    codigo = scanner.nextInt();
                    estoque.removerProduto(codigo);
                    break;
                case 4:
                    estoque.gerarRelatorio();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}