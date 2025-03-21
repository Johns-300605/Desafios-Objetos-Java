import java.util.Scanner;

public class calculadora {
    
    static Scanner leitor = new Scanner(System.in);
    
    public static void calcularSoma() {

        System.out.println("Digite o primeiro número: ");
        float n1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = leitor.nextFloat();

        float result = (n1 + n2);
        System.out.println("Resultado da soma: " + result);
    }

    public static void calcularSubtracao() {
        System.out.println("Digite o primeiro número: ");
        float n1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = leitor.nextFloat();

        float result = (n1 - n2);
        System.out.println("Resultado da subtração: " + result);
    }

    public static void calcularMultiplicacao() {
        System.out.println("Digite o primeiro número: ");
        float n1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = leitor.nextFloat();

        float result = (n1 * n2); 
        System.out.println("Resultado da multiplicação: " + result);
    }

    public static void calcularDivisao() {
        float result = 0;
        System.out.println("Digite o primeiro número: ");
        float n1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = leitor.nextFloat();

        if (n1 == 0 || n2 == 0) {
            System.out.println("Divisão com zero não permitida!");
        }else{
            result = (n1 / n2);
        }
  
        System.out.println("Resultado da divisão: " + result);
    }
}
