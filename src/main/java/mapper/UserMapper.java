package mapper;

import java.sql.ResultSet;
import java.util.ArrayList;

import model.User;

public class UserMapper implements InterfaceMapper<User>{
	private static UserMapper userMapper = null;
	public static UserMapper getUserMapper() {
		if(userMapper == null) {
			userMapper = new UserMapper();
		}
		return userMapper;
	}
	@Override
	public ArrayList<User> mapListItem(ResultSet rs) {
		ArrayList<User> result = new ArrayList<User>();
		User user;
		try {
			while(rs.next()) {
				user = new User();
				user.setId(rs.getString("id"));
				user.setTen(rs.getString("ten"));
				user.setSoDienThoai(rs.getString("sodienthoai"));
				user.setEmail(rs.getString("email"));
				user.setMatKhau(rs.getString("matkhau"));
				user.setRole(rs.getString("role"));
				user.setTrangThaiXacThuc(rs.getBoolean("trangthaixacthuc"));
				result.add(user);
			}	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
