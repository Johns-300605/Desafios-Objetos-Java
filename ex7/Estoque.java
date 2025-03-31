import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void atualizarProduto(int codigo, String nome, double preco, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
                return;
            }
        }
        System.out.println("Produto com código " + codigo + " não encontrado.");
    }

    public void removerProduto(int codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == codigo) {
                produtos.remove(i);
                return;
            }
        }
        System.out.println("Produto com código " + codigo + " não encontrado.");
    }


    public void gerarRelatorio() {
        System.out.println("\n--- Relatório de Estoque ---");
        double valorTotalEstoque = 0;
        for (Produto produto : produtos) {
            produto.exibirInformacoes();
            valorTotalEstoque += produto.getPreco() * produto.getQuantidade();
            System.out.println("---------------------------");
        }
        System.out.println("Valor total em estoque: R$" + valorTotalEstoque);
    }
}