package br.com.livro.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.livro.domain.Carro;
import br.com.livro.domain.CarroService;
import br.com.livro.domain.ListaCarros;
import br.com.livro.util.ServletUtil;


@WebServlet("/carros/*")
public class CarrosServlet extends HttpServlet {

	
	private static final long serialVersionUID =1L;
	private CarroService carroService = new CarroService();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		//Convers�o de uma lista para JSON
		List<Carro> carros =  carroService.getCarros();
		ListaCarros lista = new ListaCarros();
		
		//Gera o JSON
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json =gson.toJson(lista);
		
		
		
		//Escreve JSON no response do servlet com application/json
		ServletUtil.writeJson(resp, json);
		
		
		//Convers�o Lista JSON para um objeto
		Gson gsonInverso = new Gson();
		List<Carro>listaInversa = (List<Carro>)gsonInverso.fromJson(json, ListaCarros.class);
		
		
		
		
		
	}
	
	
	
	

}