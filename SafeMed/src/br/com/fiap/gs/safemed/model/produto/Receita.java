package br.com.fiap.gs.safemed.model.produto;

import br.com.fiap.gs.safemed.model.pessoa.*;

public class Receita {

	private String receita;
	private Medico nome, crm;
	
	public Receita(String receita, Medico nome, Medico crm) {
		super();
		this.receita = receita;
		this.nome = nome;
		this.crm = crm;
	}

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}

	public Medico getNome() {
		return nome;
	}

	public void setNome(Medico nome) {
		this.nome = nome;
	}

	public Medico getCrm() {
		return crm;
	}

	public void setCrm(Medico crm) {
		this.crm = crm;
	}
	
	
	
	
}
