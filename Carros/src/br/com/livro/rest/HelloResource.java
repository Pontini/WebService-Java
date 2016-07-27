package br.com.livro.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import br.com.livro.domain.CarroService;
import br.com.livro.domain.Response;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


//@PATH - Configura a classe

//@@Produces define o tipo de conte�do que o m�todo retorna

//@Consumes Define o conte�do que o m�todo  consome. 

//Desta forma, o JERSEY consegue automaticamente fazer as convers�es necess�rias com base na requisi��o.


//AVISO: Vale ressaltar que as anota��es @consumes e @PRODUCES podem ser definidas de forma global na classe ou
// em cada m�todo para customizar alguma configura��o. Por exemplo, voc� pode colocar uma anota��o no n�vel da
//classe e dizer que todos os m�todos consomem e retornam JSON. Caso necess�rio, voc� pode sobreescrever esta configura��o em algum m�todo;




@Path("/hello")
public class HelloResource {

	
	
	
	@GET
	@Produces(MediaType.TEXT_HTML+";charset=utf8")
	@Consumes(MediaType.TEXT_HTML)
	public String helloHTML(){
		
		return "<b>Ol� mundo HTML!</b>";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloTextPlain(){
		
		return "Ol� mundo texto!";
	}
	
	@GET
	@Consumes({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
	@Produces({MediaType.APPLICATION_XML,MediaType.TEXT_XML})
	public String helloXML(){
		
		return "Ol� mundo XML";
	}
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response helloJSON(){
		
		return Response.ok("Ol� mundo JSON !");
	}
	

}
