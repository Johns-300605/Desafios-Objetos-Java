import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha entre (1)Soma (2)Subtração (3)Multiplicação (4)Divisão ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                calculadora.calcularSoma();
                break;
            case 2:
                calculadora.calcularSubtracao();
                break;
            case 3:
                calculadora.calcularMultiplicacao();
                break;
            case 4:
                calculadora.calcularDivisao();
                break;
            default:
                System.out.println("Número Inválido!");
                break;
        }
        leitor.close();
    }
}
