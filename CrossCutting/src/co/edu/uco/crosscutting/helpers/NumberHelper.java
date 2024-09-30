package co.edu.uco.crosscutting.helpers;

public class NumberHelper {
    private static final int CERO_INT = 0;
    private static final double CERO_DOUBLE = 0.0;

    public static boolean isNull(Integer a) {
        return a == null;
    }

    public static boolean isNull(Double a) {
        return a == null;
    }

    public static boolean isNull(Long a) {
        return a == null;
    }

    public static int getDefault(Integer number, Integer defaultValue) {
        return (number == null) ? CERO_INT : number;
    }

    public static double getDefault(Double number, Double defaultValue) {
        return (number == null) ? CERO_DOUBLE : number;
    }

    public static long getDefault(Long number, Long defaultValue) {
        return (number == null) ? 0L : number;
    }

    public static double sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double sumar(long a, long b) {
        return a + b;
    }

    public static double restar(int a, int b) {
        return a - b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double restar(long a, long b) {
        return a - b;
    }

    public static double multiplicar(int a, int b) {
        return a * b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double multiplicar(long a, long b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return (double) a / b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return a / b;
    }

    public static double dividir(long a, long b) {
        if (b == 0) {
            throw new ArithmeticException("Error: División por cero no permitida.");
        }
        return (double) a / b;
    }

    public static double elevar(int base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static double elevar(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static double elevar(long base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean esPrimo(long num) {
        if (num <= 1) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static double valorAbsoluto(int num) {
        return Math.abs(num);
    }

    public static double valorAbsoluto(double num) {
        return Math.abs(num);
    }

    public static double valorAbsoluto(long num) {
        return Math.abs(num);
    }

    // Nuevo método para verificar si un número es negativo
    public static boolean esNegativo(int num) {
        return num < 0;
    }

    public static boolean esNegativo(double num) {
        return num < 0;
    }

    public static boolean esNegativo(long num) {
        return num < 0;
    }

    // Método para convertir texto en número
    public static Number convertirTextoANumero(String texto) {
        try {
            if (texto.contains(".")) {
                return Double.parseDouble(texto);
            } else {
                return Long.parseLong(texto);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("El texto no es un número válido: " + texto);
        }
    }

    // Método para verificar si un número está dentro de un rango
    public static boolean estaEnRango(double numero, double limiteInferior, double limiteSuperior, boolean incluirInferior, boolean incluirSuperior) {
        if (incluirInferior && incluirSuperior) {
            return numero >= limiteInferior && numero <= limiteSuperior;
        } else if (incluirInferior) {
            return numero >= limiteInferior && numero < limiteSuperior;
        } else if (incluirSuperior) {
            return numero > limiteInferior && numero <= limiteSuperior;
        } else {
            return numero > limiteInferior && numero < limiteSuperior;
        }
    }

    public static void main(String[] args) {
        System.out.println("Suma: " + sumar(10, 5));
        System.out.println("Resta: " + restar(10.5, 5));
        System.out.println("Multiplicación: " + multiplicar(10, 3));
        System.out.println("División: " + dividir(10, 2));
        System.out.println("10 elevado a 2: " + elevar(10, 2));
        System.out.println("¿Es primo 7?: " + (esPrimo(7) ? "Sí" : "No"));
        System.out.println("Valor absoluto de -15: " + valorAbsoluto(-15));
        System.out.println("¿Es negativo -10?: " + esNegativo(-10));
        System.out.println("¿Texto convertido a número: " + convertirTextoANumero("123.45"));
        System.out.println("¿Está en rango [1, 5)?: " + estaEnRango(3, 1, 5, true, false));
    }
}
