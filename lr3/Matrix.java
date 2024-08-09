package lr3;


public class Matrix {
	protected 
	int row = 0;
	int row1 = 0;
	int [][] mat = new int [row][row1];
	
	public Matrix() {
		
	}
	public Matrix(int r,int c) {
		this.mat = new int [r][c];
		this.row = r;
		this.row1 = c;
		
	}
	
	public Matrix sum(Matrix h) {
		
		int f = 0;int l = 0;Matrix k = new Matrix(h.row,h.row1);
		if(h.row != this.row || h.row1 != this.row1) {
			except ee = new except("row not eq");
			throw ee;
		}
		
		for(int i = 0; i < h.row;i++) {
			for(int j = 0; j < h.row1;j++) {
				f = this.mat[i][j];
				l = h.mat [i][j];
				k.mat[i][j] = f + l;
			}
		}
		return k;
		
	}
	
	public Matrix product(Matrix h) {
		
		int f = 0;int l = 0;Matrix m = new Matrix(this.row,h.row1);
		if(h.row != this.row1) {
			except bb = new except("row not equal");
			throw bb;
		}
		
		for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < h.row1; j++) {
                for (int k = 0; k < h.row; k++) {
                	f = this.mat[i][k];
                	l = h.mat[k][j];
                    m.mat[i][j] += f * l;
                	
                }
            }
        }
		return m;
	}
	
	
	public void setElement(int row, int column, int value) {
		this.mat[row][column] = value;
		
	}
	
	
	public int getElement(int row, int column) {
		int res;
		res = this.mat[row][column];
		return res;
	}
	
	
	public String toString() {
		StringBuilder out = new StringBuilder();
		for(int i = 0;i < this.row;i++) {
			for(int j = 0;j < this.row1;j++) {
				out.append(" ");
				out.append(mat[i][j]);
			}
			out.append("\n");
		}
		
		return out.toString();
		
	}
	
	
	public boolean equals(Matrix h) {
		if(this.row == h.row) {
			if(this.row1 == h.row1) {
				for(int i = 0;i < this.row;i++) {
					for(int j = 0; j < this.row1;j++) {
						if(this.mat[i][j] == h.mat[i][j]) {
							
						}else return (this.mat[i][j] == h.mat[i][j]);
					
					}
				}
			}else return (this.row1 == h.row1);	
		}else return (this.row == h.row);
		
		return true;
	}

	
	
	
}
