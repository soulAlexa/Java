package lr3;


class run {
	public static void main(String[] args) {
		Matrix j = new Matrix(5,3);
		Matrix h = new Matrix(5,4);
		SquareMatrix k = new SquareMatrix(5);
		SquareMatrix n = new SquareMatrix(5);
		//System.out.println(j);
		//System.out.println(h);
		//System.out.println(k.equals(n));
		//n = (SquareMatrix) n.product(k);
		//n.setElement(3, 2, 6);
		
		
		h.setElement(1, 0, 5);
		h.setElement(0, 1, 4);
		h.setElement(1, 1, 6);
		j.setElement(1, 0, 3);
		j.setElement(0, 1, 2);
		j.setElement(1, 1, 5);
		System.out.println(h);
		System.out.println(j);
		
			j = j.product(h);
			System.out.println(j);
			
			System.out.println(k.equals(n));
			
		
		
	}
}