package Repository;

import java.util.ArrayList;
import java.util.List;

import Model.Voucher;

public class VoucherRepository {
	
	private List<Voucher> _vouchers;
	
	public VoucherRepository() {
		
		Voucher voucher = new Voucher();		
		
		voucher.setId(1);
		voucher.setCode("ABCDEF1234");
		
		_vouchers = new ArrayList<Voucher>();
	}

}
