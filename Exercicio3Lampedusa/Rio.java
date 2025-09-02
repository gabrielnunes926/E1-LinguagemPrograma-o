
package Exercicio3Lampedusa;
public class Rio {
    String coloraçao;
    float densidade;
    String comprimentoMetros;
    
    public void molhar(){
        System.out.println("Se nao tomar cuidado, voce pode ser molhado pelo rio");
    }
    
    public static void main(String []args){
        Rio rio = new Rio();
        
        rio.coloraçao = "Azulado";
        rio.comprimentoMetros = "400 metros";
        rio.densidade = 1540.77f;
        
        System.out.println("O rio esta " + rio.coloraçao);
        System.out.println("Seu comprimento eh de " + rio.comprimentoMetros);
        System.out.println("Sua densidade eh de " + rio.densidade + "mg³");
        
        rio.molhar();
    }
}
