package br.com.fiap.gs.safemed.model.pessoa;

import br.com.fiap.gs.safemed.exception.*;

public class Documentos {

	// Atributos
	private String rg, cpf;

	// Construtores
	public Documentos(String rg, String cpf) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}

	public Documentos(String rg, String cpf, String cnh) {
		super();
		this.rg = rg;
		this.cpf = cpf;
	}

	// Validar Campos vazios
    private void validarCamposVazios(String valor, String nomeCampo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new CampoVazioException("Campo vazio, preencha corretamente a informação pedida: " + nomeCampo);
        }
    }

    // Exibir RG e CPF
    public String exibirDocumentos() {
        validarCamposVazios(rg, "RG");
        validarCamposVazios(cpf, "CPF");
        return "RG: " + rg + "\nCPF: " + cpf;
    }
    
	// Getters e Setters
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
