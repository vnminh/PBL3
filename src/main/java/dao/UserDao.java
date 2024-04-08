package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import mapper.UserMapper;
import model.User;

public class UserDao implements InterfaceDAO<User> {
	private static UserDao userDao = null;
	public static UserDao getUserDao() {
		if(userDao == null) userDao = new UserDao();
		return userDao;
	}

	@Override
	public ArrayList<User> selectAll() {
		Connection con = JDBCUtil.getConnection();
		ArrayList<User> res = new ArrayList<User>();
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return res;
	}

	@Override
	public User selectById(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(User user) {
		Connection con = JDBCUtil.getConnection();
		try {
			String sql = "INSERT INTO users (id, ten, sodienthoai, email, matkhau, role, maxacthuc, trangthaixacthuc) \r\n"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, false);";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getId());
			ps.setString(2, user.getTen());
			ps.setString(3, user.getSoDienThoai());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getMatKhau());
			ps.setString(6, user.getRole());
			ps.setString(7, user.getMaXacThuc());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	public String getMaXacThuc(String userId) {
		Connection con = JDBCUtil.getConnection();
		try {
			String sql = "select maxacthuc from users\r\n"
					+ "where users.id=" + userId;
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return rs.getString("maxacthuc");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void  setTrangThaiXacThucTrue(String userId) {
		Connection con = JDBCUtil.getConnection();
		try {
			String sql =  "UPDATE users\r\n"
					+ "SET trangthaixacthuc = true\r\n"
					+ "WHERE users.id = ?;\r\n";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public User checkEmailPassAndStatus(String email,String password) {
		Connection con = JDBCUtil.getConnection();
		User user = null;
		User res = null;
		try {
			String sql = "SELECT *  from users\r\n"
					+ "where users.email = ? AND users.matkhau = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			UserMapper userMapper = UserMapper.getUserMapper();
			ArrayList<User> arr = userMapper.mapListItem(rs);
			if(arr.size() > 0) {
				return arr.get(0);
			}
 		}catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public int insertAll(ArrayList<User> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<User> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(User t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
