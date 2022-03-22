class women extends clothing{

	private int waistSize;

	public women (String n, String c, double p, int q, String s, String si, int ws) {
		super(n,c,p,q,s,si);
		setWaistSize(ws);
	}

	
	public void setWaistSize(int ws)
	{
		waistSize = ws;
	}
	public int getWaistSize()
	{
		return waistSize;
	}

public String toString()
	{
		return super.toString() + "WaistSize: " + waistSize + " inches";
	}












	
}