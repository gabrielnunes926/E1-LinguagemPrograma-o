
package Exercicio3Lampedusa;
public class Predio {
    int alturaMetros;
    int larguraMetros;
    String cor;
    
    public void abrigar(){
        System.out.println("Esse predio pode abrigar muitas pessoas");
    }
    
    public static void main(String []args){
        Predio predio = new Predio();
        
        predio.alturaMetros = 15;
        predio.larguraMetros = 10;
        predio.cor = "Marrom";
        
        System.out.println("A altura do predio em metros eh de " + predio.alturaMetros);
        System.out.println("A largura do predio em metros eh de " + predio.larguraMetros);
        System.out.println("A cor do predio eh " + predio.cor);
        
        predio.abrigar();
    }
}
