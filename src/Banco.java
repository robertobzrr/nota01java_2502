public class Banco {

            double saldo = 1000;
            double deposito;
            double novoSaldo;
            double saque;
            double transfer;


        public double novoDeposito(double saldo, double deposito){
            return novoSaldo = saldo + deposito;
        }

        public double novoSaque(double saldo, double saque){
            if (saldo > 0){
                return novoSaldo = saldo - saque;
            }else{
                System.out.println("saldo insuficiente");
                return saldo;
            }
        }

        public double novaTransfer(double saldo, double transfer){
            return novoSaldo = saldo - transfer;

        }



}
