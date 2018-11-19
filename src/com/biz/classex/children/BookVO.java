package com.biz.classex.children;

public class BookVO {
	private String strTitle;
	private String strAuth;
	private String Comp;
	public String getStrTitle() {
		return strTitle;
	}
	public void setStrTitle(String strTitle) {
		this.strTitle = strTitle;
	}
	public String getStrAuth() {
		return strAuth;
	}
	public void setStrAuth(String strAuth) {
		this.strAuth = strAuth;
	}
	public String getComp() {
		return Comp;
	}
	public void setComp(String comp) {
		Comp = comp;
	}
	@Override
	public String toString() {
		return "BookVO [strTitle=" + strTitle + ", strAuth=" + strAuth + ", Comp=" + Comp + "]";
	}
	
	
	
	/*
	@Override //재정의
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		String strRet = "제목:" + this.strTitle+ "\n";
		strRet += "저자:" + this.strAuth + "\n";
		strRet += "출판사:" + this.Comp;
		return strRet;
	
	}*/
	
}
