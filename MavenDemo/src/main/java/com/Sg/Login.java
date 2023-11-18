package com.Sg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Sg.model.dao.DaoDb;
import com.Sg.model.data.ModelClass;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("uid"));
		DaoDb dbobj=new DaoDb();
		//returning the obj from DaoClass
		ModelClass mdobj=dbobj.getdata(id);
		request.setAttribute("objmc", mdobj);
		
		RequestDispatcher rd=request.getRequestDispatcher("Welcome.jsp");
		rd.forward(request, response);
		
	}

	

}
