package br.com.fiap.gs.safemed.model.pessoa;

import br.com.fiap.gs.safemed.exception.*;

public class Contato {

	// Atributos
	private String telefone, email;

	// Cosntrutores
	public Contato(String telefone) {
		super();
		this.telefone = telefone;
	}

	public Contato(String telefone, String email) {
		super();
		this.telefone = telefone;
		this.email = email;
	}

	// Validar campos vazios
    private void validarCampoVazio(String valor, String nomeCampo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new CampoVazioException("Campo vazio, preencha corretamente a informação pedida: " + nomeCampo);
        }
    }
	
	// Exibir Telefone e Email
    public String exibirContato() {
        validarCampoVazio(telefone, "Telefone");
        validarCampoVazio(email, "E-mail");
        return "Telefone: " + telefone + "\nE-mail: " + email;
    }

	// Getters e Setters
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
