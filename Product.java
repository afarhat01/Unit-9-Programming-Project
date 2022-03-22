class product {

private double price;
private String company;
private String name;
private int quantity;

	public product(String n, String c, double p, int q) {
		name = n;
		company = c;
		price = p;
		quantity = q;
	}

	public product() {
		name = "No Name";
		company = "Unknown Company";
		price = 0;
		quantity = 0;
	}

public double getPrice()
	{
		return price;
	}
public int getQuantity()
	{
		return quantity;
	}
public String getName()
	{
		return name;
	}
public String getCompany()
	{
		return company;
	}

	public void setPrice(double d)
	{
		price = d;
	}
	public void setName(String s)
	{
		name = s;
	}
	public void setCopmany(String s)
	{
		company = s;
	}
	public void setQuantity(int q)
	{
		quantity = q;
	}

	public String toString()
	{
		return "Item: " + name + "\nBy: " + company + "\nPrice: $" + price + "\nQuantity: " + quantity;
	}



	
}