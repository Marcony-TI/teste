package Revisão.exercio5;

public abstract class Forma implements IForma {
    public void mostrarDados() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}

