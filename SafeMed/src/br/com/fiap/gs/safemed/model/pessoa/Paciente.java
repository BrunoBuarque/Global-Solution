package br.com.fiap.gs.safemed.model.pessoa;

import br.com.fiap.gs.safemed.model.data.*;
import br.com.fiap.gs.safemed.model.local.Endereco;
import br.com.fiap.gs.safemed.exception.*;

public class Paciente extends Pessoa{

	// Atributos
	private int id;
	private String prontuario, tipoSanguineo;
	
	// Construtores
	public Paciente(String nomeCompleto, String genero, Contato contato, Endereco endereco, Data dataNascimento,
			Documentos documentos, int id, String prontuario) {
		super(nomeCompleto, genero, contato, endereco, dataNascimento, documentos);
		this.id = id;
		this.prontuario = prontuario;
	}
	
	public Paciente(String nomeCompleto, String genero, Documentos documentos, int id, String prontuario) {
		super(nomeCompleto, genero, documentos);
		this.id = id;
		this.prontuario = prontuario;
	}

	//Validar campos vazios
    private void validarCamposVazios(String valor, String nomeCampo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new CampoVazioException("Campo vazio, preencha corretamente a informação pedida: " + nomeCampo);
        }
    }
	
	// Exibir Prontuario
    public String exibirProntuario() {
        validarCamposVazios(nomeCompleto, "Nome Completo");
        validarCamposVazios(tipoSanguineo, "Tipo Sanguíneo");
        return nomeCompleto + " (" + tipoSanguineo + ")\nIdentificação do Paciente: " + id + "\nProntuário:\n"
                + prontuario;
    }
	
	// Getters e Setters
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProntuario() {
		return prontuario;
	}
	
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	
}
