package com.iq;

public enum UserDBEnum {

	GET_DATA("SELECT ENAME,ECOUNTRY FROM EMPLOYEE"),
	SAVE_DATA(""),
	GET_BY_ID("");

	String qry;

	private UserDBEnum(String qry) {
		this.qry = qry;
	}
	
	

	public String getQry() {
		return qry;
	}



	private UserDBEnum() {

	}
}
