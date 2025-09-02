
package Exercicio3Lampedusa;
public class Barco {
    String material;
    String cor;
    String tamanho;
    
    public void flutuar(){
        System.out.println("A maior funçao do barco eh flutuar");
    }
    
    public static void main(String []args){
        Barco barco = new Barco();
        
        barco.material = "Papel";
        barco.cor = "Branco";
        barco.tamanho = "2 metros";
        
        System.out.println("O material do barco eh de " + barco.material);
        System.out.println("Sua cor eh " + barco.cor);
        System.out.println("O tamanho do barco eh de " + barco.tamanho);
        barco.flutuar();
    }
}
