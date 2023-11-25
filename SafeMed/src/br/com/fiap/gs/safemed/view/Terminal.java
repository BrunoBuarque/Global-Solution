package br.com.fiap.gs.safemed.view;

import javax.swing.JOptionPane;

import br.com.fiap.gs.safemed.model.data.*;

import br.com.fiap.gs.safemed.model.pessoa.*;
import br.com.fiap.gs.safemed.model.produto.*;

public class Terminal {

	public static void main(String[] args) {
		
		// Usuário insere nome de medicamento e identificação
		String medicamento = JOptionPane.showInputDialog("Insira o medicamento a ser retirado:");
		String crm = JOptionPane.showInputDialog("Insira seu CRM (apenas números):");
	
		// Instanciar um novo medicamento
		Produto med = new Produto("25219195", medicamento, 274);
		
		// Instanciar um novo usuário
		Medico medico = new Medico ("Lucas Oliveira Santos", crm);
		
		med.setQuantidadeEstoque(med.getQuantidadeEstoque() - 1);
		
		// Instanciar uma hora
		Hora hora = new Hora(17, 23, 33);
		
		// Instanciar um dia
		Data data = new Data(3, 9, 2022);

		// Prints do Terminal
		System.out.println("=======================================================");
		System.out.println("Produto Retirado..: " + medicamento + " (id " + med.getId() + ")");
		System.out.println("Estoque Atual.....: " + med.getQuantidadeEstoque());
		System.out.println("Retirado Por......: " + medico.getNomeCompleto() + " (CRM " + crm + ")");
		System.out.println("Data de Retirada..: " + data.retornarData() + " (" + hora.retornarHora() + ")");
		System.out.println("=======================================================");
	}
}
