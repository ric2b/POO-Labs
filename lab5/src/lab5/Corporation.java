package lab5;

import java.util.LinkedList;

public class Corporation extends StockOwner {
	
	float CompanyValue;
	int numberShares = 0;
	public LinkedList <Share> companyShares = new LinkedList <Share>();
	
	public Corporation (float CompanyValueArg, float StartingMoneyArg, String CompanyNameArg)
	{
		super(StartingMoneyArg, CompanyNameArg);
		CompanyValue = CompanyValueArg;
	}
	
	public void createShare()
	{
		Share newShare = new Share(this);
		companyShares.add(newShare);
		numberShares++;
	}
	
	public float getShareValue()
	{		
		return CompanyValue/numberShares;
	}
}