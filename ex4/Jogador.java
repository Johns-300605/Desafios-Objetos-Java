public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Guilherme", 100, 1);
        Jogador jogador2 = new Jogador("Isabella", 250, 2);

        System.out.println("Informações do Jogador 1: ");
        jogador1.exibirInformacoes();

        System.out.println("Informações do Jogador 2: ");
        jogador2.exibirInformacoes();

        jogador1.aumentarPontuacao(50);
        jogador1.subirNivel();
        jogador2.aumentarPontuacao(100);

        System.out.println("\nInformações atualizadas do Jogador 1:");
        jogador1.exibirInformacoes();

        System.out.println("\nInformações atualizadas da Jogadora 2:");
        jogador2.exibirInformacoes();
    }
}
