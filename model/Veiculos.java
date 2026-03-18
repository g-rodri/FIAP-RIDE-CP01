package br.com.fiapride.model;

public class Veiculos {

	private String individuo;
	private String placa;
	private int gasolina;
	
	public Veiculos(String individuo, String placa) {
		this.individuo = individuo;
		this.placa = placa;
		this.gasolina = 0;
	}
	
	public String getIndividuo() {
		return this.individuo;
	}
	
	private void setIndividuo(String individuo) {
		if (individuo != null) {
			this.individuo = individuo;
		} else {
			System.out.println("Por favor insira characteres validos");
		}
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	private void setPlaca(String placa) {
	    int limite = 8; // Exemplo para placas padrão Mercosul
	    if (placa != null && placa.length() > limite) {
	        this.placa = placa.substring(0, limite);
	    } else {
	        this.placa = placa;
	    }
	}
	
	public int getGasolina(int gasolina) {
		return this.gasolina;
	}
	
	private void setGasolina(int gasolina) {
		if (gasolina > 0 ) {
		this.gasolina = gasolina;
	} else {
		System.out.println("O veiculo não pode ter gasolina negativa");
		}
	}

	public void adicionarGasolina(int valor) {
		if (valor > 0) {
			gasolina = gasolina + valor;
			System.out.println("Você abasteceu : " + valor);
		} else {
			System.out.println("Selecione um valor valido");
		}
	}
	
	public void gastarGasolina(int valor) {
		if (valor < 0) {
			gasolina = gasolina - valor;
			System.out.println("Gasolina restante : " + gasolina);
		} else {
			System.out.println("Selecione um valor valido");
		}
	}
}

