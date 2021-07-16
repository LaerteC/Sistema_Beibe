/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

/**
 *
 * @author laert
 */
public class ServicoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	
	public ServicoException(String msg,Integer codigo) {
		
		super(msg);
		
		this.codigo=codigo;
		
	}
	public Integer getCodigo() {
		
		return codigo;
	}

}

