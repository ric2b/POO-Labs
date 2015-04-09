package lab5;

import java.util.LinkedList;

public class Corporation extends StockOwner {
	
	float CompanyValue;
	int numberShares = 0;
	LinkedList <Share> companyShares = new LinkedList <Share>();
	
	public Corporation (float CompanyValueArg, float StartingMoneyArg)
	{
		super(StartingMoneyArg);
		CompanyValue = CompanyValueArg;
	}
	
	public Share createShare()
	{
		Share newShare = new Share(this);
		companyShares.add(newShare);
		numberShares++;
		return newShare;
	}
	public float getShareValue()
	{		
		return CompanyValue/numberShares;
	}
}