package love_bank.dao;

import java.util.*;
import java.io.*;

import love_bank.cmn.Bank_Work_Div;
import love_bank.cmn.DTO;
import love_bank.domain.Bank;

public class BankDao implements Bank_Work_Div<Bank> {

	public static List<Bank> bankList = new ArrayList<>();

	// 저장 파일 경로
	public final static String SAVE_FILE_PATH = "C:\\Users\\harang\\Desktop\\DCOM_20220127\\01_JAVA"
			+ "\\workspace\\LOVE_BANK_94Line\\src\\love_bank\\data\\Banks.csv";

	/**
	 * saveFile
	 * @param filePath
	 * @return 1(성공)/0(실패)
	 */
	public int saveFile(String filePath) {
		int writeCint = 0;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

			for (Bank bank : bankList) {
//				"23339094", "23339094", "김사무엘", 1000)
				String outData = bank.getAccountNumber() 
						+ "," + bank.getPassword() 
						+ "," + bank.getName() 
						+ "," + bank.getBalance() 
						+ "\n";
				bw.write(outData);

				writeCint++;

			}
		} catch (IOException e) {
			System.out.println("===========================");
			System.out.println("=IOException=" + e.getMessage());
			System.out.println("===========================");
		}

		return writeCint;
	}

	/**
	 * readFile
	 * @param filePath
	 * @return 1(성공)/0(실패)
	 */
	public int readFile(String filePath) {
		int flag = 0;
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
			String line = "";
			
			int i = 0;
			while( (line = br.readLine()) != null) {
				
				String[] inArray = line.split(",");
				
				int balArray = Integer.parseInt(inArray[3]);			
				Bank bank = new Bank(inArray[0], inArray[1], inArray[2], balArray);
				bankList.add(bank);
			}
			
			if(bankList.size() > 0) {
				flag++;
			}
		}catch (IOException e) {
			System.out.println("=========================");
			System.out.println("==IOException" + e.getMessage());
			System.out.println("=========================");
		}
		
		
		return flag;
	}
	
	@Override // 전체계좌조회
	public List<Bank> doRetrieve(DTO dto) {

		return bankList;
	}

	/**
	 * 계좌번호 존재 유뮤확인
	 * @param dto
	 * @return 1(있다)/0(없다)
	 */
	public int isBankExists(Bank dto) {
		int flag = 0;
		
		for(Bank b : bankList) {
			if(b.getAccountNumber().equals(dto.getAccountNumber())) {
				flag = 1;
				break;
			}
		}
		return flag;
	}
	
	
	@Override // 개설
	public int doCreate(Bank dto) {
		if( 1 == isBankExists(dto)) {
			System.out.println("계좌 번호가 존재합니다.\n다른 계좌번호를 입력해주세요\n입력하신 계좌번호: " + dto.getAccountNumber());
			return -1;
		}
		boolean flag = bankList.add(dto);
		return (flag==true)?1:0; // flag가 true면 1을반환 아니면 0을반환
	}

	@Override // 입금
	public int doDeposit(Bank dto) {

		return 0;
	}

	@Override // 출금
	public int doWithdraw(Bank dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override // 계좌조회
	public Bank doSelectAcc(Bank dto) {
		Bank outData = null;
		
		for(Bank b : bankList) {
			if(b.getAccountNumber().equals(dto.getAccountNumber())) {
				outData = b;
				break;
			}
		}
		return outData;
	}

//	@Override // 잔액조회
//	public DTO doSelectBal(Bank dto) {
//		
////		int balArray = Integer.parseInt(inArray[3]);
//		Bank outData = null;
//		
//		for(Bank b : bankList) {
//			
//			if(b.getBalance().equals(dto.getBalance())) {
//				outData = b;
//				break;
//			}
//		}
//		return outData;
//	} 
//
//	@Override // 비밀번호 변경
//	public int doUpdatePW(Bank dto) {
//		Scanner sc = new Scanner(System.in);
//		int flag = 0;
//		Bank pw = new Bank();
//		flag = pw.setPassword(sc.nextLine());
//		return flag;
//	}

}