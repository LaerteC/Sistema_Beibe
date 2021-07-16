/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.List;

/**
 *
 * @author laert
 */
public class ValidacaoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> erros;
	
	public ValidacaoException(String msg,List<String> erros) {
		
		super(msg);
		
		this.erros=erros;
		
	}
	public List<String> getErros() {
		
		return erros;
	}
	
	

}
