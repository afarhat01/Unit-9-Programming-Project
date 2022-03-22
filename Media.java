class Media extends product {
	private String type;

	public Media(String n, String c, double p, int q, String s){

super(n,c,p,q);
		type = s;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String s )
	{
		type = s;
	}

	public String toString()
	{
		return super.toString() + "\nType: " + type;
	}

	
}