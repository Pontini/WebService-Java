package br.com.livro.rest;




import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Application;


public class MyApplication  extends Application{
	
	
	@Override
	public  Map<String,Object>getProperties(){
		
		Map<String, Object> proprerties = new HashMap<>();
		
		
		//Como jersy trabalha com anotações, dizemos em qual pacote está as classes .. 
		//Neste caso, o Jersey vai rastrear todas as classes que estão dentro do pacote br.com.livro
		
		proprerties.put("jersey.config.server.provider.packages", "br.com.livro");
		
		return proprerties;
	}
	
	
	

}
