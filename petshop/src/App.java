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
        String nome_a, nome_d, cpf, data;
        Boolean sts = false;
        int aux;

        //Novo objeto da classe ultilitarios
        Utilitarios util = new Utilitarios();

        //Usamos o metodo Scanner para o usuario ter liberdades das entradas :)
        Scanner entrada1 = new Scanner(System.in);

        //Novo objeto da classe Animal
        Animal animal1 = new Animal();

        //Nosso Petshop só tem um atendente, no caso é o francisco :)
        animal1.setAtendente("Francisco");

        //Instaciondo a colecao passando o contrato para a relação da interface
        ContratoAnimal colecao = new ColecaoAnimal();

        //Metodo 2 de entrada para setar os parametros do obejto animal1
        Scanner entrada2 = new Scanner(System.in);

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
                    colecao.historicoAnimal(animal1);
                    break;
                case "2":
                    //Solicita ao usuario todas as informações do PET
                    System.out.print("Nome do animal: ");
                    nome_a = entrada2.nextLine();
                    System.out.print("Nome do dono: ");
                    nome_d = entrada2.nextLine();
                    System.out.print("CPF do dono: ");
                    cpf = entrada2.nextLine();
                    System.out.print("Data de atendimento: ");
                    data = entrada2.nextLine();
                    System.out.print("Atendimento \n [1] Aberto [2] Fechado \n --> ");
                    aux = entrada2.nextInt();
                    //Se 1: Atendimento aberto; Se 2: Atendimento fechado
                    if (aux == 1){
                        sts = true;
                        animal1.setNome_animal(nome_a);
                        animal1.setNome_dono(nome_d);
                        animal1.setCPF_dono(cpf);
                        animal1.setData_atendimento(data);
                        animal1.setSts_atendimeto(sts);

                        colecao.cadastrarAnimal(animal1);
                        break;
                    } else if (aux == 2){
                        sts = false;
                        animal1.setNome_animal(nome_a);
                        animal1.setNome_dono(nome_d);
                        animal1.setCPF_dono(cpf);
                        animal1.setData_atendimento(data);
                        animal1.setSts_atendimeto(sts);

                        colecao.cadastrarAnimal(animal1);
                        break;
                    } else {
                        System.out.println("Entrada invalida para atendimento! ");
                        break;
                    }
                case "3":
                    colecao.atualizarAnimal(animal1);

                default:
                    System.out.println("Entrada invalida para menu!");
                    break;               
            }

        }

        entrada2.close();
        entrada1.close();
    }
}
