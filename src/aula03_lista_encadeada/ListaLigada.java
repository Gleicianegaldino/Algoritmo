package aula03_lista_encadeada;

public class ListaLigada {
	
	private No primeiro;
	private No ultimo;
	private int tamanhoLista;
	
	
	public ListaLigada() {
		this.tamanhoLista = 0;
		
	}
	
	public No getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	public No getUltimo() {
		return ultimo;
	}
	public void setUltimo(No ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanhoLista() {
		return tamanhoLista;
	}
	public void setTamanhoLista(int tamanhoLista) {
		this.tamanhoLista = tamanhoLista;
	}

	public void adicionar(String novoValor) {
		
		//buffer
		No novoNo = new No(novoValor);
		
		if(this.primeiro == null && ultimo == null) {
			this.primeiro = novoNo;
			this.ultimo = novoNo;
			
			
		}else {
			this.ultimo.setProximo(novoNo);
			this.ultimo = novoNo;
		}
		this.tamanhoLista ++;
	}
	
	public void remover(String valorProurado) {
		//meio
		No anterior = null;
		
		No atual = this.primeiro;
		for(int i = 0; i < this.getTamanhoLista(); i++) {
			//if pra encontrar o elemento
			if (atual.getValor().equalsIgnoreCase(valorProurado)) {
				
				if (this.tamanhoLista == 1) {
					this.primeiro = null;
					this.ultimo = null;
							
				} //remover o primeiro
				else if(atual == primeiro ) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
					
					//remover o ultimo
				}else if(atual ==ultimo){
					this.ultimo = anterior;
					anterior.setProximo( null);
					
				}else {
				
					anterior.setProximo(atual.getProximo());
					atual = null;
					
				}
				//remover tbm o tamanho da lista pra atualizar quando remover um elemento.
				this.tamanhoLista--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();

		}
		
	}
	
	public No get (int posicao) {
		//pegar
		//visualizar
		
		No atual = this.primeiro;
		
		for(int i =0; i < posicao; i++) {
			if(atual.getProximo()!= null) {
				atual = atual.getProximo();
			}
		}
		
		return atual;
		
	}
}
