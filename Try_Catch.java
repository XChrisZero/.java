public class Main {

    public static void main(String[] args) {

            System.out.println("Tratamentos: ");

        System.out.println("--- Inicio do app ---");
        System.out.println(" ");


        try{

            int[] numerosP = {2, 4, 6, 8};

            System.out.println(numerosP[4]);

        }
        catch(ArrayIndexOutOfBoundsException umaExc){

            System.out.println(umaExc);

        }

        try{

        int divisao = 10/0;


        }
        catch(ArithmeticException myChoice){

            System.out.println(myChoice);

        }



        System.out.println(" ");
        System.out.println("--- Fim do app ---");

    }
}
