import java.util.*;

public class ColecaoAnimal implements ContratoAnimal{
    ArrayList<Animal> meusAnimais = new ArrayList<Animal>();

    Scanner entrada2 = new Scanner(System.in);

    public void cadastrarAnimal(Animal a) { 
        meusAnimais.add(a);
        System.out.println("Animal cadastrado com sucesso!\n Total até o momento: " + meusAnimais.size()+ "\n");
        
    }

    public void chamaHistorico(){
        historicoAnimal(meusAnimais);
    }

    public void historicoAnimal(ArrayList<Animal> lista) {
        for(Animal item: lista){
            System.out.println(item.toString());
        }
    } 

    public void atualizarAnimal(Animal a) {
        Scanner atualiza = new Scanner(System.in);

        int att_sts;
        String aux_sts, aux_cpf;

        System.out.println("Informe o cpf do dono: ");
        aux_cpf = entrada2.nextLine();

        for(int i = 0; i < meusAnimais.size(); i++){
            if (a.getSts_atendimento() == true){
                aux_sts = "Aberto";
            } else {
                aux_sts = "Fechado";
            }
            if(meusAnimais.contains(a.getCPF_())){
                System.out.println("========================"+"\n" +
                                    "ANIMAL #" + i +"\n" + 
                                    "Nome do animal: "+ a.getNome_animal() + "\n" +
                                    "Nome do dono: " + a.getNome_dono() + "\n" +
                                    "CPF: " + a.getCPF() + "\n" +
                                    "Atendente reponsavel: " +a.getAtendente() + "\n" +
                                    "Status: " + aux_sts + "\n" + 
                                    "Data: " + a.getData_atendimento());
                System.out.print("Mudar Status de atendimento [1] Aberto [2] Fechado: ");
                att_sts = atualiza.nextInt();
                if (att_sts == 1){
                    a.setSts_atendimeto(true); 
                }else {
                    a.setSts_atendimeto(false); 
                }
            } else {
                System.out.println("Animal não encontrado.");
            }
        }
        atualiza.close();
        entrada2.close();
    }
}