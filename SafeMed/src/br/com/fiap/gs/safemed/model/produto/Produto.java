package br.com.fiap.gs.safemed.model.produto;

public class Produto {

	// Atributos
	private String id, nome, descricao;
	protected int quantidadeEstoque;
	private boolean fragil;
	
	// Construtores
	public Produto(String id, String nome, String descricao, int quantidadeEstoque, boolean fragil) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.fragil = fragil;
	}
		
	public Produto(String id, String nome, int quantidadeEstoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	// Getters e Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public boolean isFragil() {
		return fragil;
	}

	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}
	
}