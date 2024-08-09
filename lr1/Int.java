class Int {
	private int a;
	
	public void increment()
	{
		this.a++;
	}
	public void decrement()
	{
		this.a--;
	}
	public void add(Int n)
	{
		int h = this.a;
		this.a = h + n.a;
		System.out.println(this.a);
		Int hg = new Int();
		while(n.a != hg.a) {
			hg.increment();		
		}
			while(hg.a != 0) 
			{
				this.a++;
				hg.a --;
			}
		
	}
	public void substract(Int n)
	{
		Int hg = new Int();
		while(n.a != hg.a) {
			hg.increment();		
		}
			
		while(n.a > 0) {
			this.a--;
			n.a --;
		}
		
	}
	
	
	public String tostring()
	{
		return String.valueOf(this.a);
	}
	
}
