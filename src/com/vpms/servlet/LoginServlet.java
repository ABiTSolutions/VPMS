package com.vpms.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vpms.dbConnection.DBConnection;
import com.vpms.queries.Queries;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	Connection conn = DBConnection.getConnection();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = null;
		String password = null;
		userName = request.getParameter("username");	
		password = request.getParameter("password");
		String pass = null;
		PreparedStatement ps = null;
		ResultSet rs         = null;
		
		try {
			ps = conn.prepareStatement(Queries.queryCheckLoginDetails);	
			ps.setString(1, userName);
			//ps.setString(2, password);
			rs = ps.executeQuery();	
			if(rs.next()){
				 pass = rs.getString("Password");				 
				 if(pass.equals(password)) {
					 	String uName = userName.substring(0, 1).toUpperCase() + userName.substring(1);
						response.sendRedirect("index.jsp?name="+uName);
					} else {
						response.sendRedirect("login.jsp");	
					}				 
			} else {
				response.sendRedirect("login.jsp");	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
