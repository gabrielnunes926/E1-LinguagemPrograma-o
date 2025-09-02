
package Exercicio4;
public class Cachorro {
    String raça;
    String cor;
    double peso;
    
    public void latir(){
        System.out.println("O cachorro esta latindo");
    }
    
    public void dormir(){
        System.out.println("O cachorro esta dormindo");
    }
    
    public void correr(){
        System.out.println("O cachorro esta correndo");
    }
    
    public static void main(String []args){
        Cachorro cachorro = new Cachorro();
        
        cachorro.raça = "Vira lata";
        cachorro.cor = "Branco";
        cachorro.peso = 12.5f;
        
        System.out.println("O cachorro eh um " + cachorro.raça);
        System.out.println("O cachorro eh " + cachorro.cor);
        System.out.println("O cachorro pesa " + cachorro.peso + " kg");
        
        cachorro.correr();
        cachorro.dormir();
        cachorro.latir();
    }
}
