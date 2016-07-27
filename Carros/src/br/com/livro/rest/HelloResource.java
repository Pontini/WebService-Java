package br.com.livro.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.livro.domain.CarroService;
import br.com.livro.domain.Response;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class HelloResource {

	
	@GET
	
	@Produces(MediaType.TEXT_HTML+";charset=utf8")
	@Consumes(MediaType.TEXT_HTML)
	public String helloHTML(){
		
		return "<b>Olá mundo HTML!</b>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloTextPlain(){
		
		return "Olá mundo texto!";
	}
	
	@GET
	@Consumes({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
	@Produces({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
	public String helloXML(){
		
		return "Olá mundo XML";
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response helloJSON(){
		
		return Response.ok("Olá mundo JSON !");
	}
	

}
