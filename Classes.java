//inicia a classe
public class Main{
    //inicia o metodo
    public static void main(String[]args){
        //cria o objeto
        Gato g1 = new Gato();
        //adiciona atributos
        g1.nome = "GARFIELD";
        g1.peso = 8;
        g1.idade = 5;
        g1.dados();
        g1.mia();
        
        //cria o objeto
        Cachorro c1 = new Cachorro();
        c1.latir();
        
    }
}

//CLASSE SUPREMA
class Animal{
    String nome;
    float peso;
    int idade;
    void dados(){
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
    }
}

//SUBCLASSE
class Gato extends Animal{
    void mia(){
        System.out.println("miando...............");
    }
}

class Cachorro extends Animal{
    String latir;
    void latir(){
        System.out.println("latindo...............");
    }
}
}
