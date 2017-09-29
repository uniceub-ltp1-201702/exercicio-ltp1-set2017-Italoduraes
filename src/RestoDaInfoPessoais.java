
public class RestoDaInfoPessoais {
	
	private InfoPessoais infoPessoais;
	private String tipo;  // 1 - tel fixo, 2 - celular, 3 - email
	private String valor;
	
	
	// metodos construtor
	public RestoDaInfoPessoais(String tipo, String valor) {
		this.tipo = tipo;
		this.valor = valor;
		this.infoPessoais = infoPessoais;
	}
	
	
	//metodo to String
	
	@Override
	public String toString() {
		return "RestoDaInfoPessoais [infoPessoais=" + infoPessoais + ", tipo=" + tipo + ", valor=" + valor + "]";
	}

	
	
	//metodo get e set
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public InfoPessoais getInfoPessoais() {
		return infoPessoais;
	}
	public void setInfoPessoais(InfoPessoais infoPessoais) {
		this.infoPessoais = infoPessoais;
	}


	
	
	
	
	
	

}
