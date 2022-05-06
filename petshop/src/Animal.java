public class Animal{

    private String nome_animal;
    private String cpf_dono;
    private String nome_dono;
    private String atendente;
    private boolean sts_atendimeto;
    private String data_atendimento;

    //metodo construtor inicia vazio :)

    public void setNome_animal(String nome_animal){
        this.nome_animal = nome_animal;
    }

    public void setNome_dono(String nome_dono){
        this.nome_dono = nome_dono;
    }

    public void setAtendente(String atendente){
        this.atendente = atendente;
    }

    public void setCPF_dono(String cpf){
        this.cpf_dono = cpf;
    }

    public void setSts_atendimeto(boolean sts){
        this.sts_atendimeto = sts;
    }

    public void setData_atendimento(String data){
        this.data_atendimento = data;
    }

    public String getNome_animal(){
        return this.nome_animal;
    }

    public String getNome_dono(){
        return this.nome_dono;
    }

    public String getAtendente(){
        return this.atendente;
    }

    public String getCPF(){
        return this.cpf_dono;
    }

    public boolean getSts_atendimento(){
        return this.sts_atendimeto;
    }

    public String getData_atendimento(){
        return this.data_atendimento;
    }

    public String toString(){

        String aux_sts;
        String resultado;

        if (sts_atendimeto == true){
            aux_sts = "Aberto";
        } else {
            aux_sts = "Fechado";
        }

        resultado = String.format("Nome do Animal: %s\n", this.nome_animal) +
                    String.format("Nome do dono..: %s\n", this.nome_dono) +
                    String.format("CPF...........: %s\n", this.cpf_dono) +
                    String.format("Atendente.....: %s\n", this.atendente)+
                    String.format("Status........: %s\n", aux_sts)+
                    String.format("Data..........: %s\n", this.data_atendimento);
        
        return (resultado);
    }
}
