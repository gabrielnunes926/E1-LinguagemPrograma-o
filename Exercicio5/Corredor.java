
package Exercicio5;
public class Corredor {
    String arma;
    String montaria;
    String cabelo;
    
    public void cavalgar(){
        System.out.println("Ele esta cavalgando");
    }
    
    public void correr(){
        System.out.println("O corredor esta correndo");
    }
    
    public void assustar(){
        System.out.println("Em cima do porco, ele assusta muita gente");
    }
    
     public static void main(String []args){
         Corredor corredor = new Corredor();
         
         corredor.arma = "Martelo";
         corredor.montaria = "Porco";
         corredor.cabelo = "Moicano";
         
         System.out.println("Arma: " + corredor.arma);
         System.out.println("Montaria: " + corredor.montaria);
         System.out.println("Cabelo: " + corredor.arma);
         
         corredor.assustar();
         corredor.cavalgar();
         corredor.correr();
     }
}
