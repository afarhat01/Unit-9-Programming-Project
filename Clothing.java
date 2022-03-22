class clothing extends product{

	private String brand;
	private String size;
	
	public clothing (String n, String c, double p, int q, String s, String si){

		super(n,c,p,q);
		setSize(si);
		brand = s;
		

	}


	public String getBrand()
	{
		return brand;
	}
	public String getSize()
	{
		return size;
	}

	public void setBrand(String s)
	{
		brand = s;
	}
	public void setSize(String si)
	{
		if (si.equals("s")||si.equals("m")||si.equals("l")||si.equals("x")){
			size = si;
		} else{
			size = "s";
		}
	}
	
	public String toString()
	{
		return super.toString() + "\nBrand: " + brand + "\nSize: " + size;
	}





	
}