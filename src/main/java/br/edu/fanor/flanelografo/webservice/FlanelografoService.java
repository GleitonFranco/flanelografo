package br.edu.fanor.flanelografo.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class FlanelografoService {
	
	@WebMethod(operationName="consultaSala")
	public String consultaSala(@WebParam(name="curso") String curso) {
		return "Lab-Inf-4";
	}
}
