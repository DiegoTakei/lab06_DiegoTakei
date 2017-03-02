package exceptions;

public class UpgradeInvalidoException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UpgradeInvalidoException(){
		super("O usuário não possui x2p suficientes ou já é veterano.");
	}

}
