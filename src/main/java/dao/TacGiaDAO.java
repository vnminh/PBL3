package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mapper.SachMapper;
import mapper.TacGiaMapper;
import model.Sach;
import model.TacGia;

public class TacGiaDAO implements InterfaceDAO<TacGia> {

	@Override
	public ArrayList<TacGia> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TacGia selectById(TacGia t) {
		ArrayList<TacGia> arr = new ArrayList<TacGia>();
		try {
			Connection con = JDBCUtil.getConnection();
			String sql = "select * from tacgia\r\n"
					+ "where id = '" + t.getId() + "'";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println(sql);
			ResultSet rs = ps.executeQuery();
			TacGiaMapper tacGiaMapper = TacGiaMapper.getTacGiaMapper();
			arr = tacGiaMapper.mapListItem(rs);
			if(arr.size() > 0) return arr.get(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(TacGia t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertAll(ArrayList<TacGia> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(TacGia t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<TacGia> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TacGia t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
