package lab7;

public class Rectangulo extends Forma {
	int altura;
	int largura;
	
	public Rectangulo(int pos_xArg, int pos_yArg, int alturaArg, int larguraArg){
		super(pos_xArg, pos_yArg);
		altura = alturaArg;
		largura = larguraArg;
	}

	@Override
	int[] Interseccao(int yArg) {
		int[] interseccao = null;
		
		if(yArg == pos_y || yArg == pos_y + altura-1){
			interseccao = new int[largura];
			for(int i = 0; i < largura; i++){
				interseccao[i] = pos_x + i;
			}
		}
		else if((yArg > pos_y) && (yArg < pos_y + altura-1)){
			interseccao = new int[2];
			interseccao[0] = pos_x;
			interseccao[1] = pos_x+largura-1;
		}
		
		return interseccao;
	}
}
