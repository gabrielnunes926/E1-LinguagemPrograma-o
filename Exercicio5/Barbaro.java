
package Exercicio5;
public class Barbaro {
    String corCabelo;
    String arma;
    String acessorio;
    
    public void atacar(){
        System.out.println("O barbaro foi ao ataque");
    }
    
    public void gritar(){
        System.out.println("O barbaro ataca gritando");
    }
    
    public void babar(){
        System.out.println("O barbaro esta babando");
    }
    
    public static void main(String []args){
        Barbaro barbaro = new Barbaro();
        
        barbaro.corCabelo = "Amarelo";
        barbaro.arma = "Espada";
        barbaro.acessorio = "Pulseira";
        
        System.out.println("Cabelo: " + barbaro.corCabelo);
        System.out.println("Arma: " + barbaro.arma);
        System.out.println("Acessorio: " + barbaro.acessorio);
        
        barbaro.atacar();
        barbaro.babar();
        barbaro.gritar();
    }
}
