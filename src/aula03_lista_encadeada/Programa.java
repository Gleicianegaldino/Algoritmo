package aula03_lista_encadeada;

public class Programa {
	
	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		lista.adicionar("AC");
		lista.adicionar("PE");
		lista.adicionar("CE");
		lista.adicionar("DF");
		
		System.out.println("TAMANHO: " + lista.getTamanhoLista());
		System.out.println("PRIMEIRO: " + lista.getPrimeiro().getValor());
		System.out.println("ULTIMO: " + lista.getUltimo().getValor());

		for(int i = 0; i < lista.getTamanhoLista(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		
		lista.remover("CE");
		System.out.println("removeu ce");
		lista.adicionar("GLE");
		System.out.println("adicionou gg");
		
		//remover
		lista.remover("AC");
		lista.remover("PE");
		lista.remover("DF");
		lista.remover("GLE");

		
		System.out.println("TAMANHO ATUAL:" + lista.getTamanhoLista());
		
		for(int i = 0; i < lista.getTamanhoLista(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		//System.out.println(lista.getTamanhoLista());
		
	}

}
