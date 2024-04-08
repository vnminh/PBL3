package model;

import java.sql.Date;

import dao.UserDao;



public class User {
	private String id;
	private String ten;
	private String soDienThoai;
	private String email;
	private String matKhau;
	private String role;
	private String maXacThuc;
	private boolean trangThaiXacThuc;
	public User() {
		
	}

	public User(String id, String ten, String soDienThoai, String email, String matKhau, String role,
			String maXacThuc, boolean trangThaiXacThuc) {
		super();
		this.id = id;
		this.ten = ten;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.matKhau = matKhau;
		this.role = role;
		this.maXacThuc = maXacThuc;
		this.trangThaiXacThuc = trangThaiXacThuc;
	}

	public User(String ten, String soDienThoai, String email, String matKhau, String role, String maXacThuc,
			boolean trangThaiXacThuc) {
		super();
		this.ten = ten;
		this.soDienThoai = soDienThoai;
		this.email = email;
		this.matKhau = matKhau;
		this.role = role;
		this.maXacThuc = maXacThuc;
		this.trangThaiXacThuc = trangThaiXacThuc;
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

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMaXacThuc() {
		return maXacThuc;
	}

	public void setMaXacThuc(String maXacThuc) {
		this.maXacThuc = maXacThuc;
	}

	public boolean isTrangThaiXacThuc() {
		return trangThaiXacThuc;
	}

	public void setTrangThaiXacThuc(boolean trangThaiXacThuc) {
		this.trangThaiXacThuc = trangThaiXacThuc;
	}
	
	
	public static void main(String[] args) {
		User user= new User("1","Ngo Van Danh","123","abc@gmail.com","zddanh","kh","123456",false);
		UserDao userDao  = new UserDao();
		userDao.insert(user);
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", ten=" + ten + ", soDienThoai=" + soDienThoai + ", email=" + email + ", matKhau="
				+ matKhau + ", role=" + role + ", maXacThuc=" + maXacThuc + ", trangThaiXacThuc=" + trangThaiXacThuc
				+ "]";
	}
	
	
	
}
