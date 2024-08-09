package lr3;

public class SquareMatrix extends Matrix {


	
	public SquareMatrix(int a){
		super(a,a);
		
		for(int i = 0;i < a; i++) {
			this.mat[i][i] = 1;
		}
	}
	
public SquareMatrix sum(SquareMatrix h) {
		
		int f = 0;int l = 0;SquareMatrix k = new SquareMatrix(h.row);
		for(int i = 0; i < h.row;i++) {
			for(int j = 0; j < h.row1;j++) {
				f = this.mat[i][j];
				l = h.mat [i][j];
				k.mat[i][j] = f + l;
			}
		}
		return k;
		
	}
	
	
	
	
	
public SquareMatrix product(SquareMatrix h) {
	SquareMatrix k = new SquareMatrix(h.row1);
	for(int x = 0;x < h.row1;x++) {
		for(int z = 0;z < h.row1;z++) {
			k.mat[x][z] = 0;
		}
	}
	
	for(int i = 0;i < h.row;i++) {
		for(int j = 0;j < h.row1;j++) {
			for(int n = 0;n < h.row1;n++) {
				k.mat[i][j] += this.mat[i][n] * h.mat[n][j];
			}
		}
	}
	
	return k;
}
}
