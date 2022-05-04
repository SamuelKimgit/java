package love_bank.dao;

import java.util.List;

import love_bank.cmn.Bank_Work_Div;
import love_bank.cmn.DTO;
import love_bank.domain.Bank;

public class AddressBankDao implements Bank_Work_Div<Bank> {

	@Override
	public List<Bank> doRetrieve(DTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int doCreate(Bank dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doDeposit(Bank dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doWithdraw(Bank dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DTO doSelectAcc(Bank dto) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public DTO doSelectBal(Bank dto) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public int doUpdatePW(Bank dto) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
