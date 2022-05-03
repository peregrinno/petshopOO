import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        boolean status_loja = true;
        String entrada_menu;

        Utilitarios util = new Utilitarios();

        Scanner entrada1 = new Scanner(System.in);

        Animal animal1 = new Animal();

        animal1.setNome_animal("Margarete");
        animal1.setCPF_dono("02703004222");
        animal1.setNome_dono("Mooser");
        animal1.setData_atendimento("05/05/2022");


        ContratoAnimal colecao = new ColecaoAnimal();

        colecao.cadastrarAnimal(animal1);

        while (status_loja == true) {
            util.mostraMenu();

            entrada_menu = entrada1.nextLine();

            switch (entrada_menu){
                case "0":
                    System.out.println("Saindo...");
                    break;
                case "1":


            }

        }
        entrada1.close();
    }
}
