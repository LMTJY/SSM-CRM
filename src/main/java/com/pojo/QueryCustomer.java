package com.pojo;

public class QueryCustomer {
	private String name;
	private int jibie=0;
	private int hangye=0;
	private int page=1;
	private int rows=2;
	private int shang;
	private int xia;
	private int pagecount;
	private int pianyi=-1;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJibie() {
		return jibie;
	}
	public void setJibie(int jibie) {
		this.jibie = jibie;
	}
	public int getHangye() {
		return hangye;
	}
	public void setHangye(int hangye) {
		this.hangye = hangye;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getShang() {
		return shang;
	}
	public void setShang(int shang) {
		this.shang = shang;
	}
	public int getXia() {
		return xia;
	}
	public void setXia(int xia) {
		this.xia = xia;
	}
	public int getPagecount() {
		return pagecount;
	}
	public void setPagecount(int pagecount) {
		this.pagecount = pagecount;
	}
	public int getPianyi() {
		return pianyi;
	}
	public void setPianyi(int pianyi) {
		this.pianyi = pianyi;
	}
	@Override
	public String toString() {
		return "QueryCustomer [name=" + name + ", jibie=" + jibie + ", hangye="
				+ hangye + ", page=" + page + ", rows=" + rows + ", shang="
				+ shang + ", xia=" + xia + ", pagecount=" + pagecount
				+ ", pianyi=" + pianyi + "]";
	}
	
}
