package mockExamCopia;

public class ExcepcionPlato extends RuntimeException {

	private static String MENSAJE= "Precio no valido";
	public ExcepcionPlato() {
		super(MENSAJE);
	}

	public ExcepcionPlato(String message) {
		super(message);
	}

	public ExcepcionPlato(Throwable cause) {
		super(cause);
	}

	public ExcepcionPlato(String message, Throwable cause) {
		super(message, cause);
	}

	public ExcepcionPlato(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
