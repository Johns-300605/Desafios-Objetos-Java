import java.util.ArrayList;
import java.util.List;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}

class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null; 
    }

    public void removerContato(String nome) {
        contatos.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }

    public void listarContatos() {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }
}

public class Contado {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        Contato contato1 = new Contato("João", "1234-5678");
        Contato contato2 = new Contato("Maria", "9876-5432");
        Contato contato3 = new Contato("Pedro", "5555-1212");

        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);
        agenda.adicionarContato(contato3);

        System.out.println("Lista de contatos:");
        agenda.listarContatos();

        System.out.println("\nBuscando contato por nome (Maria):");
        Contato contatoEncontrado = agenda.buscarContato("Maria");
        if (contatoEncontrado != null) {
            System.out.println(contatoEncontrado);
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println("\nRemovendo contato (João):");
        agenda.removerContato("João");

        System.out.println("\nLista de contatos após remoção:");
        agenda.listarContatos();
    }
}