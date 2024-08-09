package lr3;

public class OneColumnMatrix {
	protected 
	int row = 0;
	int row1 = 0;
	int gh = 0;
	int [] mat = new int [row];
	
	public OneColumnMatrix(int r,int c,int gh) {
		this.mat = new int [r];
		this.row = r;
		this.row1 = c;
		for(int i = 0;i < r;i++) {
			this.mat[i] = gh;
		}
		
		
	}
	
	
	
	public String toString() {
		StringBuilder out = new StringBuilder();
		for(int i = 0;i < this.row;i++) {
			for(int j = 0;j < this.row1;j++) {
				out.append(" ");
				out.append(mat[i]);
			}
			out.append("\n");
		}
		
		return out.toString();
		
	}
	
	


	
	

}
