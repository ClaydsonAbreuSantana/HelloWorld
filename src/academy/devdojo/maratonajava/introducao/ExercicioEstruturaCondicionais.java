package academy.devdojo.maratonajava.introducao;

public class ExercicioEstruturaCondicionais {
    public static void main(String[] args) {
        double salarioAnual = 34800;
        double imposto;
        if (salarioAnual <= 34712) {
            imposto = (salarioAnual * 9.70) / 100;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            imposto = (salarioAnual * 37.35) / 100;
        } else {
            imposto = (salarioAnual * 49.50) / 100;
        }

        System.out.println("Seu imposto anual será de  " + imposto + " Euros ");
    }
}
