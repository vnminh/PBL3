package mapper;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.TacGia;

public class TacGiaMapper implements InterfaceMapper<TacGia> {
	private static TacGiaMapper tacGiaMapper = null;
	public static TacGiaMapper getTacGiaMapper() {
		if(tacGiaMapper == null) tacGiaMapper = new TacGiaMapper();
		return tacGiaMapper;
	}

	@Override
	public ArrayList<TacGia> mapListItem(ResultSet rs) {
		ArrayList<TacGia> arr = new ArrayList<TacGia>();
		try {
			while(rs.next()) {
				TacGia tacGia = new TacGia();
				tacGia.setId(rs.getString("id"));
				tacGia.setTen(rs.getString("tentacgia"));
				arr.add(tacGia);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return arr;
	}

}
