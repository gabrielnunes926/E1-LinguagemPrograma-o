
package Exercicio2;
public class Moto {
    String cor;
    String marca;
    int peso;
    
    public void correr(){
        System.out.println("Kawasaki corre muito rapido");  
    }
    
    public static void main(String []args){
        
        Moto moto = new Moto();
        moto.cor = "Azul";
        moto.marca = "Kawasaki";
        moto.peso = 188;
        
        System.out.println("A moto tem a cor " + moto.cor);
        System.out.println("A marca dela eh " + moto.marca);
        System.out.println("E seu peso eh de " + moto.peso + "kg");
        
        moto.correr();
    }
}
