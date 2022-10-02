package aula03_lista_encadeada;

public class No {
	
	private String valor;
	private No proximo;
	
	public No (String novoValor){
		this.valor = novoValor;
	}
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	
	
}
