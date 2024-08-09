package lr4;

class run {
	public static void main(String[] args) {
		SortedIntegerList k = new SortedIntegerList(true);
		k.add(6);
		
		//k.remove(6);
		k.add(23);
		k.add(6);
		k.add(2);
		k.add(44);
		k.add(35);
		k.add(6);
		k.add(9);
		SortedIntegerList h = new SortedIntegerList(false);
		h.add(6);
		
		//h.remove(6);
		h.add(23);
		h.add(6);
		h.add(3);
		h.add(2);
		h.add(44);
		h.add(35);
		h.add(6);
		h.add(9);
		System.out.println(k);
		System.out.println(h);
	}
}
