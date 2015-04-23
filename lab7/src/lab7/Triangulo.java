package lab7;

public class Triangulo extends Forma {
	int base;
	int altura;
	
	Triangulo(int pos_xArg, int pos_yArg, int baseArg, int alturaArg){
		super(pos_xArg, pos_yArg);
		base = baseArg;
		altura = alturaArg;
	}

	@Override
	int[] Interseccao(int y) {
		// TODO Auto-generated method stub
		return null;
	}
}
