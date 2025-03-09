import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Matematica mat = new Matematica();
        Produto p = new Produto();
        Banco b = new Banco();




        int i = 0;

        do {
            System.out.println("========== Lista Nota 01 - Java ==========\n");
            System.out.println("\n-> Escolha o exercício que deseja avaliar:\n   [1] --- Exercício 01\n   [2] --- Exercício 02\n   [3] --- Exercício 03\n   [4] --- Exercício 04");
            int num = sc.nextInt();
            sc.nextLine();


            switch (num) {
                case 1:
                    System.out.println("1) Defina uma classe Aluno que faça o cadastro do nome e das 3 notas e a operação do cálculo\n" +
                            "da média. Ao final, exiba (na classe principal) a média. Em seguida, informe se ele está\n" +
                            "aprovado, reprovado ou na final. Se a média for >= 70 está aprovado, abaixo de 40 está\n" +
                            "reprovado, senão, está na final.");

                    System.out.println("Vamos cadastrar seu Perfil para tirar sua média\n\n  - Digite seu nome: ");
                    a.nome = sc.nextLine();

                    System.out.println("Digite a primeira nota: ");
                    a.nota1 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a segunda nota: ");
                    a.nota2 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Digite a terceira nota: ");
                    a.nota3 = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("\n" +a.nome+ ", sua média é: "+a.calculoMedia(a.nota1, a.nota2, a.nota3));

                    if (a.media >= 7){
                        System.out.println("Você está aprovado, parabens!");

                    }else if(a.media >= 4){
                        System.out.println("Você está na final, foque para passar!");

                    }else {
                        System.out.println("Você foi reprovado, estude mais próximo ano!");
                    }
                    break;


                case 2:
                    System.out.println("2) Defina um sistema onde o usuário informe (na classe principal, através do teclado) qual\n" +
                            "opção deseja visualizar. Caso informe 1 ele vai ver a soma de dois números. Caso informe\n" +
                            "2, vai ver a subtração, 3 divisão e 4 multiplicação. Observação: Estas operações deverão\n" +
                            "ser realizadas em uma classe chamada Matemática.");

                    System.out.println("\n -> Vamos acessar a calculadora! Escolha a operação que deseja usar.\n  - [1] Adição\n  - [2] Subtração\n  - [3] Divisão\n  - [4] Multiplicação");
                    int subOpcao01 = sc.nextInt();
                    sc.nextLine();

                    switch (subOpcao01){
                        case 1:
                            System.out.println(" -> Vamos fazer uma adição:\n  - Digite o primeiro número: ");
                            mat.n1 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Digite o segundo número: ");
                            mat.n2 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Resultado da soma = "+mat.soma(mat.n1, mat.n2));
                            break;


                        case 2:
                            System.out.println(" -> Vamos fazer uma subtração:\n  - Digite o primeiro número: ");
                            mat.n1 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Digite o segundo número: ");
                            mat.n2 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Resultado da subtração = "+mat.sub(mat.n1, mat.n2));
                            break;


                        case 3:
                            System.out.println(" -> Vamos fazer uma divisão:\n  - Digite o primeiro número: ");
                            mat.n1 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Digite o segundo número: ");
                            mat.n2 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Resultado da divisão = "+mat.div(mat.n1, mat.n2));
                            break;


                        case 4:
                            System.out.println(" -> Vamos fazer uma multiplicação:\n  - Digite o primeiro número: ");
                            mat.n1 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Digite o segundo número: ");
                            mat.n2 = sc.nextDouble();
                            sc.nextLine();

                            System.out.println("Resultado da multiplicação = "+mat.multi(mat.n1, mat.n2));
                            break;
                    }
                    break;


                case 3:
                    System.out.println("3) Crie uma classe chamada Produto que representará um produto com os atributos nome,\n" +
                            "preço e quantidade em estoque. Implemente métodos para adicionar estoque e vender\n" +
                            "unidades do produto. Na classe principal, crie um objeto Produto, realize operações de:" + "\n - [1] Adicionar estoque\n - [2] Vender produtos\n - [3] Exibir estoque");
                    int subOpcao02 = sc.nextInt();


                        switch (subOpcao02){
                            case 1:
                                System.out.println("  - Digite quantos produtos você quer adicionar ao estoque: ");
                                p.addEstoque = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Estoque atualizado, a nova quantidade de estoque é: "+p.calculo_addEstoque(p.quantidadeEstoque, p.addEstoque));
                                break;


                            case 2:
                                System.out.println("  - Digite quantos produtos você quer adicionar ao seu carrinho: ");
                                p.itemCompra = sc.nextInt();
                                sc.nextLine();

                                System.out.println(" -> Valor total: "+p.venderProdutos(p.valor, p.itemCompra));
                                System.out.println("Estoque atualizado, a nova quantidade de banana é: "+p.calculo_subEstoque(p.quantidadeEstoque, p.itemCompra));
                                break;


                            case 3:
                                System.out.println("Estoque atual é: "+p.quantidadeEstoque);
                                break;


                        }
                        break;


                case 4:
                    System.out.println("4) Elabore um programa que simule um sistema bancário de um cliente. Inicialmente o saldo\n" +
                            "está zerado, mas o cliente pode escolher qualquer uma das seguintes opções do menu:");


                    int i1 = 0;
                    do {
                        System.out.println("===================\n       BANCO       \n===================\n[1] Consultar Saldo\n[2] Depositar\n[3] Sacar\n[4] Transferir\n\n[0] Finalizar");
                        int subOpcao03 = sc.nextInt();
                        sc.nextLine();


                        switch(subOpcao03){
                            case 1:
                                System.out.println("===================\n       SALDO       \n===================\nSeu saldo é:\nR$ "+b.saldo);
                                break;


                            case 2:
                                System.out.println("===================\n     DEPOSITAR     \n===================\nDigite o valor\nque deseja\ndepositar: ");
                                b.deposito = sc.nextDouble();
                                sc.nextLine();

                                System.out.println("CONFIRMADO!\n\nSeu novo saldo:\nR$"+b.novoDeposito(b.saldo, b.deposito));
                                break;


                            case 3:
                                System.out.println("===================\n       SAQUE       \n===================\nDigite o valor\nque deseja\nsacar: ");
                                b.saque = sc.nextDouble();
                                sc.nextLine();

                                System.out.println("CONFIRMADO!\n\nSeu novo saldo:\nR$"+b.novoSaque(b.saldo, b.saque));
                                break;


                            case 4:
                                System.out.println("===================\n     TRANSFERIR     \n===================\nDigite o valor\nque deseja\ntransferir: ");
                                b.transfer = sc.nextDouble();
                                sc.nextLine();

                                if (b.saldo > 0 && b.saldo >= b.transfer) {
                                    b.novaTransfer(b.saldo, b.transfer);
                                    System.out.println("Transferência realizada com sucesso!\nSeu novo saldo: " + b.novoSaldo);
                                } else {
                                    System.out.println("Saldo insuficiente");
                                }
                                break;



                        }
                        if (subOpcao03 != 0) {
                            System.out.println("\n\n\n[1] Voltar\n[0] Finalizar");
                            i1 = sc.nextInt();
                            sc.nextLine();
                        } else {
                            i1 = 0;
                        }


                    }while (i1 != 0);
                        System.out.println("end.");



            }


            System.out.println("\n-> Para continuar, digite qualquer número.\n-> Para finalizar aperte [0].");
            i = sc.nextInt();
            sc.nextLine();

        }while (i != 0);

        System.out.println("end.");
        sc.close();


    }


}