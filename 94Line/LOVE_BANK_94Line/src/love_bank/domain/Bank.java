package love_bank.domain;

import love_bank.cmn.DTO;

public class Bank extends DTO{

	private String accountNumber; // 계좌번호
	private String password; // 계좌비밀번호
	private String name; // 예금주명
	private int balance; // 잔고

	public Bank() {
		super();
	}
	
	// constructor
	/**
	 * 생성자
	 * @param accountNumber
	 * @param password
	 * @param name
	 * @param balance
	 */
	public Bank(String accountNumber, String password, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.password = password;
		this.name = name;
		this.balance = balance;
	}
	 
	public String getPassword() {
		return password;
	}

	// 계좌비밀번호 변경
	public void setPassword(String password) {
		this.password = password;
	}

	// 계좌번호 조회
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	// 계좌잔고 조회
	public int getBalance() {
		return balance;
	}

	// 계좌 정보 조회
	public String getAccInfo() {
		
		return "계좌번호: " + accountNumber + ", 예금주명: " + name;
	}
	
	// 입금
	// 0원 이하 입금X, 실수X, 음수X
	public void deposit(int deposit) {
		if(deposit<=0) {
			System.out.println("금액을 다시 입력해주세요. \n 0원 이상을 입력해주세요.");
		}else {
			System.out.println(deposit + "원이 입금되었습니다.");
		}
		balance += deposit;
	}
	
	// 출금
	// 최대금액보다 크면X, 0원 출금X, 실수X, 음수X
	public void withdraw(int withdraw) {
		if(withdraw>balance) {
			System.out.println("금액을 다시 입력해주세요. \n 잔액이 부족합니다.");
		}
		if(withdraw <=0){
			System.out.println("금액을 다시 입력해주세요. \n 0원 이상을 입력해주세요.");
		}
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", password=" + password + ", name=" + name + ", balance="
				+ balance + "]";
	}
	
	
	
}// class