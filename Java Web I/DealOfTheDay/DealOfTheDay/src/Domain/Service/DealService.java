package Service;

import java.util.List;

import Model.Deal;
import Repository.DealRepository;

public class DealService {
	
	private DealRepository _dealRepository;
	
	public DealService() {
		//Poor Mans Dependency Injection
		_dealRepository = new DealRepository();
	}
	
	public Deal FindDeal(Integer idDeal) {
		return _dealRepository.GetDeal(idDeal);
	}
	
	public List<Deal> listDeals()
	{
		return _dealRepository.getAll();
	}
}
