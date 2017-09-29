import java.time.LocalDate;
import java.util.ArrayList;

public class InfoPessoais {
	



	


	private String nome;
    private LocalDate dataNascimento;
    private String sexo;
    private String cidade;
    private String UF;
    private Empresa empresa;
    private ArrayList<RestoDaInfoPessoais> restoDaInfoPessoais;
    
    //metodo construtor
    
	public InfoPessoais(String nome, LocalDate dataNascimento, String sexo, String cidade, String uF) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cidade = cidade;
		UF = uF;
		this.restoDaInfoPessoais = new ArrayList<RestoDaInfoPessoais>();
	}
    
    
	// metodo get e set 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public ArrayList<RestoDaInfoPessoais> getRestoDaInfoPessoais() {
		return restoDaInfoPessoais;
	}


	
	
	
	public void setRestoDaInfoPessoais(ArrayList<RestoDaInfoPessoais> restoDaInfoPessoais) {
		this.restoDaInfoPessoais = restoDaInfoPessoais;
	}

	
	
	
	
    // Data de nascimento
	public String getDataComoString(){
		return dataNascimento.getDayOfMonth() + "/" +
			   dataNascimento.getMonthValue() + "/" +
				dataNascimento.getYear();
	}


	public void addRestoInfoPessoais(RestoDaInfoPessoais mamae) {
		// TODO Auto-generated method stub
		
	}
	

	
    
    
    
    
    
    
}
