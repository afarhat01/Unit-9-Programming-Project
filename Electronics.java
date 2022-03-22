class electronics extends product {

	private boolean batteryIncluded;
	private boolean handheld;

	public electronics(String n, String c, double p, int q, boolean b, boolean h){
		super(n,c,p,q);
		batteryIncluded = b;
		handheld = h;
	}

	public boolean getBattInc()
	{
		return batteryIncluded;
	}
	public boolean getHandheld()
	{
		return handheld;
	}
	public void setBattInc(boolean b)
	{
		batteryIncluded = b;
	}
	public void setHandheld(boolean b)
	{
		handheld = b;
	}

	public String toString()
	{
		return super.toString() + "\nBattery: " + batteryIncluded + "\nHandheld: " + handheld;
	}









	
}