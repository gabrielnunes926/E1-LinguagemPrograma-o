
package Exercicio2;
public class Malandro {
    String estilo;
    String penteado;
    String joias;
    
    public void viajar(){
        System.out.println("Ele gosta de viver e viajar, sem medo de morrer sem medo de arriscar");
                
    }
    
    public static void main(String []args){
        
        Malandro malandro = new Malandro();
        malandro.estilo = "Artista";
        malandro.penteado = "Escovinha";
        malandro.joias = "Anel de ouro";
        
        System.out.println( "Tem estilo de " + malandro.estilo);
        System.out.println( "Cabelo " + malandro.penteado);
        System.out.println(malandro.joias + " Combinando com as corrente");
        
        malandro.viajar();
    
    }
};
