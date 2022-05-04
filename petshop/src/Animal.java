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
    
}
