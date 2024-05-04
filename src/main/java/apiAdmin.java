package api.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.hibernate.Session;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dao.UserDao;
import model.User;
import modelApi.ChiTietDonHangSerializer;
import modelApi.ChiTietGioHangSerializer;
import modelApi.DonHangSerializer;
import modelApi.SachSerializer;
import modelApi.TheLoaiSerializer;
import util.HibernateUtil;

@WebServlet(urlPatterns = "/api/admin/*")
public class apiAdmin extends HttpServlet{
	static private UserDao userDao = new UserDao().getUserDao();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = req.getRequestURL().toString();
		System.out.println(url);
		if (url.contains("/getAllUser"))
		{
			getAllUser(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(req, resp);
	}
	private void getAllUser(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		HttpSession httpsess = req.getSession();
		Session hibersess = HibernateUtil.getSessionFactory().openSession();
		List<User>li =  (List<User>)httpsess.getAttribute("listAllUser");
		if (li == null)
		{
			li = userDao.selectAll(hibersess);
			httpsess.setAttribute("listAllUser", li);
		}
		GsonBuilder gb = new GsonBuilder();
    	gb.registerTypeAdapter(model.Sach.class, new SachSerializer());
    	gb.registerTypeAdapter(model.ChiTietDonHang.class, new ChiTietDonHangSerializer());
    	gb.registerTypeAdapter(model.ChiTietGioHang.class, new ChiTietGioHangSerializer());
    	gb.registerTypeAdapter(model.TheLoai.class, new TheLoaiSerializer());
    	gb.registerTypeAdapter(model.DonHang.class, new DonHangSerializer());
    	Gson gson = gb.create();
    	String json = gson.toJson(li);
    	resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
        out.print(json);
        out.flush();
        hibersess.close();
	}
}
