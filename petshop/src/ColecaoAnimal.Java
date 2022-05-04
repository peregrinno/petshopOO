import java.util.*;

public class ColecaoAnimal implements ContratoAnimal{

    ArrayList<Animal> meusAnimais = new ArrayList<Animal>();

    Scanner entrada2 = new Scanner(System.in);

    
    @Override
    public void cadastrarAnimal(Animal a) {
        meusAnimais.add(a);
        System.out.println("Animais cadastrados com sucesso!");
    }

    @Override
    public void historicoAnimal(Animal a) {
        String aux_sts; 
        System.out.println("HISTÓRICO");
        for(int i = 0; i < meusAnimais.size(); i++){
            if (a.getSts_atendimento() == true){
                aux_sts = "Aberto";
            } else {
                aux_sts = "Fechado";
            }
            System.out.println("========================"+"\n" +
                                "ANIMAL #" + i +"\n" + 
                                "Nome do animal: "+ a.getNome_animal() + "\n" +
                                "Nome do dono: " + a.getNome_dono() + "\n" +
                                "CPF: " + a.getCPF() + "\n" +
                                "Atendente reponsavel" +a.getAtendente() + "\n" +
                                "Status: " + aux_sts + "\n" + 
                                "Data: " + a.getData_atendimento());

        }
        
    } 

    @Override
    public void atualizarAnimal(Animal a) {
        System.out.println("Informe o cpf do dono: ");
        a.setCPF_dono(entrada2.nextLine());
        

        Scanner atualiza = new Scanner(System.in);

        int att_sts;
        String aux_sts;

        for(int i = 0; i < meusAnimais.size(); i++){
            if (a.getSts_atendimento() == true){
                aux_sts = "Aberto";
            } else {
                aux_sts = "Fechado";
            }
            if(meusAnimais.contains(a)){
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