package mapper;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.Sach;

public class SachMapper implements InterfaceMapper<Sach> {
	private static SachMapper sachMapper = null;
	
	public static SachMapper getSachMapper() {
		if(sachMapper == null) {
			sachMapper = new SachMapper();
		}
		return sachMapper;
	}
	
	public SachMapper() {
		super();
	}

	@Override
	public ArrayList<Sach> mapListItem(ResultSet rs) {
		ArrayList<Sach> result = new ArrayList<Sach>();
		Sach sach;
		try {
			while(rs.next()) {
				sach = new Sach();
				sach.setId(rs.getString("id"));
				sach.setTen(rs.getString("ten"));
				sach.setSoLuongNhap(rs.getInt("soluongnhap"));
				sach.setSoLuongBan(rs.getInt("soluongban"));
				sach.setIdNxb(rs.getString("idnxb"));
				sach.setMoTaSach(rs.getString("motasach"));
				sach.setSoTrang(rs.getInt("sotrang"));
				sach.setLanXuatBan(rs.getInt("lanxuatban"));
				sach.setIdTacGia(rs.getString("idtacgia"));
				sach.setIdTheLoai(rs.getString("idtheloai"));
				sach.setSoSaoTB(rs.getDouble("sosaotb"));
				sach.setNgayThem(rs.getTimestamp("ngaythem"));
				sach.setUrlImage(rs.getString("urlimage"));
				sach.setGiaBan(rs.getDouble("giaban"));
				sach.setGiaNhap(rs.getDouble("gianhap"));
				sach.setPhanTramGiamGia(rs.getDouble("phantramgiamgia"));
				result.add(sach);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
