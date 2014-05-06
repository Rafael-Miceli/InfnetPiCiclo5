package Service;

import Model.Deal;
import Repository.DealRepository;

public class DealService {
	
	private DealRepository _dealRepository;
	
	public DealService() {
		_dealRepository = new DealRepository();
	}
	
	public Deal FindDeal(Integer idDeal) {
		return _dealRepository.GetDeal(idDeal);
	}
}
