package co.edu.uco.crosscutting.helpers;

public class GenericNumberHelper {

	private static final int CERO_INT = 0;
	private static final double CERO_DOUBLE = 0.0;

	public static <T extends Number> boolean isNull(T number) {
		return number == null;
	}

	public static <T extends Number> T getDefault(T number, T defaultValue) {
		return (number == null) ? defaultValue : number;
	}

	public static <T extends Number> double sumar(T a, T b) {
		return a.doubleValue() + b.doubleValue();
	}

	public static <T extends Number> double restar(T a, T b) {
		return a.doubleValue() - b.doubleValue();
	}

	public static <T extends Number> double multiplicar(T a, T b) {
		return a.doubleValue() * b.doubleValue();
	}

	public static <T extends Number> double dividir(T a, T b) {
		if (b.doubleValue() == 0) {
			throw new ArithmeticException("Error: División por cero no permitida.");
		}
		return a.doubleValue() / b.doubleValue();
	}

	public static <T extends Number> double elevar(T base, int exponente) {
		return Math.pow(base.doubleValue(), exponente);
	}

	public static <T extends Number> boolean esPrimo(T num) {
		long value = num.longValue();
		if (value <= 1)
			return false;
		for (long i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public static <T extends Number> double valorAbsoluto(T num) {
		return Math.abs(num.doubleValue());
	}

	public static <T extends Number> boolean esNegativo(T num) {
		return num.doubleValue() < 0;
	}

	public static <T extends Number> boolean estaEnRango(T number, T min, T max, boolean incluyeMin,
			boolean incluyeMax) {
		double num = number.doubleValue();
		double minVal = min.doubleValue();
		double maxVal = max.doubleValue();

		boolean cumpleMin = incluyeMin ? num >= minVal : num > minVal;
		boolean cumpleMax = incluyeMax ? num <= maxVal : num < maxVal;

		return cumpleMin && cumpleMax;
	}

}
