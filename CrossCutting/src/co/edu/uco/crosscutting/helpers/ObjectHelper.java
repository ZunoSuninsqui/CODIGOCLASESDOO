package co.edu.uco.crosscutting.helpers;

public class ObjectHelper {

	private ObjectHelper() {

	}

	public static <O> boolean isNull(final O object) { //Final dice que no se va a cambiar ninguna referencia
		return object == null;
	}

	public static <O> O getDefault(final O object, final O defaultObject) { //Final dice que no se va a cambiar ninguna referencia
		return isNull(object) ? defaultObject : object;
		
	}
}
