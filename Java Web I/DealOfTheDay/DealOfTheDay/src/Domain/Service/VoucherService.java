package Service;

import Model.Voucher;
import Repository.VoucherRepository;

public class VoucherService {
	
	private VoucherRepository _voucherRepository;
	private Voucher _voucherToValidate;

	public VoucherService() {
		//Poor Mans Dependency Injection
		_voucherRepository = new VoucherRepository();
	}
	
	public VoucherService(VoucherRepository voucherRepository) {
		//Poor Mans Dependency Injection
		_voucherRepository = voucherRepository;
	}
	
	public Voucher validateVoucher(String voucherCode) {
		if (isVoucherCodeValid(voucherCode))
		{			
			if(_voucherToValidate.getValid())
				invalidateUsedVoucher(_voucherToValidate);
			else 
				_voucherToValidate = null;
		}
		
		return _voucherToValidate;
	}

	private void invalidateUsedVoucher(Voucher voucher) {
		_voucherRepository.update(voucher);		
	}

	private boolean isVoucherCodeValid(String voucherCode) {
		return getVoucherByCode(voucherCode) != null ? true : false;
	}
	
	public Voucher getVoucherByCode(String voucherCode) {
		_voucherToValidate = _voucherRepository.getByCode(voucherCode);
		return _voucherToValidate;
	}

}
