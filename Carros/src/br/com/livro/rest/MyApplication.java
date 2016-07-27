package br.com.livro.rest;



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Application;


public class MyApplication  extends Application{
	

	@Override
	public  Map<String,Object>getProperties(){
		
		Map<String, Object> proprerties = new HashMap<>();
		//Configura o pacote para fazer scan das classes com anotações REST. PELO QUE ENTENDO, DEVEM TODAS CLASSES ESTAR DENTRO DO PACOTE
		proprerties.put("jersey.config.server.provider.packages", "br.com.livro");
		
		return proprerties;
	}
	
	
	

}
