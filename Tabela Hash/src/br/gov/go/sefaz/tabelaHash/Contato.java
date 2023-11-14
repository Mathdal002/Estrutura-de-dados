package br.gov.go.sefaz.tabelaHash;

public class Contato {
	int codigo;
	String nome, telefone;
	
	Contato(int codigo, String nome, String telefone){
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String toString() {
		return "(" + codigo + ", " + nome + ")";
	}
}
