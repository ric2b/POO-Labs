package lab5;

import java.util.LinkedList;

public class StockOwner {

	float money;
	public LinkedList <Share> ownedShares = new LinkedList <Share>();
	String StockOwnerName;
	
	public StockOwner(float StartingMoneyArg, String StockOwnerNameArg)
	{
		money = StartingMoneyArg;
		StockOwnerName = StockOwnerNameArg;
	}
	
	public void buyShare(Share buyableShare)
	{
		money -= buyableShare.getParentCompany().getShareValue();
		buyableShare.getStockOwner().sellShare(buyableShare);
		buyableShare.setStockOwner(this);
		ownedShares.add(buyableShare);
	}
	
	public void sellShare(Share sellableShare)
	{
		money += sellableShare.getParentCompany().getShareValue();
		ownedShares.remove(sellableShare);
	}
	
	public String getName()
	{		
		return StockOwnerName;
	}
}
