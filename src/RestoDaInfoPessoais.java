
public class RestoDaInfoPessoais {
	
	
	
	private String tipo;  // 1 - tel fixo, 2 - celular, 3 - email
	private String valor;
	
	
	public RestoDaInfoPessoais(String tipo, String valor) {
		this.tipo = tipo;
		this.valor = valor;
	}
	
	//metodo to String
	
	@Override
	public String toString() {
		return "RestoDaInfoPessoais [tipo=" + tipo + ", valor=" + valor + "]";
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
	

	
	
	
	
	
	
	

}
