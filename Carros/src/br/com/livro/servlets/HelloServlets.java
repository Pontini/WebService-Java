package br.com.livro.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloServlets extends HttpServlet{
	
	private static final long serialVersionUID =1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.getWriter().print("Olá mundo Servlet\n");
		
		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");
		
		resp.getWriter().print("Olá mundo "+nome+ " " +sobrenome);
		
		//Execute isto no navegador
		//http://localhost:8080/Carros/hello?nome=Ewerton%20&sobrenome=Pontini
		//http://localhost:8080/Carros/hello?nome=Ewerton%20&sobrenome=Pontini
	
	
	}
	

}
