package Service;

import java.util.ArrayList;
import java.util.List;

import Model.Deal;
import Repository.DealRepository;

public class DealService {
	
	private DealRepository _dealRepository;
	
	public DealService() {
		//Poor Mans Dependency Injection
		_dealRepository = new DealRepository();
	}
	
	public DealService(DealRepository dealRepository) {
		//Poor Mans Dependency Injection
		_dealRepository = dealRepository;
	}
	
	public Deal FindDeal(Integer idDeal) {
		return _dealRepository.GetDeal(idDeal);
	}
	
	public List<Deal> listDeals()
	{
		return _dealRepository.getAll();
	}
	
	public List<Deal> getFirstFourDealsByCategory(Integer categoryId) {
		
		List<Deal> dealsOfCategory = getDealsByCategory(categoryId);
		
		List<Deal> fourDealsOfCategory = dealsOfCategory.subList(0, dealsOfCategory.size() > 4 ? 3 : dealsOfCategory.size() - 1);
		
		return fourDealsOfCategory; 
	}
	
	public List<Deal> getDealsByCategory(Integer categoryId) {
		
		List<Deal> dealsOfCategory = new ArrayList<Deal>();		
		
		for(Deal deal :  _dealRepository.getAll()) 
			if (deal.getCategory().getId() == categoryId)
				dealsOfCategory.add(deal);
		
		return dealsOfCategory;
	}
	
	public void create(Deal deal) {
		_dealRepository.add(deal);
	}
	
	public void update(Deal deal) {
		_dealRepository.update(deal);
	}
	
	public void remove(Integer idDeal) {
		_dealRepository.delete(idDeal);
	}
}
