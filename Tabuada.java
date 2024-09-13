//Importando Biblioteca de entrada de dados
import java.util.Scanner;

//Classe principal sendo publicada
public class Main {
    
    //Método q inicia o java
    public static void main(String[] args){
        //Cria o objeto para ler oq o usuario digita
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um Numero: ");

        //Declara a variavel numero
        int numero = scanner.nextInt();


        System.out.println("Tabuada do " +numero+ ":");
        //Cria o loop ate o 10
        for (int i = 0; i <=10; i++){
            //fala q o resultado é a variavel multiplicada pelo o valor q o usuario digitou
            int resultado = numero * i;
            //Onde colocamos string e variavel no mesmo print(Usar o '+')
            System.out.println(numero + "X" + i + "=" + resultado);
        }
        scanner.close();
    }
}
