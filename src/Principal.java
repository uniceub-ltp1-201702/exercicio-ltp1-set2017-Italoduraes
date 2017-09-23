import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciar o BDSimulado
		
				BDSimulado bds= new BDSimulado();
				
				//Instanciar a lista de filmes e usuarios
				ArrayList<InfoPessoais> infoPessoais = bds.getInfoPessoais();
				ArrayList<Empresa> empresa = bds.getEmpresa();	
				ArrayList<RestoDaInfoPessoais> restoDaInfoPessoais = bds.getRestoDaInfoPessoais();
				
				
				
				
	}

}
