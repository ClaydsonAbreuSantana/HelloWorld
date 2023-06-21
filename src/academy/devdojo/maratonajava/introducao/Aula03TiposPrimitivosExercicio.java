package academy.devdojo.maratonajava.introducao;



/*      Crie Variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensage
*
* Eu <nome>, morando no endereçe <endereço>
    confirmo que recebi o salario de <salario>, na data <data>
* */
public class Aula03TiposPrimitivosExercicio {
    public static void main (String[] args){
        String nome = "Claydson";
        String endereco = "Rua Francisco Bento de Oliveira 78";
        double salario = 5000;
        String data = "27/05/2023";

        System.out.println("Eu " + nome + ", morando no endereço "  + endereco + " " +
                "confirmo que recebi o salario de R$ " + salario + ", na data " + data);
    }

}
