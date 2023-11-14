package br.gov.go.sefaz.tabelaHash;

public class Lista {
	No inicio; //Ponteiro para o inicio da lista
	int tamanho; // Tamanho da lista
	
	public void inserir(Contato info) {
		No no = new No();  // Cria um No
		no.info = info;    // Atribui a informação ao NO
		no.proximo = inicio; // O ponteiro próximo do no inserido aponta para o inicio
		inicio = no; // O inicio passa a ser esse novo no
		tamanho++; // incrementa o tamanho
	}
	
	public Contato buscar(int codigo) {
		No no = inicio;  // vai para o inicio da lista
		while(no != null) {  // Enquanto o no não for nulo
			if(no.info.codigo == codigo) { // Se o codigo do no for igual ao parametro passado
				return no.info; // retorna a informação do tipo Codigo
			}
			no = no.proximo;   // Vai para o próximo no
		}
		return null;
	}
	
	public String toString() {   
		String out = "";    //Cria uma String vazia para retorno
		No no = inicio;   // Vai para o inicio da lista 
		while(no != null) { // Enquanto o no for diferente de nulo
			out += no.info + " "; // Adiciona a String a informação
			no = no.proximo;  // Vai para o próximo no
		}
		return out; //Retorna a String 
	}
}
