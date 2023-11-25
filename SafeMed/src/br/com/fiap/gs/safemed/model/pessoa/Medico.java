package br.com.fiap.gs.safemed.model.pessoa;

import br.com.fiap.gs.safemed.model.data.Data;
import br.com.fiap.gs.safemed.model.local.Endereco;
import br.com.fiap.gs.safemed.exception.*;

public class Medico extends Pessoa {

	// Atributos
	private String crm, especialidade;
	
	// Construtores
	public Medico(String nomeCompleto, String genero, Contato contato, Endereco endereco, Data dataNascimento,
			Documentos documentos, String crm, String especialidade) {
		super(nomeCompleto, genero, contato, endereco, dataNascimento, documentos);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	// Validar campos vazios
	private void validarCamposVazios(String valor, String nomeCampo) {
		if (valor == null || valor.trim().isEmpty()) {
			throw new CampoVazioException("Campo vazio, preencha corretamente a informação pedida: " + nomeCampo);
    	}
    }
	
	public Medico(String nomeCompleto, String crm) {
		super(nomeCompleto);
		this.crm = crm;
	}

	// Exibir dados
    @Override
    public String exibirDados() {
    	validarCamposVazios(nomeCompleto, "Nome Completo");
    	validarCamposVazios(crm, "CRM");
        validarCamposVazios(especialidade, "Especialidade");
        return nomeCompleto + " (" + crm + ")\nEspecialidade: " + especialidade;
    }
	
	// Getters e Setters
	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
}
