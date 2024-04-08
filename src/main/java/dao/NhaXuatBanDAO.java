package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mapper.NhaXuatBanMapper;
import mapper.TacGiaMapper;
import model.NhaXuatBan;
import model.TacGia;

public class NhaXuatBanDAO implements InterfaceDAO<NhaXuatBan> {

	@Override
	public ArrayList<NhaXuatBan> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NhaXuatBan selectById(NhaXuatBan t) {
		ArrayList<NhaXuatBan> arr = new ArrayList<NhaXuatBan>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "select * from nhaxuatban\r\n"
					+ "where id = '"+ t.getId() + "'";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(sql);
			ResultSet rs = ps.executeQuery();
			NhaXuatBanMapper nhaXuatBanMapper= NhaXuatBanMapper.getNhaXuatBanMapper();
			arr = nhaXuatBanMapper.mapListItem(rs);
			if(arr.size() > 0) return arr.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(NhaXuatBan t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAll(ArrayList<NhaXuatBan> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(NhaXuatBan t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<NhaXuatBan> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(NhaXuatBan t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
