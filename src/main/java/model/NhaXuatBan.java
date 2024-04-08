package model;

public class NhaXuatBan {
	String id;
	String tenNxb;
	public NhaXuatBan() {
		super();
	}
	public NhaXuatBan(String id, String tenNxb) {
		super();
		this.id = id;
		this.tenNxb = tenNxb;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTenNxb() {
		return tenNxb;
	}
	public void setTenNxb(String tenNxb) {
		this.tenNxb = tenNxb;
	}
	
	
}
