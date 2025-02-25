import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        //trabalhando com Escopos(são espaços usados para determinar cada tarefa)
        // parenteses - tupla ou conjunto de dados
        String nome = "José";
        System.out.println("Olá meu nome é " + nome);
        System.out.println("---------------");

        // colchetes - indica a criação ou acesso a uma coleção de dados
        String[] frutas = {"maçã", "mamão", "melão"};

        // chaves - SEMPRE! indicam blocos de execuções
        if (10 > 9)
        {
            System.out.println("Dez é maior que nove");
            System.out.println("--------------------");

        }

        //Trabalhando com Condicionais
        boolean temCredito = true; // variavel NUNCA inicia com maiuscula
        if(temCredito) // não está comparando por que o boolean na linha 20 ja é a comparação.
        {
            System.out.println("Pode passar pela catraca!");
            System.out.println("-------------------------");

        }

        // Usando IF ELSE
        int idade = 29; // digite sua idade aqui
        if(idade >= 18)
        {
            System.out.println("Sim! você está podendo tirar a CNH");
            System.out.println("----------------------------------");

        }
        else
        {
            System.out.println("Não pode dirigir!");
            System.out.println("-----------------");

        }

        // IF, ELSE e ELSE IF
        String corSinal = "!"; // digite a cor desejada
        if(corSinal.equals("RED!") )
        {
            System.out.println("Stop!!!");
        }
        else if(corSinal.equals("YELLOW!"))
        {
            System.out.println("Atention!!!");
        }
        else
        {
            System.out.println("GO");
            System.out.println("-----------------");
        }

        //Criando Arrays
        String[] marcas = {"JAC", "BYD", "FERRARI", "BMW"}; // numera sempre começando por ZERO! no caso o Ford é ele
        System.out.println(marcas[0]);
        System.out.println("-------------------------");

        //Acessar um inesistente quebra o app
        // System.out.println(marcas[10]); ex

        //Imprimir o array inteiro
        System.out.println(Arrays.toString(marcas));

        // LOOPS
        //FOR - Repetir um numero de vezes
        for(int iterador = 0; iterador < 5; iterador++) // iterador pode ser abreviado para "i"
        {
            System.out.println("Repita até 5");

        }
        System.out.println("------------");

        // for each (para cada elemento) sómente para arrays
        for(String umadeCadaVez : marcas) // os dois pontos |:| só é usado dentro do FOR EACH
        {
            System.out.println(umadeCadaVez);
        }

        // WHILE Ctrl+/  e grifar o que quer comentar que ele comenta multi linha
//        boolean aguaMolhada = true;
//
//        while (aguaMolhada)
//        {
//            System.out.println("a agua é molhada");
//        }
        System.out.println("----------------------");

        // Condição de parada
        boolean sinalVerde = true;
        int numVoltas = 0;

        while (sinalVerde && numVoltas <= 10)
        {
            System.out.println("Estamos na volta: " + numVoltas);
            numVoltas++;
        }
        System.out.println("----------------------");
        System.out.println("----------------------");
    }

}
