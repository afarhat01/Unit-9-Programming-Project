class men extends clothing{

	private boolean brandName;

	public men (String n, String c, double p, int q, String s, String si, boolean bn) {
		super(n,c,p,q,s,si);
		setBrandName(bn);
	}

	
	public void setBrandName(int ws)
	{
		brandName = ws;
	}
	public int getBrandName()
	{
		return brandName;
	}

	public String toString()
	{
		return super.toString() + "Is BrandName: " + brandName;
	}












	
}