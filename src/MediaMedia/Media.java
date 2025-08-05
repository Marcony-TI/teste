package MediaMedia;

public class Media {
    public static void number (Database db) {
        if (db.getNumbers().isEmpty()){
            System.out.println("A lista esta Vazia., não é possível calcular a média");
        }

        int soma = 0;
        for (int i = 0; i < db.getNumbers().size(); i++) {
            soma += db.getNumbers().get(i);
        }
        double media = soma / db.getNumbers().size();
        System.out.println("A média entre " + db.getNumbers());
        System.out.println("é: " + media);
    }
}
