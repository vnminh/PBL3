package mapper;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.NhaXuatBan;

public class NhaXuatBanMapper implements InterfaceMapper<NhaXuatBan>{

	private static NhaXuatBanMapper nhaXuatBanMapper = null;
	public static NhaXuatBanMapper getNhaXuatBanMapper() {
		if(nhaXuatBanMapper == null) nhaXuatBanMapper = new NhaXuatBanMapper();
		return nhaXuatBanMapper;
	}
	
	@Override
	public ArrayList<NhaXuatBan> mapListItem(ResultSet rs) {
		ArrayList<NhaXuatBan> arr = new ArrayList<NhaXuatBan>();
		try {
			while(rs.next()) {
				NhaXuatBan nxb = new NhaXuatBan();
				nxb.setId(rs.getString("id"));
				nxb.setTenNxb(rs.getString("tennxb"));
				arr.add(nxb);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return arr;
	}
	
}
