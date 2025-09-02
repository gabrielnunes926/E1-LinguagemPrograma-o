
package Exercicio5;
public class Arqueira {
    String corCabelo;
    String arma;
    int qntFlechas;
    
    public void correr(){
        System.out.println("A arqueira esta correndo");
    }
    
    public void atirar(){
        System.out.println("A arqueira esta atirando flechas");
    }
    
    public void mirar(){
        System.out.println("A arqueira esta mirando");
    }
    
    public static void main(String []args){
        Arqueira arqueira = new Arqueira();
        
        arqueira.corCabelo = "Rosa";
        arqueira.arma = "Arco";
        arqueira.qntFlechas = 7;
        
        System.out.println("O cabelo da arqueira eh " + arqueira.corCabelo);
        System.out.println("Sua arma eh um " + arqueira.arma);
        System.out.println("Flechas: " + arqueira.qntFlechas);
        
        arqueira.atirar();
        arqueira.correr();
        arqueira.mirar();
    }
}
