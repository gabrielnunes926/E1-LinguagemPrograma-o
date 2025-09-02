
package Exercicio4;
public class Homem {
    String corCamisa;
    double altura;
    String corCalça;
    
    public void pintar(){
        System.out.println("O homem esta pintando");
    }
    
    public void colorir(){
        System.out.println("O homem esta colorindo");
    }
    
    public void agir(){
        System.out.println("O homem esta se movendo");
    }
    
    public static void main(String []args){
        Homem homem = new Homem();
        
        homem.corCamisa = "Cinza";
        homem.corCalça = "Azul";
        homem.altura = 1.75f;
        
        System.out.println("A camiseta do homem eh da cor " + homem.corCamisa);
        System.out.println("A calça do homem eh da cor " + homem.corCalça);
        System.out.println("A altura do homem eh " + homem.altura + " metros");
        
        homem.agir();
        homem.colorir();
        homem.pintar();
    }
}
