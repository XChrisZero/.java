public class Cliente {


    // Propriedades
    private String nome;
    private String datNasc;
    private String genero;

    // Metodos Construtores
    public Cliente(String nome, String datNasc, String genero) {
        this.nome = nome;
        this.datNasc = datNasc;
        this.genero = genero;
    }

    //metodos GETTERS para PEGAR os dados privados
    public String getnome(){

        return this.nome;

    }

    // metodos SETTERS para MUDAR os dados privados
    public void setnome(String nome){

        this.nome = nome;

    }


}
