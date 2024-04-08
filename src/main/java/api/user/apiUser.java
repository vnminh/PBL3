package api.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import dao.SachDao;
import model.Sach;
@WebServlet(urlPatterns = "/api/user/*")
public class apiUser extends HttpServlet {
	SachDao sachDao = SachDao.getSachDao();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;
		try {
			url = request.getRequestURL().toString();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(url);
		if(url.contains("/getNewestItem")) {
			getNewestItems(request, response);
		}
		else if(url.contains("/selectByText")) {
			selectByText(request, response);
		}
		else if(url.contains("/selectByKindOfBook")) {
			selectByKindOfBook(request, response);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	protected void getNewestItems(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<Sach> list = (ArrayList<Sach>) session.getAttribute("listNewest");
		if(list == null) {
			list = sachDao.selectNewestItem();
			session.setAttribute("listNewest", list);
		}
		Gson gson = new Gson();
		String json = gson.toJson(list);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
	}
	
	protected void selectByText(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long page = Long.parseLong(request.getParameter("page"));
		Long size = Long.parseLong(request.getParameter("size"));
		String txt = request.getParameter("txt");
		if(txt == null) txt = "";
		txt = "%" + txt + "%";
		ArrayList<Sach> list = sachDao.selectWithText(page, size, txt);
		Gson gson = new Gson();
		String json = gson.toJson(list);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
	}
	
	protected void selectByKindOfBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long page = Long.parseLong(request.getParameter("page"));
		Long size = Long.parseLong(request.getParameter("size"));
		String theloai = request.getParameter("theloai");
		if(theloai == null) theloai = "";
		ArrayList<Sach> list = sachDao.selectWithKindOfBook(page, size, theloai);
		Gson gson = new Gson();
		String json = gson.toJson(list);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
	}
	
}
