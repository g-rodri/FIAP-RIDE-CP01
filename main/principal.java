package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Sistem de veiculos!");
		Veiculos veiculo1 = new Veiculos ("Roberto", "ABC-1234");
		veiculo1.adicionarGasolina(50);
		veiculo1.gastarGasolina(10);
	
	}

}
