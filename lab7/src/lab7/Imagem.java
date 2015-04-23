package lab7;

import java.util.Arrays;
import java.util.LinkedList;

public class Imagem {
	LinkedList <Forma> formas = new LinkedList <Forma>();
	int altura;
	int largura;
		
	public Imagem(int alturaArg, int larguraArg){
		altura = alturaArg;
		largura = larguraArg;
	}
	
	String linha(int yArg){
		char[] str = new char[largura];
		int[] res;
		
		Arrays.fill(str,' ');
		
		for (Forma f : formas) {
			res = f.Interseccao(yArg);
			if(res != null){
				for (int i = 0; i < res.length; i++) {
					str[res[i]] = '*';
				}
			}
		}
		
		return new String(str);
	}
	
	public void adicionarForma(Forma fArg){
		formas.add(fArg);
	}

	@Override
	public String toString() {
		String todas = new String();
		
		for(int j = 0; j < altura; j++){
			todas += linha(j) + '\n';
			//System.out.println(linha(j));
		}
		//System.out.println(todas);
		return todas;
	}
	
	
}
