package hospital;

/**
 *
 * @author Gustavo Gonçalves, 2º INFO - ETEC Poá
 */

public class Prontuario 
{
    private String pressArterial; //Pressao arterial
    private int batimentos;       //Batimentos Cardiacos
    private float tempPaciente;   //Temperatura do Paiente
    private String nomePaciente;  //Nome do Paciente
    private int numLeito;         //Numero do Leito do Paciente
    private String tipoSanguineo; //Tipo Sangúineo do Paciente
    private String sexo;          //Sexo do Paciente
    private int idade;            //Idade do Paciente
    private String CPF;           //CPF do Paciente
    
    
    public String getPress(){ return this.pressArterial; }    
    public void setPress(String pressArterial) { this.pressArterial = pressArterial; }

    public int getBatimentos() { return this.batimentos; }
    public void setBatimentos(int batimentos) { this.batimentos = batimentos; }
    
    public float getTemperatura() { return this.tempPaciente; }    
    public void setTemperatura(float tempPaciente) { this.tempPaciente = tempPaciente; }
    
    public String getNome() { return this.nomePaciente; }    
    public void setNome(String nomePaciente) { this.nomePaciente = nomePaciente; }
    
    public int getNumLeito() { return this.numLeito; }
    public void setNumLeito(int numLeito) { this.numLeito = numLeito; }
    
    public String getTipoSanguineo() { return this.tipoSanguineo; }
    public void setTipoSanguineo(String tipoSanguineo) { this.tipoSanguineo = tipoSanguineo; }
    
    public String getSexo() { return this.sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public int getIdade() { return this.idade; }
    public void setIdade(int idade) { this.idade = idade; }
    
    public String getCPF() { return this.CPF; }
    public void setCPF(String CPF) { this.CPF = CPF; }

    public void cadastrar(String pressArterial, int batimentos, float tempPaciente, String nomePaciente, int numLeito, String tipoSanguineo, String sexo, int idade, String CPF)
    {
        this.pressArterial = pressArterial;
        this.batimentos = batimentos;
        this.tempPaciente = tempPaciente;
        this.nomePaciente = nomePaciente;
        this.numLeito = numLeito;
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;
        this.idade = idade;
        this.CPF = CPF;
    }
}
