public class Cnt_Bank {

        private int cnt_num;
        private String nome_titu;
        private double saldo;


        public Cnt_Bank(int cnt_num, String nome_titu) {
            this.cnt_num = cnt_num;
            this.nome_titu = nome_titu;
            this.saldo = 0.0;
        }

        public int NumeroConta() {
            return cnt_num;
        }

        public String NomeTitular() {
            return nome_titu;
        }

        public double Saldo() {
            return saldo;
        }


        public void Deposito(double dep_valor) {
            if (dep_valor > 0) {
                saldo += dep_valor;
                System.out.println("Depósito de R$" + dep_valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }

        public void Saque(double saq_valor) {
            if (saq_valor > 0 && saq_valor <= saldo) {
                saldo -= saq_valor;
                System.out.println("Saque de R$" + saq_valor + " realizado com sucesso.");
            } else if (saq_valor <= 0) {
                System.out.println("Valor inválido para saque.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }

