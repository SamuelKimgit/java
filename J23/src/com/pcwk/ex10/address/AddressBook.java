package com.pcwk.ex10.address;

//VO(Value Object)
//VO란 이렇게 도메인에서 한 개 또는 그 이상의 속성들을 묶어서 특정 값을 나타내는 객체를 의미한다
public class AddressBook {
//	주소록
//		이름		String name
//		핸드폰	String cellphone
//		email	String email
//		주소		String address
//		생년월일	String birthday

	private String name;		// 이름
	private String cellphone;	// 핸드폰
	private String email;		// email
	private String address;		// 주소
	private String brirthday;	// 생년월일
	
	// member변수 초기화
	public AddressBook() {}
		// thts( , , , , , )
	
	public AddressBook(String name, String cellphone, String email, String address, String brirthday) {
		super();
		this.name = name;
		this.cellphone = cellphone;
		this.email = email;
		this.address = address;
		this.brirthday = brirthday;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}
	/**
	 * @param cellphone the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the brirthday
	 */
	public String getBrirthday() {
		return brirthday;
	}
	/**
	 * @param brirthday the brirthday to set
	 */
	public void setBrirthday(String brirthday) {
		this.brirthday = brirthday;
	}
	
}
