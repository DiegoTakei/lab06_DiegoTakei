package exceptions;

public class UpgradeInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpgradeInvalidoException(){
		super("O usu�rio n�o possui x2p suficientes ou j� � veterano.");
	}

}
