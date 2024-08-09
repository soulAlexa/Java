package lr2;

 class run {
	public static void main(String[] args) {
		Matrix j = new Matrix(2);
		Matrix h = new Matrix(2);
		j.setElement(1, 0, 1);
		j.setElement(0, 1, 1);
		j.setElement(1, 1, 0);
		h.setElement(1, 0, 1);
		h.setElement(0, 1, 1);
		h.setElement(1, 1, 0);
		System.out.println(h.toString());
		for(int i = 0;i < 9;i++) {
			h = h.product(j);
			System.out.println(h.toString());
		
		}
		
		h.sumdiag(h);
	}
}
