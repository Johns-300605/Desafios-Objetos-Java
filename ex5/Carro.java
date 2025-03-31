public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getPlaca() {
        return placa;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(int incremento) {
        this.velocidadeAtual += incremento;
        System.out.println("Acelerando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    public void frear(int decremento) {
        this.velocidadeAtual -= decremento;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
        System.out.println("Freando... Velocidade atual: " + this.velocidadeAtual + " km/h");
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade atual: " + this.velocidadeAtual + " km/h");
    }
}