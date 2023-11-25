package br.com.fiap.gs.safemed.model.data;

import br.com.fiap.gs.safemed.exception.*;

public class Data {

	// Atributos
	private String diaSemana;
	private int dia, mes, ano;

	// Construtores
	public Data(String diaSemana, int dia, int mes, int ano) {
		super();
		this.diaSemana = diaSemana;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// Validar o Dia
	public boolean validarDia() {
        if (dia <= 0 || dia > 31) {
            dia = 1;
            throw new DataInvalidaException("Dia inválido. O dia deve estar entre 1 e 31.");
        }
        return true;
    }

    // Validar o Mês
    public boolean validarMes() {
        if (mes <= 0 || mes > 12) {
            mes = 1;
            throw new DataInvalidaException("Mês inválido. O mês deve estar entre 1 e 12.");
        }
        return true;
    }

    // Validar o Ano
    public boolean validarAno() {
        if (ano <= 0) {
            ano = 2023;
            throw new DataInvalidaException("Ano inválido. O ano deve ser maior do que 0.");
        }
        return true;
    }
    
	// Exibir a Data no formato dd/mm/aaaa
	public String retornarData() {
		validarDia();
		validarMes();
		validarAno();
		return dia + "/" + mes + "/" + ano;
	}

	// Getters e Setters
	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
