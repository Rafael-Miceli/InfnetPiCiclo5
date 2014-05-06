package Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Model.Deal;


public class DealRepository {
	
	private List<Deal> Deals;
	
	public DealRepository()	{
		Deal deal = new Deal();
		deal.setId(1);
		deal.setDescription("Descri��o da promo��o");
		deal.setPrice(33.12);
		deal.setRules("Regras");
		deal.setTitle("Titulo da promo��o");
		
		Date date = new Date();
		date.setDate(10);		
		deal.setValidation(date);		
		
		Deals = new ArrayList<Deal>();
		Deals.add(deal);
	}
	
	public Deal GetDeal(Integer Id) {
		
		for (Deal deal : Deals)
			if (deal.getId() == Id)		
				return deal;
		
		return null;
	}

}
