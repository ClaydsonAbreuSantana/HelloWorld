package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadorComprarBebida = idade>=18;

        if(isAutorizadorComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica ");
        }else{
            System.out.println("Não autorizado  a comprar bebida alcolica ");
        }

        if (!isAutorizadorComprarBebida){
            System.out.println("Não autorizado  a comprar bebida alcolica ");
        }
    }
}
