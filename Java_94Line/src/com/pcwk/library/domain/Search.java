package com.pcwk.library.domain;

import com.pcwk.cmn.DTO;

public class Search extends DTO {

	private int searchDiv; // 검색구분 (전체:99 , 제목:10, 저자:20)
	private String searchhWord; // 검색어
	
	public Search() {}

	public Search(int searchDiv, String searchhWord) {
		super();
		this.searchDiv = searchDiv;
		this.searchhWord = searchhWord;
	}

	/**
	 * @return the searchDiv
	 */
	public int getSearchDiv() {
		return searchDiv;
	}

	/**
	 * @param searchDiv the searchDiv to set
	 */
	public void setSearchDiv(int searchDiv) {
		this.searchDiv = searchDiv;
	}

	/**
	 * @return the searchhWord
	 */
	public String getSearchhWord() {
		return searchhWord;
	}

	/**
	 * @param searchhWord the searchhWord to set
	 */
	public void setSearchhWord(String searchhWord) {
		this.searchhWord = searchhWord;
	}

	@Override
	public String toString() {
		return "Search [searchDiv=" + searchDiv + ", searchhWord=" + searchhWord + "]";
	}
	
	
}
