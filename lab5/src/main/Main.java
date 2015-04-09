package main;

import lab5.*;

public class Main {

	public static void main(String[] args) {
		
		Corporation Galp = new Corporation (5000, 500, "Galp");
		StockOwner JoeBerardo = new StockOwner(100, "JoeBerardo");
		
		for(int i = 0; i < 50; i++)
		{
			Galp.createShare();
		}
		
		//for(int i = 0; i <= 20; i++)
		//{
			JoeBerardo.buyShare(Galp.companyShares.getFirst());
		//}
			
		System.out.println(JoeBerardo.ownedShares.getFirst().getParentCompany().getName());
		System.out.println(JoeBerardo.ownedShares.getFirst().getStockOwner().getName());
		System.out.println(Galp.getShareValue() + " casheesh/per action");	
	}

}
