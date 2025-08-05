package MediaMedia;


import java.util.List;

public class Menu {

    //Atributos da classe
    private int number;

    private Database db = new Database();
    //////////////////////////////////////

    //Getter e Setter do objeto Database
    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }
    //////////////////////////////////////


    public static void exibir() {
        System.out.println("----------Menu---------");
        System.out.println("1- Adicionar número");
        System.out.println("2- Excluir número");
        System.out.println("3- Listar números");
        System.out.println("4- Exibir média dos números na lista");
        System.out.println("5- Sair");
        System.out.println("-----------------------");
        System.out.println("Opção: ");
    }

    public void adicionar(){
        Add.number(number,db);
    }

    public void remover(){
        Remove.number(number, db);
    }

    public static void listaAtual(Database d) {
        System.out.println("Lista atual: " + d.getNumbers());
    }

    public void media(){
        Media.number(db);
    }

}
