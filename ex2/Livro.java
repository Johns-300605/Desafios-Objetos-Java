public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicação) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        System.out.println("Informações do livro 1:");
        livro1.exibirInfo();

        System.out.println("Informações do livro 2:");
        livro2.exibirInfo();

        System.out.println("Informações do livro 3:");
        livro3.exibirInfo();
    }
}
