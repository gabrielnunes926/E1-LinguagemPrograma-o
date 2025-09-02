
package Exercicio3TorreEifel;
public class Vegetaçao {
    String especie;
    int qntArvore;
    int qntanimais;
    
    public void nascer(){
        System.out.println("Existe muita vegetaçao na imagem");
    }
    
    public static void main(String []args){
        Vegetaçao vegetaçao = new Vegetaçao();
        
        vegetaçao.especie = "Jardim";
        vegetaçao.qntArvore = 60;
        vegetaçao.qntanimais = 0;
        
        System.out.println("A especie, sao arvores de " + vegetaçao.especie);
        System.out.println("Existem aproximadamente " + vegetaçao.qntArvore + " arvores");
        System.out.println("E um total de " + vegetaçao.qntanimais + " animais");
        
        vegetaçao.nascer();
    }
}
