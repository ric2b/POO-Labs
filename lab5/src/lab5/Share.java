package lab5;

public class Share {
	
	Corporation ParentCompany;
	StockOwner	Owner;
	
	public Share (Corporation ParentCompanyArg)
	{
		ParentCompany = ParentCompanyArg;
		Owner = ParentCompanyArg;
	}
	
	public void setStockOwner(StockOwner OwnerArg)
	{
		Owner = OwnerArg; 
	}
	
	public Corporation getParentCompany()
	{
		return ParentCompany; 
	}
	
	public StockOwner getStockOwner()
	{
		return Owner; 
	}
}
