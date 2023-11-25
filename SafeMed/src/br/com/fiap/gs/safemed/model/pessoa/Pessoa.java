package br.com.fiap.gs.safemed.model.pessoa;

import br.com.fiap.gs.safemed.model.local.Endereco;
import br.com.fiap.gs.safemed.model.data.Data;
import br.com.fiap.gs.safemed.exception.*;

public class Pessoa {

	// Atributos
	protected String nomeCompleto;
	private String genero;
	private Contato contato;
	private Endereco endereco;
	private Data dataNascimento;
	private Documentos documentos;
	
	// Construtores
	public Pessoa(String nomeCompleto, String genero, Contato contato, Endereco endereco, Data dataNascimento,
			Documentos documentos) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.genero = genero;
		this.contato = contato;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.documentos = documentos;
	}
	
	public Pessoa(String nomeCompleto, String genero, Documentos documentos) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.genero = genero;
		this.documentos = documentos;
	}

	public Pessoa(String nomeCompleto, String genero) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.genero = genero;
	}

	public Pessoa(String nomeCompleto) {
		super();
		this.nomeCompleto = nomeCompleto;
	}

	// Validar Campos Vazios
    private void validarCamposVazios(Object valor, String nomeCampo) {
        if (valor == null) {
            throw new CampoVazioException("Campo vazio, preencha corretamente a informação pedida: " + nomeCampo);
        }
    }
	
    // Exibir Nome e Documentos
    public String exibirDados() {
        validarCamposVazios(nomeCompleto, "Nome Completo");
        validarCamposVazios(dataNascimento, "Data de Nascimento");
        return nomeCompleto + "\n" + getDocumentos().exibirDocumentos();
    }

    // Exibir Telefone e Email
    public String exibirContato() {
        validarCamposVazios(contato, "Contato");
        return getContato().exibirContato();
    }

    // Exibir Endereço Completo
    public String exibirEndereco() {
        validarCamposVazios(endereco, "Endereço");
        return getEndereco().formatarEndereco();
    }
	
	// Getters e Setters
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Data getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Documentos getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}
		
}
