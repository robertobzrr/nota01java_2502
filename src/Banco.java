public class Banco {

            double saldo = 0;
            double deposito;
            double novoSaldo;
            double saque;
            double transfer;


        public double novoDeposito(double saldo, double deposito){
            novoSaldo = saldo + deposito;
            return novoSaldo;
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
