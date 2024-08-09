	package lr2;

class Matrix {
	private 
	int [][] two = new int [1][1];
	int g;
	
	public Matrix(int a){
		this.two = new int [a][a];
		this.g = a;
		for(int i = 0;i < a; i++) {
			this.two[i][i] = 1;
		}
	}
	
	public Matrix sum(Matrix h) {
		int f;int l;Matrix k = new Matrix(g);
		for(int i = 0; i < g;i++) {
			for(int j = 0; j < g;j++) {
				f = this.two[i][j];
				l = h.two [i][j];
				k.two[i][j] = f + l;
				
				
			}
		}
		return k;
	}
	public Matrix product(Matrix h) {
		Matrix k = new Matrix(g);
		for(int x = 0;x < g;x++) {
			for(int z = 0;z < g;z++) {
				k.two[x][z] = 0;
			}
		}
		
		for(int i = 0;i < g;i++) {
			for(int j = 0;j < g;j++) {
				for(int n = 0;n < g;n++) {
					k.two[i][j] += this.two[i][n] * h.two[n][j];
				}
			}
		}
		
		return k;
	}
	public void setElement(int row, int column, int value) {
		this.two[row][column] = value;
	}
	public int getElement(int row, int column) {
		int res;
		res = this.two[row][column];
		return res;
	}
	
	public void sumdiag(Matrix h) {
		int l = 0;int f = 0;
		int[] sum = new int[g*2-1];
		for (int i = 0; i < g; i++) {
			f = l;
	        for (int j = 0; j < g; j++) { 
	            	sum[f] =sum[f] + h.two[i][j];
	            	f++;
	           }
	         l++;  
	            
	          
		}
		
		for(int t = 0;t < f;t++) {
			System.out.println("sumdiag");
			System.out.println(sum[t]);
		}
	}
	
	public String toString() {
		StringBuilder out = new StringBuilder();
		for(int i = 0;i < g;i++) {
			for(int j = 0;j < g;j++) {
				out.append(" ");
				out.append(two[i][j]);
			}
			out.append("\n");
		}
		
		return out.toString();
		
	}
	
}
