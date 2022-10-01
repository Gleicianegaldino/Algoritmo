package aula02_vetor;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		String[] estados = new String[10];
		estados[0] = "AC";
		estados[1] = "PE";
		estados[2] = "BA";
		estados[3] = "CE";
		estados[4] = "SP";
		estados[5] = "AM";
		estados[6] = "MS";
		estados[7] = "RN";
		estados[8] = "DF";
		estados[9] = "AP";
		
		for (int i = 0; i < estados.length; i++ ) {
			System.out.print("Estados " + i + ": " + estados[i] + "\n");
		}
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("DIGITE A SIGLA DO ESTADO PARA A BUSCA");
		String siglaBusca = leitor.nextLine();
		
		//BUSCA LINEAR
		
		boolean encontrou = false;
		
		for(int i = 0; i < estados.length; i++) {
			String elemento = estados[i];
			
			if(elemento.equalsIgnoreCase(siglaBusca)) {
				encontrou = true;
				break;
			}
		}
		
		if (encontrou == true) {
			System.out.println("ENCONTROU");
		}else {
			System.out.println("NÃO ENCONTROU");
		}
	}
}
