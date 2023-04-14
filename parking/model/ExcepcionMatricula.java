package parking.model;

public class ExcepcionMatricula extends RuntimeException {
	private static final String MENSAJE="matricula no valida";
	public ExcepcionMatricula() {
		super(MENSAJE);
		
	}

	public ExcepcionMatricula(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionMatricula(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionMatricula(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ExcepcionMatricula(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
