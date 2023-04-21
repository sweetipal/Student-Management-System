package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conn.DBConnect;
import com.dao.StudentDao;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		StudentDao dao = new StudentDao(DBConnect.getConn());
		boolean f = dao.deleteStudent(id);
		HttpSession session = req.getSession();

		if (f) {
			session.setAttribute("succMsg", "Student Details delete Successfully..");
			resp.sendRedirect("index.jsp");

			// System.out.println("student details submit successfully..");

		} else {
			session.setAttribute("errorMsg", "something wrong on server...");
			resp.sendRedirect("index.jsp");

			// System.out.println("something wrong on server...");

		}
	}

}
