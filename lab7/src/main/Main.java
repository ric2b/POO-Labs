package main;

import lab7.*;

public class Main {

	public static void main(String[] args) {
		
		Imagem nossaImagem = new Imagem(10,10);
		Rectangulo nossoRectangulo = new Rectangulo(2,2,5,5);
		nossaImagem.adicionarForma(nossoRectangulo);
		
		System.out.println(nossaImagem.toString());
	}	
}
