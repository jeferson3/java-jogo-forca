package br.com.forca.logica;

import java.util.ArrayList;
public class Lista {
	
	private ArrayList<Palavra> lista = new ArrayList<>();
	

	public ArrayList<Palavra> getLista() {
		return this.lista;
	}

	public void gerarNovaPalavra(String nome, String dica) {
		Palavra p = new Palavra();
		
		if(nome !="" && dica !="" ) {
			p.setNome(nome);
			p.setDica(dica);
			this.lista.add(p);			
		}
	}


	
	

}
