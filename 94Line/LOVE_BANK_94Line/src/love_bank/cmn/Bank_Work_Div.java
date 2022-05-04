package love_bank.cmn;

import java.util.List;

/**
 * 모든 DAO는 Bank_Work_Div를 implements 받을것.
 * @author harang
 *
 */
public interface Bank_Work_Div<T> {

	/**
	 * <pre>
	 * 목록조회
	 * @param dto
	 * @return List<DTO>
	 * </pre>
	 */
	public abstract List<T> doRetrieve(DTO dto);
	
	/**
	 * <pre>
	 * 계좌 개설
	 * @param dto
	 * @return 1(성공)/0(실패)
	 * </pre>
	 */
	public abstract int doCreate(T dto);
	
	/**
	 * <pre>
	 * 입금
	 * @param dto
	 * @return 1(성공)/0(실패)
	 * </pre>
	 */
	public abstract int doDeposit(T dto);
	
	/**
	 * <pre>
	 * 출금
	 * @param dto
	 * @return 1(성공)/0(실패)
	 * </pre>
	 */
	public abstract int doWithdraw(T dto);
	
	/**
	 * <pre>
	 * 계좌조회
	 * @param dto
	 * @return DTO
	 * </pre>
	 */
	public abstract DTO doSelectAcc(T dto);
	
	
//	/**
//	 * <pre>
//	 * 잔액 조회
//	 * @param dto
//	 * @return int
//	 * </pre>
//	 */
//	public abstract DTO  doSelectBal(T dto);
	
//	/**
//	 * <pre>
//	 * 비밀번호 변경
//	 * @param dto
//	 * @return 1(성공)/0(실패)
//	 * </pre>
//	 */
//	public abstract int doUpdatePW(T dto);
	
}
