import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciar o BDSimulado
		
				BDSimulado bds= new BDSimulado();
							
				
			//   QUEST�O 3
				
			System.out.println("------------QUEST�O 3 ----------\n");	
				
				ArrayList<InfoPessoais> infoPessoais = bds.getDadosGeral();
				
				for (int i = 0; i < infoPessoais.size(); i++) {
					System.out.println(infoPessoais.get(i).toString());
				}
				
				
		//  QUEST�O 4
				
		System.out.println("----------QUEST�O 4-----------\n");
				
			ArrayList<InfoPessoais> BuscarUF = bds.getBuscarUF("SP");
			
			for (int i = 0; i <BuscarUF.size(); i++) {
				System.out.println(BuscarUF.get(i));
			}
				
			
			
		// QUEST�O 5
			
			System.out.println("----------QUEST�O 5-----------\n");
			
			ArrayList<InfoPessoais> BuscarPorletra = bds.getBuscarPorLetra("J");

			for (int i = 0; i < BuscarPorletra.size(); i++) {
				System.out.println(BuscarPorletra.get(i));

			}
			
			
		//  QUEST�O 6
			
			System.out.println("---------------- Quest�o 6 ----------------");
			
			ArrayList<InfoPessoais> EmprasaSoFeminino = bds.getEmprasaSoFeminino("Banco do Brasil");
				
			for (int i = 0; i <EmprasaSoFeminino.size(); i++) {
				System.out.println(EmprasaSoFeminino.get(i));
			}
			
			
		//   QUEST�O 7

			System.out.println("---------------- Quest�o 7 ----------------");
			
			ArrayList<Empresa> QtdPessoaEmpresa = bds.getFuncionariosDaEmpresa();
		
			for (int i = 0; i < QtdPessoaEmpresa.size(); i++) {
				System.out.println(QtdPessoaEmpresa.get(i).getNome());
						

			}
			
			
			
			
			
			
			
			
	}

}
