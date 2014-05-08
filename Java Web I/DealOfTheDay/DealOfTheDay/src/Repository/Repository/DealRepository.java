package Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Model.Deal;


public class DealRepository {
	
	private List<Deal> _deals;
	
	public DealRepository()	{
		Deal deal1 = new Deal();
		deal1.setId(1);
		deal1.setDescription("Descri��o da promo��o 1");
		deal1.setPrice(33.12);
		deal1.setRules("Regras 1");
		deal1.setTitle("Titulo da promo��o 1");
		deal1.setTotalBuyed(3);
		
		Date date = new Date();
		date.setDate(1);		
		deal1.setValidation(date);
		
		
		Deal deal2 = new Deal();
		deal2.setId(2);
		deal2.setDescription("Descri��o da promo��o 2");
		deal2.setPrice(121.99);
		deal2.setRules("Regras 2");
		deal2.setTitle("Titulo da promo��o 2");
		deal2.setTotalBuyed(175);
		
		date.setDate(2);		
		deal2.setValidation(date);
		
		Deal deal3 = new Deal();
		deal3.setId(3);
		deal3.setDescription("Descri��o da promo��o 3");
		deal3.setPrice(64.75);
		deal3.setRules("Regras 3");
		deal3.setTitle("Titulo da promo��o 3");
		deal3.setTotalBuyed(42);
		
		date.setDate(2);		
		deal3.setValidation(date);
		
		_deals = new ArrayList<Deal>();
		_deals.add(deal1);
		_deals.add(deal2);
		_deals.add(deal3);
	}
	
	public Deal GetDeal(Integer Id) {
		
		for (Deal deal : _deals)
			if (deal.getId() == Id)		
				return deal;
		
		return null;
	}
	
	public List<Deal> getAll() {		
		return _deals;	
	}
	

}
