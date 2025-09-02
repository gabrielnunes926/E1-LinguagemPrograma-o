package Exercicio2;



public class Mulher {
    String nome;
    int telefone;
    String endereço;
    
    public void falar(){
        System.out.println("Ah, vamo na sua");
    }
    
    public static void main(String []args){
        Mulher mulher = new Mulher();
        mulher.nome = "Viviane";
        mulher.telefone = 5892;
        mulher.endereço = "Vaz de lima";
        
        System.out.println(mulher.nome);
        System.out.println(mulher.telefone);
        System.out.println(mulher.endereço);
        
        mulher.falar();
    }
}
