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
	    this.restoDaInfoPessoais = new ArrayList<RestoDaInfoPessoais>();
		
		
		// Criando  empresas 
		
		Empresa e1= new Empresa("Corporação do mal", "1254874984.4848", "Rio de Janeiro", "RJ");
		Empresa e2= new Empresa("Jujú", "55454585844.4554", "Brasilia", "DF");
		Empresa e3= new Empresa("Banco do Brasil", "5465454544.6546", "São Paulo", "SP");	
		
		
		//Add empresas	
		
		this.empresa.add(e1);
		this.empresa.add(e2);
		this.empresa.add(e3);				
		
		//Criando informações Pessoais
		// LocalDate.of(Ano , Mês , Dia);
		
		InfoPessoais I1= new InfoPessoais("Maria Joaquina", LocalDate.of(1996, 3, 24), "Feminino", "Brasilia", "DF", e1 );
		InfoPessoais I2= new InfoPessoais("Mateus José", LocalDate.of(1985, 8, 30), "Masculino", "Rio de Janeiro", "RJ", e1);
		InfoPessoais I3= new InfoPessoais("Amanda Silva", LocalDate.of(1986, 5, 11), "Feminino", "São Paulo", "SP", e2);
		InfoPessoais I4= new InfoPessoais("Joaquin Da Silva", LocalDate.of(1990, 11, 15), "Masculino", "Amazonas",  "AM", e3);
		InfoPessoais I5= new InfoPessoais("Zezé da mamãe",LocalDate.of(1975, 12, 21), "Masculino", "São Paulo", "SP", e1);
		InfoPessoais I6= new InfoPessoais("Italo Durães", LocalDate.of(1950, 7, 12), "Masculino", "São Paulo", "SP", e2);
		InfoPessoais I7= new InfoPessoais("Jordy Da Silva", LocalDate.of(2000, 3, 5), "Masculino", "Amazonas",  "AM", null);
		InfoPessoais I8= new InfoPessoais("Karine Alvará", LocalDate.of(1994, 3, 1), "Feminino", "Rio de Janeiro",  "RJ", e3);
		InfoPessoais I9= new InfoPessoais("Bruno Castro", LocalDate.of(1955, 2, 18), "Masculino", "Brasilia", "DF", e2);
		InfoPessoais I10= new InfoPessoais("Lucas Darboza", LocalDate.of(1999, 1, 19), "Masculino", "Rio de Janeiro", "DF",e3);
		
		
		// Add os contatos
		
		RestoDaInfoPessoais r1 = new RestoDaInfoPessoais("email", "maria@maria.com");
		RestoDaInfoPessoais r2 = new RestoDaInfoPessoais("fixo", "55667878898");
        RestoDaInfoPessoais r3 = new RestoDaInfoPessoais("celular", "32569874");
		RestoDaInfoPessoais r4 = new RestoDaInfoPessoais("celular", "85411236");
		RestoDaInfoPessoais r5 = new RestoDaInfoPessoais("email", "Mateusjj@gmail.com");
		RestoDaInfoPessoais r6 = new RestoDaInfoPessoais("email", "Mateus09@hotmail.com");
		RestoDaInfoPessoais r7 = new RestoDaInfoPessoais("fixo", "15698524");
		RestoDaInfoPessoais r8 = new RestoDaInfoPessoais("celular", "15695844");
		RestoDaInfoPessoais r9 = new RestoDaInfoPessoais("celular", "52456985");
		RestoDaInfoPessoais r10 = new RestoDaInfoPessoais("email", "Amandayhg@gmail.com");
		RestoDaInfoPessoais r11= new RestoDaInfoPessoais("celular", "25659555");
		RestoDaInfoPessoais r12= new RestoDaInfoPessoais("celular", "23655656");
		RestoDaInfoPessoais r13= new RestoDaInfoPessoais("email", "italolevels@hotmail.com");
		RestoDaInfoPessoais r14= new RestoDaInfoPessoais("celular", "84552698");
		RestoDaInfoPessoais r15= new RestoDaInfoPessoais("fixo", "254789336");
		RestoDaInfoPessoais r16= new RestoDaInfoPessoais("celular", "85269354");
		RestoDaInfoPessoais r17= new RestoDaInfoPessoais("celular", "45112254");
		RestoDaInfoPessoais r18= new RestoDaInfoPessoais("fixo", "852145698");
		RestoDaInfoPessoais r19= new RestoDaInfoPessoais("email", "brunocastro@hotmail.com");
		RestoDaInfoPessoais r20= new RestoDaInfoPessoais("fixo", "54876321");
		RestoDaInfoPessoais r21 = new RestoDaInfoPessoais("email", "Lucassales@gmail.com");
		
		// lingando as pessoas com seus contatos 
		I1.addRestoInfoPessoais(r1);
		I1.addRestoInfoPessoais(r2);
		I1.addRestoInfoPessoais(r3);
		I1.addRestoInfoPessoais(r4);
		I2.addRestoInfoPessoais(r5);
		I2.addRestoInfoPessoais(r6);
		I2.addRestoInfoPessoais(r7);
		I2.addRestoInfoPessoais(r8);
		I2.addRestoInfoPessoais(r9);
		I3.addRestoInfoPessoais(r10);
		I3.addRestoInfoPessoais(r11);
		I4.addRestoInfoPessoais(r12);
		I6.addRestoInfoPessoais(r13);
		I6.addRestoInfoPessoais(r14);
		I7.addRestoInfoPessoais(r15);
		I7.addRestoInfoPessoais(r16);
		I7.addRestoInfoPessoais(r17);
		I8.addRestoInfoPessoais(r18);
		I9.addRestoInfoPessoais(r19);
		I9.addRestoInfoPessoais(r20);
		I10.addRestoInfoPessoais(r21);
		
		
		// Add informações pessoais
		
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
	

	
	
	
	
	// QUESTÃO 3
	
     public ArrayList<InfoPessoais> getDadosGeral (){
    	 
    	 ArrayList<InfoPessoais> resultado = new ArrayList<InfoPessoais>();
    	 
    	 for (int i = 0; i <this.infoPessoais.size(); i++) {
			resultado.add(this.infoPessoais.get(i));
		}
    	 
    	 
    	 return resultado;
     }
	
    // QUESTÃO 4) retorne todos os contatos de uma determinada uf
 
        public ArrayList<InfoPessoais> getBuscarUF (String UF){
        	
        	ArrayList<InfoPessoais> resultado = new ArrayList<InfoPessoais>();
        	
        	for (int i = 0; i <this.infoPessoais.size(); i++) {
				if (this.infoPessoais.get(i).getUF().equals(UF)) {
					resultado.add(this.infoPessoais.get(i));
				}
			}        	
        	return resultado;
        }
		
		
     // QUESTÃO 5)   contatos que comece com nomes “A”
         
        public ArrayList<InfoPessoais> getBuscarPorLetra (String letra) {

    		ArrayList<InfoPessoais> resultado = new ArrayList<InfoPessoais>();
    		
    		for (int i = 0; i < this.infoPessoais.size(); i++) {
    			if (this.infoPessoais.get(i).getNome().substring(0, 1).equals(letra)) {
    				resultado.add(this.infoPessoais.get(i));
    			}
    		}

    		return resultado;
    	}
        
        
        //  QUESTÃO 6 retorne  contatos de uma determinada empresa e que seja sexo "Femino"
    
        public ArrayList<InfoPessoais> getEmprasaSoFeminino (String empresa) {

    		String Sexo = "Feminino";
    		
    		ArrayList<InfoPessoais> resultado = new ArrayList<InfoPessoais>();
    		
    		for (int i = 0; i < this.infoPessoais.size(); i++) {
    			if (this.infoPessoais.get(i).getSexo().equals(Sexo) && this.infoPessoais.get(i).getEmpresa().getNome().equals(empresa)) {
    				resultado.add(this.infoPessoais.get(i));
    			}
    		}
    		return resultado;
    	}
        
        
        // QUESTÃO 7 retorne uma lista com os contatos que estão cadastrados na empresa
            
        public ArrayList<Empresa> getFuncionariosDaEmpresa() {

    		ArrayList<Empresa> resultado = new ArrayList<Empresa>();
    		
    		for (int i = 0; i < this.empresa.size(); i++) {
    			resultado.add(this.empresa.get(i));
    		}
    		return resultado;
    	}

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        


}
