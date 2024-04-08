package model;

public class TacGia {
	String id;
	String ten;
	
	
	public TacGia() {
		super();
	}


	public TacGia(String id, String ten) {
		super();
		this.id = id;
		this.ten = ten;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}
	
}
