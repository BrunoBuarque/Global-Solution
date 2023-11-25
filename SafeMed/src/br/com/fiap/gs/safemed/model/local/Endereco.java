package br.com.fiap.gs.safemed.model.local;

import br.com.fiap.gs.safemed.exception.*;

public class Endereco {

	// Atributos
	private String logradouro, bairro, cidade, estado, cep, referencia;
	private int numero;

	// Construtores
	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
	}

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep,
			String referencia) {
		this(logradouro, numero, bairro, cidade, estado, cep);
		this.referencia = referencia;
	}

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	// Validar Campos vazios
	 private void validarCampoVazio(String valor, String nomeCampo) {
	        if (valor == null || valor.trim().isEmpty()) {
	            throw new CampoVazioException(nomeCampo + "Campo vazio, preencha corretamente a informação pedida.");
	        }
	    }
	
	// Exibir o Endereço Completo
	 public String formatarEndereco() {
	        validarCampoVazio(logradouro, "Logradouro");
	        validarCampoVazio(bairro, "Bairro");
	        validarCampoVazio(cidade, "Cidade");
	        validarCampoVazio(estado, "Estado");
	        validarCampoVazio(cep, "CEP");
	        validarCampoVazio(referencia, "Referência");
	        return logradouro + " Nº" + numero + ", " + bairro + " - " + cidade + "/" + estado + " - " + cep + " ("
	                + referencia + ")";
	    }

	
	// Getters e Setters
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
