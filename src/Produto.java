public class Produto {

            String banana;
            double valor = 1.55;
            int quantidadeEstoque = 1000;
            int novoEstoque;
            int addEstoque;
            int itemCompra;
            double valorFinalCompra;



        public double calculo_addEstoque(int quantidadeEstoque, int addEstoque){
            return novoEstoque = quantidadeEstoque + addEstoque;
        }

        public double calculo_subEstoque(int quantidadeEstoque, int itemCompra){
            return novoEstoque = quantidadeEstoque - itemCompra;
        }

        public double venderProdutos(double valor, int itemCompra){
            return valorFinalCompra = itemCompra * valor;
        }



}
