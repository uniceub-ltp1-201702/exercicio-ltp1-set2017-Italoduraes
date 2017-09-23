import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	
	//Atributos
	
	private ArrayList<InfoPessoais> infoPessoais;
	private ArrayList<Empresa> empresa;
	private ArrayList<RestoDaInfoPessoais> restoDaInfoPessoais;
	
	public BDSimulado(){
		
		//Instanciando as listas
		this.infoPessoais = new ArrayList<InfoPessoais>();
		this.empresa = new ArrayList<Empresa>();
	
		
		
		//Criando informações Pessoais
		// LocalDate.of(Ano , Mês , Dia);
		
		InfoPessoais I1= new InfoPessoais("Maria Joaquina", LocalDate.of(1996, 3, 24), "Feminino", "Brasilia", "DF");
		InfoPessoais I2= new InfoPessoais("Mateus José", LocalDate.of(1985, 8, 30), "Masculino", "Rio de Janeiro", "RJ");
		InfoPessoais I3= new InfoPessoais("Amanda Silva", LocalDate.of(1986, 5, 11), "Feminino", "São Paulo", "SP");
		InfoPessoais I4= new InfoPessoais("Joaquin Da Silva", LocalDate.of(1990, 11, 15), "Masculino", "Amazonas",  "AM");
		InfoPessoais I5= new InfoPessoais("Zezé da mamãe",LocalDate.of(1975, 12, 21), "Masculino", "São Paulo", "SP");
		InfoPessoais I6= new InfoPessoais("Italo Durães", LocalDate.of(1950, 7, 12), "Masculino", "São Paulo", "SP");
		InfoPessoais I7= new InfoPessoais("Jordy Da Silva", LocalDate.of(2000, 3, 5), "Masculino", "Amazonas",  "AM");
		InfoPessoais I8= new InfoPessoais("Karine Alvará", LocalDate.of(1994, 3, 1), "Feminino", "Rio de Janeiro",  "RJ");
		InfoPessoais I9= new InfoPessoais("Bruno Castro", LocalDate.of(1955, 2, 18), "Masculino", "Brasilia", "DF");
		InfoPessoais I10= new InfoPessoais("Lucas Darboza", LocalDate.of(1999, 1, 19), "Masculino", "Rio de Janeiro", "DF");
		
		RestoDaInfoPessoais r1 = new RestoDaInfoPessoais("email", "maria@maria.com");
		RestoDaInfoPessoais r2 = new RestoDaInfoPessoais("fixo", "55667878898");
		
		
		
		
		
		I1.addRestoInfoPessoais(r1);
		I1.addRestoInfoPessoais(r2);
		
		// Add
				this.infoPessoais.add(I1);
				this.infoPessoais.add(I2);
				this.infoPessoais.add(I3);
				this.infoPessoais.add(I4);
				this.infoPessoais.add(I5);
				this.infoPessoais.add(I6);
				this.infoPessoais.add(I7);
				this.infoPessoais.add(I8);
				this.infoPessoais.add(I9);
				this.infoPessoais.add(I10);
		
	}

	public ArrayList<InfoPessoais> getInfoPessoais() {
		return infoPessoais;
	}

	public ArrayList<Empresa> getEmpresa() {
		return empresa;
	}

	public ArrayList<RestoDaInfoPessoais> getRestoDaInfoPessoais() {
		return restoDaInfoPessoais;
	}
	

	
	
	
	
	
 
 
 
		
		


}
