package lab5;

import java.util.LinkedList;

public class StockMarket {
	
	LinkedList <Corporation> corporations = new LinkedList <Corporation>();
	
	public StockMarket()
	{
		
	}
	
	public void createCorporation(float CompanyValueArg, float StartingMoneyArg, String CompanyNameArg)
	{
		corporations.add(new Corporation(CompanyValueArg, StartingMoneyArg, CompanyNameArg));
	}
	
}
