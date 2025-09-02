
package Exercicio4;
public class Celular {
    String marca;
    String sistemaOperacional;
    int qntApp;
    
    public void enviar(){
        System.out.println("Mensagem enviada");
    }
    
    public void excluir(){
        System.out.println("Mensagem apagada");
    }
    
    public void desligar(){
        System.out.println("Celular desligado");
    }
    
    public static void main(String []args){
        Celular celular = new Celular();
        
        celular.marca = "Iphone";
        celular.sistemaOperacional = "IOS";
        celular.qntApp = 9;
        
        System.out.println("A marca do celular eh " + celular.marca);
        System.out.println("O sistema operacional eh " + celular.sistemaOperacional);
        System.out.println("Existem " + celular.qntApp + " aplicativos");
        
        celular.desligar();
        celular.enviar();
        celular.excluir();
    }
}
