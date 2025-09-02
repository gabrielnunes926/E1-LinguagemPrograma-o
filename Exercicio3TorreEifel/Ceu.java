
package Exercicio3TorreEifel;
public class Ceu {
    String estaçaoAno;
    String Coloraçao;
    int qntNuvens;
    
    public void chover(){
        System.out.println("Quando o ceu esta fechado, eh sinal de que vai chover");
    }
    
      public static void main(String []args){
          Ceu ceu = new Ceu();
          
          ceu.estaçaoAno = "Verao";
          ceu.Coloraçao = "Azul claro";
          ceu.qntNuvens = 30;
          
          System.out.println("A estacao do ano eh " + ceu.estaçaoAno);
          System.out.println("A coloracao do ceu eh " + ceu.Coloraçao);
          System.out.println("A quantidade de nuvens sao de " + ceu.qntNuvens + " nuvens");
          
          ceu.chover();
      }
}
