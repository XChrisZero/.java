import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bitcoin = true;
        int op; // Opções de menu
        float vs, vd; // valor do saque e valor de depósito
        float sc = 0.0f; // Saldo em conta

        Scanner scanner = new Scanner(System.in);
        
        while (bitcoin) {
            System.out.println("\n--------------------Menu Principal:--------------------\n");
            System.out.println("                <- Digite uma opção ->");
            System.out.println("                1- Consulta de saldo.");
            System.out.println("                2- Saque algum valor.");
            System.out.println("                3- Depósitar algum valor.");
            System.out.println("                4- Encerrar transação.");
            op = scanner.nextInt();
            System.out.println("\n-------------------------------------------------------");

            switch (op) {
                case 1: // Consultar o saldo
                    System.out.printf("\n                Seu Saldo atual é: R$ %.2f\n", sc);
                    System.out.println("\n_______________________________________________________");
                    break;

                case 2: // Sacar algum saldo
                    System.out.println("\n                Digite o valor do saque: R$");
                    vs = scanner.nextFloat();
                    System.out.println("\n_______________________________________________________");

                    if (vs <= sc) {
                        sc -= vs; // saldo em conta -= valor do saque
                        System.out.println("\n                Saque feito com sucesso!");
                        System.out.printf("\n                Saldo em conta é R$ %.2f\n", sc);
                        System.out.println("\n_______________________________________________________");
                    } else {
                        System.out.printf("\n                Quantidade insuficiente para saque!\n");
                        System.out.printf("\n                Você possui R$ %.2f na conta\n", sc);
                        System.out.println("\n_______________________________________________________");
                    }
                    break;

                case 3: // Depositar algum saldo
                    System.out.println("\n                Quanto deseja depositar?: R$");
                    vd = scanner.nextFloat();
                    System.out.println("\n_______________________________________________________");

                    sc += vd; // saldo em conta += valor do depósito

                    System.out.println("\n                Depósito realizado com sucesso!");
                    System.out.printf("\n                Saldo em conta é: R$ %.2f\n", sc);
                    System.out.println("\n_______________________________________________________");
                    break;

                case 4: // Encerrar a transação
                    System.out.println("\n                Volte Sempre!");
                    System.out.println("\n_______________________________________________________");
                    bitcoin = false;
                    break;

                default: // Mensagem de erro
                    System.out.println("\n     Opção inválida!!!.");
                    System.out.println("\n    Digite um dos seguintes números 1, 2, 3 ou 4.");
                    System.out.println("\n_______________________________________________________");
            }
        }

        scanner.close();
    }
}
