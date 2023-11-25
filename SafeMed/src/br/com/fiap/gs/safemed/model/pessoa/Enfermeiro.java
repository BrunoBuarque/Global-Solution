package br.com.fiap.gs.safemed.model.pessoa;

import br.com.fiap.gs.safemed.model.data.Data;
import br.com.fiap.gs.safemed.model.local.Endereco;
import br.com.fiap.gs.safemed.exception.*;

public class Enfermeiro extends Pessoa {

	// Atributos
	private String coren;

	// Construtores
	public Enfermeiro(String nomeCompleto, String genero, Contato contato, Endereco endereco, Data dataNascimento,
			Documentos documentos, String coren) {
		super(nomeCompleto, genero, contato, endereco, dataNascimento, documentos);
		this.coren = coren;
	}

	// Validar Campo Vazio
	private void validarCamposVazios(String valor, String nomeCampo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new CampoVazioException("Campo vazio, preencha corretamente a informação pedida: " + nomeCampo);
        }
    }
	
	// Exibir dados
    @Override
    public String exibirDados() {
        validarCamposVazios(nomeCompleto, "Nome Completo");
        validarCamposVazios(coren, "COREN");
        return nomeCompleto + " (" + coren + ")";
    }
    
	// Getters e Setters
	public String getCoren() {
		return coren;
	}

	public void setCoren(String coren) {
		this.coren = coren;
	}
	
}
