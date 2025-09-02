
package Exercicio3TorreEifel;
public class Torre {
    String material;
    int comprimentoMetros;
    int pesoKg;
    
    public void sinalizar(){
        System.out.println("Com essa torre as pessoas podem se localizar");
    }
    
     public static void main(String []args){
         Torre torre = new Torre();
         
         torre.material = "Ferro";
         torre.comprimentoMetros = 330;
         torre.pesoKg = 10100;
         
         System.out.println("A torre eh feita de " + torre.material);
         System.out.println("Ela mede " + torre.comprimentoMetros + " metros");
         System.out.println("A torre pesa " + torre.pesoKg + " kg");
         torre.sinalizar();
     }
}
