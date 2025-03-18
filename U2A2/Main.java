public class Main {
    public static void main(String[] args) {

    //Criando um Obj com auxilio do metodo construtor "()"
        Exemplo exemploA = new Exemplo("Esse é um texto de exemplo");
        System.out.println(exemploA.textoExemplo);

        //Fazendo o do Cliente GETTERS usando o getnome
        Cliente ClienteA = new Cliente("Christian", "29/01/95", "Masc");
        System.out.println(ClienteA.getnome()); // usando o get do clinete com nome para ser usado

        //System.out.print(ClienteA.datNasc);   //dados privados que n podem ser acessados
        //System.out.print(ClienteA.genero);    //dados privados que n podem ser acessados

        //SETTER
        ClienteA.setnome("Chris");
        System.out.println(ClienteA.getnome()); // usando o getnome para acessar o novo nome

    }
}