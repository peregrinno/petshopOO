/*PETSHOP DE OO
    JOSÉ LUAN DA SILVA ARAUJO
    HYDELBRANDA MELO
    PROGRAMAÇÃO ORIENTADA A OBJETOS, 2021.2 - PROFº JORGE FONSECA
    LINGUAGEM JAVA, JA VAI TARDE KKKKKKKKKKKKKKKK
*/
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        
        // Variaveis que serão necessarias para main
        boolean status_loja = true;
        String entrada_menu;

        //Novo objeto da classe ultilitarios
        Utilitarios util = new Utilitarios();

        //Usamos o metodo Scanner para o usuario ter liberdades das entradas :)
        Scanner entrada1 = new Scanner(System.in);

        //Novo objeto da classe Animal
        Animal animal1 = new Animal();

        animal1.setNome_animal("Rex");
        animal1.setNome_dono("Marcos");
        animal1.setCPF_dono("123456");
        //Nosso Petshop só tem um atendente, no caso é o francisco :)
        animal1.setAtendente("Francisco");
        animal1.setSts_atendimeto(true);
        animal1.setData_atendimento("05/04/2022");

        //Instaciondo a colecao passando o contrato para a relação da interface
        ContratoAnimal colecao = new ColecaoAnimal();

        colecao.cadastrarAnimal(animal1);

        /*==============================================================*/

        //Novo objeto da classe Animal
        Animal animal2 = new Animal();

        animal2.setNome_animal("Troinha");
        animal2.setNome_dono("Romulo");
        animal2.setCPF_dono("78910");
        //Nosso Petshop só tem um atendente, no caso é o francisco :)
        animal2.setAtendente("Francisco");
        animal2.setSts_atendimeto(false);
        animal2.setData_atendimento("07/04/2022");

        colecao.cadastrarAnimal(animal2);

        /*==============================================================*/

        //Novo objeto da classe Animal
        Animal animal3 = new Animal();

        animal3.setNome_animal("Margarete");
        animal3.setNome_dono("kkkkkk");
        animal3.setCPF_dono("111213");
        //Nosso Petshop só tem um atendente, no caso é o francisco :)
        animal3.setAtendente("Francisco");
        animal3.setSts_atendimeto(true);
        animal3.setData_atendimento("17/05/2022");

        colecao.cadastrarAnimal(animal3);

        //Loop para perpetua o funcionamento da loja até que o usuario queira sair
        while (status_loja == true) {
            util.mostraMenu();

            entrada_menu = entrada1.nextLine();

            //Escolhe a entrada para navegar no menu
            switch (entrada_menu){
                case "0":
                    System.out.println("Saindo...");
                    status_loja = false;
                    break;
                case "1":
                    colecao.chamaHistorico();
                    break;
                case "2":
                    colecao.atualizarAnimal(animal1);

                default:
                    System.out.println("Entrada invalida para menu!");
                    break;               
            }
        }
        entrada1.close();
    }
}
