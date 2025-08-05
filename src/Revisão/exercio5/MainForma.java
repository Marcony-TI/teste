package Revisão.exercio5;

public class MainForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        Retangulo retangulo = new Retangulo(4.0, 6.0);

        System.out.println("== Dados do Círculo ==");
        circulo.mostrarDados();

        System.out.println("\n== Dados do Retângulo ==");
        retangulo.mostrarDados();
    }
}

