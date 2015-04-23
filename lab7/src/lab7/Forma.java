package lab7;

public abstract class Forma {
	int pos_x;
	int pos_y;
	
	Forma(int pos_xArg, int pos_yArg){
		pos_x = pos_xArg;
		pos_y = pos_yArg;
	}
	
	abstract int[] Interseccao(int y);
}
