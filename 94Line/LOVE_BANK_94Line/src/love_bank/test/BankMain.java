package love_bank.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import love_bank.dao.BankDao;
import love_bank.domain.Bank;

public class BankMain {

	BankDao dao;
	Bank bank01;

	public BankMain() {
		dao = new BankDao();
		bank01 = new Bank("23339094", "23339094", "김사무엘", 1000);
	}

	public void saveFile() { // 파일생성
//		int writeCnt = dao.saveFile("banks.csv");
//		System.out.println("writeCnt: " + writeCnt);
	}

	public void readFile() { // 파일불러오기
		for (Bank b : dao.bankList) {
			System.out.println(b);
		}
	}

	public Bank getInputData(Scanner sc) {
		Bank bank = null;

		String readInput = sc.nextLine().trim();
		String[] dataArr = readInput.split(",");
//		while(readInput != null) {
		int balArray = Integer.parseInt(dataArr[3]);
		bank = new Bank(dataArr[0], dataArr[1], dataArr[2], balArray);
//		}
		return bank;
	}

	
	public static void main(String[] args) {
		BankMain bankMain = new BankMain();
//		bankMain.readFile();
//		bankMain.saveFile();
		
		File banks = new File(BankDao.SAVE_FILE_PATH);
		
		if(!banks.exists() || !banks.isFile()) {
			try {
				banks.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int inCommand = 0;
		boolean isExit = false;
		
		do {
			System.out.println("=====Love_BANK=====");
			System.out.println("1. 계좌 개설");
			System.out.println("2. 계좌 조회");
			System.out.println("3. 입금");
			System.out.println("4. 출금");
//			System.out.println("5. 잔액조회");
//			System.out.println("6. 비밀번호 변경");
			System.out.println("7. 전체 계좌 조회");
			System.out.println("8. 프로그램 종료");
			System.out.println("=====해당 메뉴 숫자를 입력해주세요=====");
			
			inCommand = sc.nextInt();
			
			Bank bank = null;
			String[] dataArr = null;
			String readInput = "";
			
			switch (inCommand) {
			case 1:
				
				System.out.println("계좌를 개설합니다.");
				
				bank = bankMain.getInputData(sc);
				
				int status1 = bankMain.dao.doCreate(bank);
				if(status1 == 1) {
					System.out.println(bank.toString() + "입력되었습니다.");
				}else {
					System.out.println("계좌를 개설할 수 없습니다.");
				}
				break;
				
			case 2:
				System.out.println("계좌를 조회합니다.\n조회하실계좌번호를 입력해주세요.");
				readInput = sc.nextLine().trim();
				
				bank = new Bank();
				bank.setAccountNumber(readInput); 
				
				Bank outData = bankMain.dao.doSelectAcc(bank);
				if(null == outData) {
					System.out.println("조회 실패");
				}else {
					System.out.println("조회 성공");
					System.out.println("조회 계좌: " + outData);
				}
				
				break;
			case 3:
				System.out.println("입금을 원하시는 계좌번호를 입력해주세요");
				readInput = sc.nextLine().trim();
				
				bank = new Bank();
				bank.setAccountNumber(readInput);
				if(bankMain.dao.isBankExists(bank) == 1) {
					System.out.println("입금하실 금액을 입력해주세요.");
					int deposit = sc.nextInt();
					bank.deposit(deposit);
				}
				break;
				
			case 4:
				System.out.println("출금을 원하시는 계좌번호를 입력하세요");
				readInput = sc.nextLine().trim();
				
				bank = new Bank();
				bank.setAccountNumber(readInput);
				if(bankMain.dao.isBankExists(bank) == 1) {
					int withdraw = sc.nextInt();
					bank.withdraw(withdraw);
				}
				break;
			case 7:
				List<Bank> list = bankMain.dao.doRetrieve(bank);
				for(Bank b : list) {
					System.out.println(b.getAccInfo());
				}
				break;
			case 8:
				int flag = bankMain.dao.saveFile(BankDao.SAVE_FILE_PATH);
				System.out.println("저장된 계좌" + flag + "건 입니다.");
				isExit = true;
				break;
			default:
				System.out.println("숫자를 다시 입력해주세요.");
				break;
			}
			
		}while(!isExit);
		System.out.println("프로그램 종료!");
		
	}
}
