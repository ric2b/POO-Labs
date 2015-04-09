package lab5;

import java.util.LinkedList;

public class StockOwner {

	float money;
	LinkedList <Share> ownedShares = new LinkedList <Share>();
	
	public StockOwner(float StartingMoneyArg)
	{
		money = StartingMoneyArg;
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
}
